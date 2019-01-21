SELECT * 
FROM EMP;

select job
from emp;

-- 그룹화의 간단한 시작
--dinstinct는 중복된 것들을 그룹화 하여 보여주는 것

select distinct job
from emp;

--위와의 차이점을 보자
--ename의 컬럼을 보면 중복되는 이름이 하나도 없다
-- 두개의 컬럼 전체를 보면서 중복되는 것이 있는지 살핀다
-- 그래서 보통 하나의 컬럼을 대상으로 distinct를 사용한다 -- 아님 중복키를 사용했을때(?)
select distinct ename,job
from emp;

--선수들의 정보를 모두 조회하시오
select *
from player;

-- alias 부여 - 별칭(반드시 알아야함!!)
-- 글자들 사이 띄어쓰기가 존재한다면? 띄어쓰기는 구분자이므로 " " 를 사용하여 하나의 문장으로 인식되도록 한다
select empno 사원번호, ename 사원이름, mgr "사원의 직속상사번호", deptno 부서번호
from emp;

-- as를 붙이는 것과 아닌 것의 결과 차이는 없다 - 가독성을 위해 붙여주는게 좋다
select empno as 사원번호, ename as 사원이름, mgr as "사원의 직속상사번호", deptno as 부서번호
from emp;


-- " " - 쌍따옴표 안에 넣어줘야 대소문자 구분이되어 실행됨
-- 쌍따옴표 없다면 db상에서는 대소문자 구분을 안하므로 모두 대문자로 실행된다
select deptno 부서번호, dname "name", loc "Location", deptno as "부서Number"
from dept;


select player_name "선수 이름", position "포지션 위치", height 키, weight 몸무게
from player;


-- 산술 연산자와 연산자
-- 사칙연산 & 괄호
select ename, sal, sal+12*1000
from emp;


--!!!!!중요!!!!!
-- 반올림
-- round - 두번째 매개변수가 - 자릿수 (자릿수 다음 자리에서 반올림한다) 
select ename, sal/12, round(sal/12, 2)
from emp;


--1. 선수들의 키에서 몸무게를 뺀 값을 구하시오
--결과)
--이름, 키-몸무게
--HEIGHT-WEIGHT 처럼 컬럼간의 연산가능
-- "키-몸무게" 에서 쌍따옴표 생략하면 오류남!! 
select player_name 이름, height-weight "키-몸무게"
from player;

--2. BMI 비만지수
--BMI지수= 몸무게(kg) ÷ ( 신장(m) × 신장(m) ) 이다. -- 신장 m(미터) 표현이므로 0.01을 곱하여 미터로 바꾸고 계산한다
--선수들의 키와 몸무게를 이용해서 BMI를 측정하시오
--결과)
--이름, BMI 비만지수
--소수점 3자리에서 반올림하여 둘째자리까지 표현한다
select player_name 이름, round(weight / (( height*0.01 )*( height*0.01 )) , 2 ) "BMI 비만지수"
from player;


select *
from player
where player_name = '우르모브';


-- < 합성 연산자 > concatenation
--   ||  (수직바, or 연산자)
--- 문자와 문자를 연결하는 경우 2개의 수직바( || )에 의해 이루어진다
--- 컬럼과 문자 또는 다른 컬럼과 연결시킬 수 있다
--- 문자 표현식의 결과에 의해 새로운 컬럼을 생성한다

select *
from emp;

-- 별칭에서만 " " 쌍따옴표로 표현
-- 문자에는 ' ' 싱글따옴표만 존재- 문자에 쌍따옴표 존재할수 없음
select empno || '사원번호는 ' || ename || '님이며 직업은 ' || job || '입니다' "자기 소개",
empno || ename, '컬럼에 없는 글자만으로도 ' || '만들수 있어'
from emp;

select *
from player;


--문제> - 혼자못함, 혜선씨가 도와줌
--선수들의 출력
--출력 형태
--선수명 선수, 키 cm, 몸무게 kg
--
--컬럼명   체격정보
--내용      박지성 선수, 176cm, 70 kg
--띄어 쓰기 신경쓰자!! - ' ' 문자열 안에서 띄어쓰기를 해준다

select player_name || ' 선수, ' || height || ' cm, ' || weight || ' kg' 체격정보 
from player;


insert into player
(player_id, team_id, player_name, position, height, weight, back_no)
values('1997035', 'K02', '이운재', 'GK', 182, 82, 1);

commit;

delete from player
where player_id = '1997035';


select *
from player;

--count(*) : 전체 데이터 건수
select count(*)                          -- 를 사용하면 전제 선수 480명이라는 것을 조회 할수 있다
from player;

select count(*)
from player
where weight = 70;             --  몸무게 70 인 사람이 몇명인가

select *
from emp;


select count(*)
from emp
where job = 'CLERK';           -- 직업 CLERK 인 사람이 몇명인가



--< WHERE 문 >
--
--표현식
--SELECT [DISTINCT/ALL] 컬럼명 [ALIAS명]
--FROM 테이블명
--WHERE 조건식;
--
--WHERE 절은 FROM 절 다음에 위치하며
--조건식은 아래 내용으로 구성된다
--- 컬럼명
--- 비교연산자
--- 문자, 숫자, 표현식
--- 비교 컬럼명


-- 비교연산자
SELECT *
FROM EMP
WHERE SAL >= 3000;


--사원 테이블에서 부서가 10번인 사원들만 조회하시오 - 전체 정보를 보여준다
SELECT *
FROM EMP
WHERE DEPTNO = 10;



--문제>
--급여가 1500이하인 사원의 사원 번호, 사원명, 급여를 출력하는 SQL문을 작성하시오
--(출력)
--EMPNO   ENAME   SAL
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL <= 1500;


SELECT *
FROM PLAYER;
-- 또는 왼쪽의 테이블을 열어 컬럼명을 확인하고 필요한 정보를 조회하자!!!

--문제>
--키가 170센티미터 이상인 선수의 정보를 조회하시오
--선수이름, 포지션, 백넘버, 키
SELECT PLAYER_NAME AS 선수이름, POSITION AS 포지션, BACK_NO AS 백넘버, HEIGHT AS 키
FROM PLAYER
WHERE HEIGHT >= 170;


--사원 테이블에서 이름이 FORD인 사원의
-- 사원번호, 사원명, 급여 컬럼을 표시하시오
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE ENAME = 'FORD';

--위와의 차이
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE ENAME = FORD;                          --오류! - FORD라는 컬럼을 찾는 것(검은 글씨 컬럼명)

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE ENAME = 'ford';                    --출력되지않음 ' '안은(데이터는) 대소문자 구별    


--이름이 SMITH인 사원의
--사원번호, 사원명, 급여를 출력하시오
--EMPNO   ENAME  SAL
--7369	SMITH   800
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE ENAME = 'SMITH';


--선수들 중에 팀 아이디가 K02인 선수만 조회하시오
--선수이름   포지션    백넘버    키
--
--총 49개 나옴
SELECT PLAYER_NAME 선수이름, POSITION 포지션, BACK_NO 백넘버, HEIGHT 키
FROM PLAYER
WHERE TEAM_ID = 'K02';


--포지션이 미드필더(MF)인 선수들만 조회하시오
--PLAYER_NAME 	POSITION		BACK_NO		HEIGHT
--총 162개 나옴 
SELECT PLAYER_NAME, POSITION, BACK_NO, HEIGHT
FROM PLAYER
WHERE POSITION = 'MF'; 


-- 날짜 DATE 는 비교연산자를 사용하여
-- 1982년 1월 1일 이전에 입사한 사원을 출력한다
SELECT *
FROM EMP
WHERE HIREDATE <= '1982/01/01';
-- 11명 출력

SELECT *
FROM EMP
WHERE HIREDATE <= '1981/04/02';
-- 4명 출력

DESC EMP;

SELECT *
FROM EMP;

-- < IN 연산자 > 같은 컬럼에 대해서
-- IN(list) : 리스트에 있는 값 중에서 어느 하나라도 일치하면 된다
SELECT *
FROM EMP
WHERE COMM IN(300, 500, 1400);

SELECT *
FROM EMP
WHERE COMM IN(300, 500);

-- SALESMAN 과 ANALIST 를 찾는다
SELECT *
FROM EMP
WHERE JOB IN('SALESMAN', 'ANALYST' );
-- 또는 


-- DEPTNO 20과 30인 사람을 찾는다
SELECT *
FROM EMP
WHERE DEPTNO IN(20, 30); 


-- DEPTNO 20과 30인 사람들을 예외로 나머지 사람들을 찾아라
SELECT *
FROM EMP
WHERE DEPTNO NOT IN(20, 30); 


-- 괄호안에 null 값은 넣지말라 - null은 의미없는 자료이므로 최대한 배제하라




--7521이거나 7654이거나 7844인
--사원들을 검색하는 쿼리문을 IN연산자를 사용하여 구하시오
--EMPNO     SAL
--3명 나옴
SELECT EMPNO, SAL
FROM EMP
WHERE EMPNO IN(7521, 7654, 7844);


--사원번호가 7521도 아니고 7654도 아니고 7902도 아닌 사원들을 검색하는 쿼리문을 작성하시오
--EMPNO   ENAME
--9명 나옴
SELECT EMPNO, ENAME
FROM EMP
WHERE EMPNO NOT IN(7521, 7654, 7902);


--소속팀이 K02이거나 또는 K07인 선수들의 정보를 조회하시오
--선수이름  포지션  백넘버  키
--100명 나옴
SELECT PLAYER_NAME 선수이름, POSITION 포지션, BACK_NO 백넘버, HEIGHT 키
FROM PLAYER
WHERE TEAM_ID IN('K02', 'K07');

SELECT *
FROM EMP;

--< LIKE 연산자 >
-- 성이 김인 사람을 찾거나 거주지가 서울인 사람을 찾을때 사용가능


-- LIKE '문자열'
-- 와일드 카드          의미
--  %            :      문자가 없거나, 하나 이상의 문자에 어떤 값이 와도 상관없이 찾는다 (0 개 이상의 어떤 문자)


-- 사람이름 중 M으로 시작하는 사람 찾기
SELECT *
FROM EMP
WHERE ENAME LIKE 'M%';

-- 중간에 A가 오거나, A앞에 아무것도 없는 것도 다찾는다
SELECT *
FROM EMP
WHERE ENAME LIKE '%A%';


--    _ (밑줄)	:	하나의 문자에 어떤 값이 상관없다 (1개인 단일 문자를 의미)

SELECT *
FROM EMP
WHERE ENAME LIKE '_L%';         -- 첫번째 한글자에 대해 어떤것이와도 상관없음, 두번째 글자는 L, 세번째 부터 어떤것이 와도 상관없음   


SELECT *
FROM EMP                                      
WHERE ENAME LIKE '_L___';      -- 다섯글자중 : 두번째 글자가 L인 사람만 나타남



--1. 사원 중에서 이름이 K로 시작하는 사원의
--사원번호와 이름을 출력하시오
--사원번호    사원명
--1명
SELECT EMPNO 사원번호, ENAME 사원명
FROM EMP
WHERE ENAME LIKE 'K%';


--2. 이름 중에 K를 포함하는 사원의
--사원번호와 이름을 출력하시오
--사원번호    사원명
--3명
SELECT EMPNO 사원번호, ENAME 사원명
FROM EMP
WHERE ENAME LIKE '%K%';

--3. 이름이 K로 끝나는 사원의
--사원번호와 이름을 출력하시오
--사원번호    사원명
--1명
SELECT EMPNO 사원번호, ENAME 사원명
FROM EMP
WHERE ENAME LIKE  '%K';


--4. 이름의 두 번쨰 글자가 A인 사원을 찾으시오
--모든 정보 표시
--3명
SELECT *
FROM EMP
WHERE ENAME LIKE '_A%';




-- <BETWEEN a AND B >
-- 급여가 2000부터 3000사이의 사원 조회
SELECT *
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;


SELECT *
FROM EMP;


SELECT *
FROM EMP
WHERE COMM BETWEEN 300 AND 1000;



--1. 사원 중에 1980년도에 입사한 사원을 출력하시오
--모든 정보를 표시하시오
--1명
-- 혼자 못품 WHY? 날짜 표현도 BETWEEN으로 가능하다 - 80/01/01 이라하기보다 1980/01/01처럼 확실히 표현해준다
SELECT *
FROM EMP
WHERE HIREDATE BETWEEN '1980/01/01' AND '1980/12/31';


SELECT *
FROM EMP
WHERE HIREDATE BETWEEN '80/01/01' AND '80/12/31';    --위와 비교하면 이건 ,2080/01/01도 조회되는 것

SELECT *
FROM PLAYER;


--2. 키가 170이상 180센티 이하인 선수들의 정보를 구하시오
--선수이름    포지션   국적   별명   키
--259명
SELECT PLAYER_NAME 선수이름, POSITION 포지션, NATION 국적, NICKNAME 별명, HEIGHT 키
FROM PLAYER
WHERE HEIGHT BETWEEN 170 AND 180;



-- < IS NULL >
--형식
--WHERE 대상컬럼 IS [연산자] NULL [비교값];

-- NULL 값과의 수치연산은 NULL 값을 리턴한다
-- NULL 값과의 비교연산은 거짓(FALSE)을 리턴한다
-- 어떤 값과 비교할 수도 없으며, 특정 값보다 크다, 적다라고 표현할 수 없다

SELECT *
FROM EMP
WHERE COMM = NULL;     -- 검색안됨




-- 사원 테이블에서 커미션 컬럼이 NULL인 사원을 출력하시오
-- 커미션을 받지 못하는 사원을 검색하시오
SELECT *
FROM EMP
WHERE COMM IS NULL;         -- NULL은 데이터타입만 알지 어떤 값이 들어갈지 확정이 안된 특이한 것 - IS NULL로 해야만 조회됨


-- 커미션을 받는 사원을 검색하시오
SELECT *
FROM EMP
WHERE COMM IS NOT NULL; 


-- NULL 값과의 수치연산은 NULL 값을 리턴한다
SELECT ENAME, SAL, SAL*12, SAL*NULL, SAL+NULL
FROM EMP;


-- NULL 값과의 비교연산은 거짓(FALSE)을 리턴한다
SELECT ENAME, SAL, SAL*12, SAL*NULL, SAL+NULL
FROM EMP
WHERE COMM>= NULL;


SELECT ENAME, SAL, SAL*12, SAL*NULL, SAL+NULL
FROM EMP
WHERE COMM IS NULL;



--1. 포지션이 NULL인 선수들을 조회하시오
--선수ID     선수영어이름    포지션    팀ID
--3명
SELECT PLAYER_ID 선수ID, PLAYER_NAME 선수영어이름, POSITION 포지션, TEAM_ID 팀ID
FROM PLAYER
WHERE POSITION IS NULL;


SELECT *
FROM EMP;

--2. 상관이 없는 사원을 검색하시오 -- 상관이라는 정보의 컬럼을 찾아야만 가능(분석)
--전체정보표시
--1명
SELECT *
FROM EMP
WHERE MGR IS NULL;



--< 논리 연산자 >
--AND     앞에 있는 조건과 뒤에 오는 조건이 참(TRUE)이 되면 결과도 참이 된다. 즉, 앞의 조건과 뒤의 조건을 동시에 만족해야 하는 것이다.
--
--OR	    앞의 조건이 참(TRUE) 이거나 뒤의 조건이 참(TRUE)이 되면 결과도 참(TRUE)이 된다. 즉, 앞뒤의 조건 중 하나만 참(TURE)이면 된다
--
--NOT   	뒤어 오는 조건에 반대되는 결과를 되돌려 준다.


-- AND 연산자
-- 1번 조건: 1O번 부서 소속인 사원
-- 2번 조건: 그리고 직급이 MANAGER인 사원
-- 그리고
--( 10번 부서 소속인데 직급이 MANAGER인 사원을 찾아줘 - 말의 순서로 먼저 말한 것을 1번조건으로 적어준다)
SELECT *
FROM EMP
WHERE DEPTNO = 10
AND JOB = 'MANAGER';


SELECT *
FROM EMP
WHERE DEPTNO = 30
AND JOB = 'SALESMAN'
AND SLA >= 1500;
-- AND는 필요하면 필요한만큼 수천번 적어도 된다

SELECT *
FROM PLAYER;

DESC PLAYER;




--소속팀이 삼성블루윙즈이거나(OR연산자) 전남드래곤즈에 소속된 선수들이어야 하고 포지션이 미드필더(MF)이어야 한다
--키는 170cm 이상이고 180이하여야 한다.
--33개
--
--- TEAM 테이블을 조회한다
--- 삼성블루윈즈 : K02
--- 전남 드래곤즈 : K07    임을 확인한다


SELECT *
FROM TEAM;

SELECT *
FROM PLAYER;


-- 문권씨가 알려준 방법
SELECT *
FROM PLAYER
WHERE TEAM_ID IN ('K02' , 'K07') 
AND  POSITION = 'MF'
AND HEIGHT BETWEEN 170 AND 180;


-- 17+16 = 33
--@ 전남 드래곤즈 MF 170~180
SELECT *
FROM PLAYER
WHERE TEAM_ID = 'K07'
AND  POSITION = 'MF'
AND HEIGHT >= 170 AND HEIGHT <=180;


--@ 삼성블루윙즈 MF 170~180
SELECT *
FROM PLAYER
WHERE TEAM_ID = 'K02'
AND  POSITION = 'MF'
AND HEIGHT >= 170 AND HEIGHT <=180;




-- 샘 --
--33명 나와야 되는데 66명이나옴  = 17 + 49
-- 일의 실행순서에 혼란이 와서임
-- MF 를 먼저찾고 -> 키 를 찾고 -> 팀 K07을 먼저 찾고 -> OR 연산자라 K02 인 전원을 찾는다
-- MF 와 키 조건 과 K07 은 다 AND로 이어지고 -> OR 인 K02
SELECT *
FROM PLAYER
WHERE TEAM_ID = 'K02' OR TEAM_ID = 'K07'  
AND  POSITION = 'MF'
AND HEIGHT >= 170 AND HEIGHT <=180;



-- 위와의 차이 - ()괄호
-- 33명 제대로 나옴
SELECT *
FROM PLAYER
WHERE (TEAM_ID = 'K02' OR TEAM_ID = 'K07')  -- ( ) 괄호는 연산자 우선순위 중 최우선이므로 문제 해결됨  
AND  POSITION = 'MF'
AND HEIGHT >= 170 AND HEIGHT <=180;


SELECT *
FROM EMP;


-- 사원 테이블에서 부서번호가 10이거나  -- 이거나 (OR 연산자 쓰라는 말)
-- 직급이 MANAGER인 사원을 출력하시오
-- 4명
SELECT *
FROM EMP
WHERE DEPTNO = 10
OR JOB = 'MANAGER';


--< 정리 >
--동일한 조건에 대해서 AND 연산을 하면
--조건에 모두 만족해야 하므로 로우의 개수가 줄어든다
--반면, OR연산을 사용하면 조건에 맞는 로우의 개수가 널어나게 된다.


--부서번호가 10번인 사원을 조회하시오
SELECT *
FROM EMP
WHERE DEPTNO = 10;


--부서번호가 10번이 아닌 사원들을 조회하시오
--아래 셋 모두 동일한 표현
SELECT *
FROM EMP
WHERE NOT DEPTNO = 10;   --NOT은 오라클 표준 연산자

SELECT *
FROM EMP
WHERE DEPTNO != 10;


SELECT *
FROM EMP
WHERE DEPTNO <> 10;  -- 가능한한 이 표현을  사용할 것!!!!(ISO 표준이므로)


-- 부서번호가 30, 30, 40인 사원들을 검색한것
-- 결과는 같아도 완전히 다른 의미!!! - 나중에 부서번호 50이 생긴다면 추가해줘야되는것
-- 말그래도 연산을 표현하라
SELECT *
FROM EMP
WHERE DEPTNO IN (20, 30, 40);


-- 이표현은 맞는 것 -- 부정연산자 NOT을 사용했으므로
-- IN 이라는 건 OR 연산자를 포함한것
SELECT *
FROM EMP
WHERE NOT DEPTNO IN (10);
--위의 것을 풀어쓴 것
SELECT *
FROM EMP
WHERE DEPTNO =10
OR DEPTNO = NULL;





--2000에서 3000 사이의 급여에 포함되지 않는 사원을 조회하시오
--전체 컬럼 표시
--8명
--- 하나는 BETWEEN 있고
--- 하나는 BETWEEN 없이
SELECT *
FROM EMP;

--- 하나는 BETWEEN 있고
-- 
SELECT *
FROM EMP
WHERE SAL NOT BETWEEN 2000 AND 3000;    -- 비트윈에서 반전시킨다

-- BETWEEN 하고 -> NOT 하면서 반전된 것
SELECT *
FROM EMP
WHERE NOT SAL BETWEEN 2000 AND 3000;     --  이 방법이 더 낫다!!! -- NOT을 컬럼앞에 붙이자!


--- 하나는 BETWEEN 없이
-- 혼자 못품
SELECT *
FROM EMP
WHERE SAL < 2000 OR SAL > 3000;    


SELECT *
FROM EMP
WHERE NOT SAL BETWEEN 100 AND 1000;


SELECT *
FROM EMP
WHERE SAL NOT BETWEEN 100 AND 1000;


SELECT *
FROM EMP
WHERE SAL>= 100
AND SAL <= 1000;





--삼성블루윙즈 소속인 선수들 중에서 - K02  
--포지션이 미드필더가 아니고,
--키가 175 이상 185 이하가 아닌
--선수들의 자료를 조회하시오
--8개
-- 혼자 못품
SELECT  *
FROM PLAYER 
WHERE TEAM_ID= 'K02'
AND NOT POSITION = 'MF' 
AND NOT HEIGHT BETWEEN 175 AND 185;   


SELECT *
FROM PLAYER;


--국적 컬럼이 NULL이 아닌 선수와 
--국적을 표시하시오
--
--선수이름 국적
--27명

-- NULL 이 아닌 데이터를 다찾아서 보여주는것  - 이 방법이 빠르고 좋다 - 가독성에서도 NOT NULL을 찾음을 바로 알수 있다
-- IS NOT NULL은 다같이 붙여쓴다
SELECT PLAYER_NAME 선수이름, NATION 국적
FROM PLAYER
WHERE NATION IS NOT NULL;

-- NULL이라는 국적의 사람을 모두찾고 -> 그걸 부정  ( 잘 사용하지 않는 방법 ) 
SELECT PLAYER_NAME 선수이름, NATION 국적
FROM PLAYER
WHERE NOT NATION IS NULL;


