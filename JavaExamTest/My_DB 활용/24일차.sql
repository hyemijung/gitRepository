SELECT SYSDATE
FROM DUAL;


-- 날짜 DATE 는, 년/월/일  시분초 의 개념이 모두 존재한다


-- 날짜의 년 월 일 시 분 초를 모두 보여주려면 TO_CHAR를 이용해 보여줄수 있다
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') 날짜
FROM DUAL;

-- 날짜끼리 빼면 : 일단위
-- 2019-01-24에서 하루를 빼준 것
SELECT SYSDATE -  TO_DATE('2019-01-23', 'YYYY-MM-DD') 일단위
FROM DUAL;
--1.43744212~~ 로 나온다 하루하고 시분초가 소수점 이하로 표현된 것


SELECT TO_DATE('2019-01-25 10:37:11', 'YYYY-MM-DD HH24:MI:SS')
        -  TO_DATE('2019-01-24 10:36:10', 'YYYY-MM-DD HH24:MI:SS') 일단위
FROM DUAL;




SELECT SYSDATE + 1
FROM DUAL;


--1초
--1분	 60초 
--1시간	 60분	
--1일	 24시간
--1년	 365일

-- 1분차이
--37:11            61초
--36:10
SELECT (TO_DATE('2019-01-24 10:37:11', 'YYYY-MM-DD HH24:MI:SS')
            -  TO_DATE('2019-01-24 10:36:10', 'YYYY-MM-DD HH24:MI:SS') ) * (24*60*60) 초단위
FROM DUAL;


SELECT TO_CHAR(TO_DATE('2019-01-23 10:36:10', 'YYYY-MM-DD HH24:MI:SS')
    ,'YYYY-MM-DD HH24:MI:SS') 초단위
FROM DUAL;


SELECT 24*60*60
FROM DUAL;
-- 결과 86400
-- 60초*60분*24시간 = 86400초 = 하루의 초



SELECT (TO_DATE('2019-01-24 11:40:10', 'YYYY-MM-DD HH24:MI:SS')
            -  TO_DATE('2019-01-24 10:40:10', 'YYYY-MM-DD HH24:MI:SS') ) * 24 시간단위
FROM DUAL;


SELECT (TO_DATE('2019-01-24 11:40:10', 'YYYY-MM-DD HH24:MI:SS')
            -  TO_DATE('2019-01-24 11:38:10', 'YYYY-MM-DD HH24:MI:SS') ) * (24*60) 분단위
FROM DUAL;



----------------------------------------------------------------------------------



-- < NULL 관련 함수 >

--NULL을 다른 값으로 변환하는 함수
-- NUL(NULL VALUE)

--[표현식]
--NVL(관심 컬럼 or 데이터, null 대신 들어갈 데이터)
--첫 번째 매개변수의 결과값이 null이면(~이면 : 가정법)
--두 번쨰 매개변수의 값을 출력한다

SELECT ENAME, SAL, COMM, JOB
FROM EMP;

DESC EMP;


-- 이건 실행안되야 함
SELECT ENAME, SAL, NVL(COMM, '널을 다른 값으로 표현하고자 하는 글'), JOB
FROM EMP;
--오류뜸
--"invalid number"
--*Cause:    The specified number was invalid.
-- COMM은 NUMBER(7,2)로 구성된 컬럼이다 -> 그래서 문자를 넣으니 오류난 것
-- 기존의 데이터를 분석해야 하는 것


--실행됨 - COMM이 NULL이네 -> NULL 대신 0 으로 채워짐 (COMM값이 NULL이 아니네 -> NULL이 아닌 그값을 채움)
SELECT ENAME, SAL, NVL(COMM, 0) comm, JOB
FROM EMP;


-- COMM이 NULL 이네 -> NULL 대신 100 으로 채워짐
-- 그러나 보통 NULL 일때 다른 수가 아닌 0으로 채운다
SELECT ENAME, SAL, NVL(COMM, 100) comm, JOB
FROM EMP;


-- COMM 컬럼값이 숫자니깐 0+34를 넣어도 가능
SELECT ENAME, SAL, NVL(COMM, 0+34) comm, JOB
FROM EMP;


-- 꼭 매개변수에 컬럼만 들어가는게 아니다! 
-- 문자의 최소단위는 데이터다
SELECT NVL(NULL, '아 NVL함수는 NULL에 관련해서 필요한 내용으로 변경하는거구나')
FROM DUAL;


-- 0은 여기서 싱글따옴표안에서 문자로 인식되는 데이터 -> 0은 NULL이 아니므로 첫번째 매개변수인 0으로 채워진 것
SELECT NVL('0', '아 NVL함수는 NULL에 관련해서 필요한 내용으로 변경하는거구나')
FROM DUAL;


SELECT 'sdf'
FROM DUAL;


-------------------------------------------------------

--선수 테이블에서 성남 일화천마(K08) 
--소속 선수의 이름과 포지션을 출력하는데,
--포지션이 없는 경우는 '없음'으로 표시한다
--선수명   POSITION   포지션
--45명

--분석1 > TEAM_ID 가 K08인 사람만 추출(선택)해야함 -> SUBSTR사용, 
--          TEAM_ID 데이터 타입 CAHR(문자), 
--분석2> 포지션이 없는경우 ->  NVL(POSITION, '없음') 포지션
-- 너무 꼬아서 생각함 -> 왜? 추출이라는 단어에 메몰됨 -> 단순 명료하게 생각해라!!!!
SELECT PLAYER_NAME 선수명, POSITION, NVL(POSITION, '없음') 포지션
FROM PLAYER
WHERE SUBSTR(TEAM_ID, 1, 3)= 'K08';


--민성씨가 고쳐준 것
-- TEAM_ID라는 컬럼이 있잖아 그냥 그 컬럼을 선택해서 구체적 컬럼값 'KO8'만 찾도록 하면된다
SELECT PLAYER_NAME AS 선수명, POSITION, NVL(POSITION, '없음') AS 포지션
FROM PLAYER
WHERE TEAM_ID= 'K08';



--사원테이블에서 사원의 연봉에 커미션을 더한 결과를 출력하시오
--COMM컬럼은  COMM에 대한 데이터(단, NULL은 0으로 표현한다)
--
--ENAME    SAL    COMM     급여*12+커미션   COMM NULL처리    연봉+커미션결과   
--FROM EMP;
--
--출력결과
--SCOTT  3000   NULL  NULL   0   36000
--FORD    3000   NULL  NULL   0    36000
--...
--...
--MARTIN 1250  1400  16400  1400  16400

--문권씨가 도와줌
-- 왜 혼자 못했나? 
--숫자0 써야되는데 영어문자 O씀 
--출력결과 보지않고 컬럼명만 보고 계산해서 마지막에 "연봉+커미션결과"를 구할때 NULL처리 안한 값을 그냥 더함
SELECT ENAME, SAL, COMM
                , SAL * 12 + COMM  "급여*12+커미션"
                , NVL(COMM, 0)  "COMM NULL처리"
                , SAL*12+ NVL(COMM, 0)  "연봉+커미션결과" 
FROM EMP;



--모든 사원에는 상관이 있다
--사원 테이블에 유일하게 상관이 없는 사원이 존재한다  -> NULL을 처리해야한다
--상관이 없는 사원만 출력하시오
--출력결과
--EMPNO   ENAME  MANAGER
--7839       KING	      C  E  O

-- NULL 처리를 어떻게 할것인가?
--MGR 타입은 NUMBER


SELECT *
FROM EMP;



-- 잘못된 내 사고방식
SELECT EMPNO, ENAME,
        TO_CHAR((NVL(MGR,0),'C  E  O')) AS MANAGER 
FROM EMP;


-- invalid number
SELECT EMPNO, ENAME,
        NVL(MGR,'C  E  O') AS MANAGER 
FROM EMP;



-- invalid number format model 오류 뜸
select empno, ename,
        to_char(mgr, 'C  E  O') AS MANAGER
FROM EMP;






--중간중간 해결해 나가면서 출력결과를 보면서 무엇이 필요한지 다음 단계를 생각하자
--정답: 명선씨 + 훈일씨 도와줌
SELECT EMPNO, ENAME,
        NVL(TO_CHAR(MGR),'C  E  O') AS MANAGER 
FROM EMP;



--<아래 두개 비교)
-- 민성씨 방법
-- 이렇게하면 MGR이 0인 사원이 있으면 그사원도 같이 출력된다
SELECT EMPNO, ENAME, NVL(TO_CHAR(MGR), 'C  E  O') AS MANAGER
FROM EMP
WHERE NVL(MGR, 0) = 0;


-- 이 방법이 더 좋은 방법<최종>
SELECT EMPNO, ENAME, NVL(TO_CHAR(MGR), 'C  E  O') AS MANAGER
FROM EMP
WHERE MGR IS NULL;


--문권씨가 궁금해한 것 - 이건 왜 오류?
-- 실행의 순서 떄문 
-- FROM EMP 부터가서 -> WHERE MANAGER 봤는데 이건 아직 안만들어서 없음, 그레서 오류 -> WHERE이 끝나고 SELECT 다음이 실행
-- 한번지나간 코드는 두번다시 진행 안된다
SELECT EMPNO, ENAME, NVL(TO_CHAR(MGR), 'C  E  O') AS MANAGER
FROM EMP
WHERE MANAGER = 'C  E  O';


--------------------------------------------

-- 매개변수 하나일때가 궁금
SELECT TO_CHAR(7902)
FROM DUAL;

--묵시적 형변환 때문에
-- '7902' +1 라 원래는 오류여야함 -> 모든 문자가 숫자로만 구성되어 있더라 -> 7902 + 1 -> 7903
SELECT TO_CHAR(7902) + 1     
FROM DUAL;



--오류
SELECT TO_CHAR(7902) + '1'
FROM DUAL;


-- 79021
SELECT TO_CHAR(7902) || '1'
FROM DUAL;


SELECT TO_CHAR(7902, 'L9,999')
FROM DUAL;

SELECT 7902
FROM DUAL;


----------------------------------------------------------

--< GROUP BY 절 >
--
--집계 함수 Aggregate Function
--( = 그룹 함수 )
--여러 행들의 그룹이 모여서 그룹당
--단 하나의 결과를 돌려주는 다중행 함수들의 특징
--- 여러 행들의 그룹이 모여서 그룹당 단 하나의 결과를 돌려주는 함수이다.
--- GROUP BY 절은 행들을 소그룹화 한다.
--- SELECT 절, HAVING 절, ORDER BY 절에 사용할 수 있다

--그룹 함수
--sum	그룹의 누적 합계를 반환한다(숫자만 가능)
--avg	그룹의 평균의 반환합니다
--count	그룹의 총 개수를 반환합니다  	
--max	그룹의 최대값을 반환합니다
--min	그룹의 최소값을 반환합니다

--!!!그룹함수는 null이 존재하면 어떻게 되나?



-- 그룹함수   <-->  단일함수

SELECT DEPTNO, ROUND(SAL, 3)
FROM EMP;


select *
from emp;



--  SUM : 그룹의 누적 합계를 반환한다(숫자만 가능)
SELECT SUM(SAL)
FROM EMP;



SELECT *
FROM DEPT;


SELECT SUM(DEPTNO)
FROM DEPT;


select *
from player;


-- ename은 문자라 오류난것 - sum 은 숫자형 변수일만 가능
select sum(ename)
from emp;

select sum(weight) || 'Kg' as 모든선수들의몸무게
from player;



--오류 not a single-group group fuction
-- player+name은 단일함수  - 480개의 데이터가 있음
--sum(weight) 그룹함수  - 몸무게를 다더한 누적합계, 총합(숫자) - 1개의 데이터가 있음
-- 집계 함수는 집계함수끼리 사용해야한다
-- 여태까지 는 가로로 더하는 결과 없음, 이제부터는 세로로 더하는 결과를 사용할것이다

select player_name, sum(weight) || 'Kg' as 모든선수들의몸무게
from player;



--모든 스타디움에 시민들이 앉을수 있는총 좌석수를 조회하시오
--스타디움총좌석수

select sum(seat_count) as 스타디움총좌석수
from stadium;


select comm, comm +12
from emp;


-- 전체사원의 커미션의 합계
--comm에 null이 있는데도 계산됨
select sum(comm)
from emp;


--전체사원의 급여평균


select avg(sal)
from emp;

select  round(avg(sal), 2)
from emp;

--(300+500+100) /3   -> 2200/3 -> 183.33333이나와야 하는데 733.333333이 나옴
-- null 떄문에 그렇다
select avg(comm)
from emp;

--!!!!!! 시험에 null이 나오면 조심해야핳ㄴ다
-- comm에 null을 없애고 avg 해야 제대로된 값이 나옴
-- 0 300 0 0 0 500  (0 + 300 + 500 + 0 + 0+ 100) / 12
select avg(nvl(comm, 0))
from emp;

--아무 의미없음- 이미 null을 포함해서 연산하고 null을 처리하는것
-- (300 + 500 + 100) / 3 -> nvl(733.33333333333, 0)     
select nvl(avg(comm), 0)
from emp;


select comm
from emp;


select sal
from emp;


SELECT MAX(SAL)
FROM EMP;


SELECT MIN(SAL)
FROM EMP;


select max(sal) 최고급여, min(sal) 최저급여, sum(sal) 사원총급여
        , avg(sal) as 사원평균급여, count(*) 총사원수
from emp;


select count(*)
from emp;


-- count 는 데이터에대한 총 갯수를 구하는 것이다
-- db는 하나의 컬럼을 하나의 그룹으로 본다 
select count(empno), count(sal), count(comm), count(*), count(deptno)
from emp;

-- null은 위험해!!!!!!
-- comm은 null에 대해서는 카운트 하지않고  3개값만 들어가있다고 본것, deptno도 null제외하고 10개값만 들어가있음
select empno, sal, comm, deptno
from emp;


--여기까지 집계 함수 배운것
---------------------------------------------------------------------


-- group by절

--< group by 절>
--어떤 컬럼 값을 기준으로 그룹함수를 적용해줄지
--기술해 주어야 할 경우에
--select문에 group by 절을 추가하여
--해당 컬럼을 기술한다
--select deptno
--from emp;

--[표현식]
--SELECT [DISTINCT] 컬럼명 [ALIAS명]
--FROM 테이블명
--[WHERE 조건식(연산자)]
--[GROUP BY 컬럼이나 표현식]

--[  ] 은 필요여부에 따라 쓰라는 의미
--!!! WHERE 밑에 GROUP BY 를 적는다


-- 사원테이블을 부서번호로 그룹화 하시오 (개발자 표현)
-- 사원테이블을 부서번호를 그룹별로 표시하시오 (사용자 표현)
select deptno
from emp
group by deptno;


--직원 중 가장 높은 급여값을 구하는 것이 아닌
--부서별 가장 높은 급여값을 구하고자 하는 경우?

select*
from emp;


--sal        comm	deptno
--800		            20
--1600	   300	30
--1250	   500	
--2975	        	20
--1250	1400	30
--2850	        	30   >>30번 부서에서 제일많이 받음
--2450		        10   >>10번 부서에서 제일많이 받음
--5000		
--1500		        30
--950		            30
--3000		        20   >> 20번 부서에서 제일 많이받음
--1300		        10



--null 추가한것
select max(sal)
from emp
group by deptno;

--null 추가한것
select deptno, max(sal)
from emp
group by deptno;


-- null을 제외시킨 것
select deptno, max(sal)
from emp
where deptno is not null
group by deptno;




--1. 가장 최근에 입사한 사원의 입사일과
--입사한지 가장 오래된 사원의 입사일을 
--출력하는 쿼리문을 작성하시오
--막내의 입사일     초고참의 입사일
--82/12/03		80/12/17



select min(hiredate) "막내의 입사일", max(hiredate) "초고참의 입사일"
from emp;


--2. 10번 부서 소속의 사원 중에서
--커미션을 받는 사원의 수를 구해보시오
--사원수
-- 0



-- 내가한 방법
-- 난 처음에 group by deptno 해서 그 결과를 보았음 - 보고난후 10번 부서이외에 필요없으므로 지웠음

-- count 했을때 null 은 세지않는다 는 것을 알게됨
select count(comm) as 사원수
from emp;


select count(comm) as 사원수, deptno
from emp
group by deptno;



--최종 - 준혁씨가 도와줌
select count(comm) as 사원수
from emp
where deptno = 10;


-- 다른사람의 정답
select count(comm) as 사원수
from emp
where deptno in(10);




select count(comm) as 사원수
from emp
where deptno in(10, 30);
--문제>
--위의 의미를 작성한다
-- 10번부서 또는 30번 부서의 사원들 중에 커미션을 받는 사원수는 몇명인지 표현하시오

--sql연산자 없이 구현하시오

select count(comm) as 사원수
from emp
where deptno = 10 or deptno = 30;



-- 아이패드에 실행순서 적혀있으니 봐라
select deptno, max(sal)
from emp
where deptno is not null
group by deptno;



--1. 사원 테이블에서
--각 부서별 평균 급여(소수점 첫째자리 까지, 둘쨰자리는 버림하시오)를 구하시오
--DEPTNO    평균급여

--강인씨 도와주심
-- 내가 틀린이유 - floor을 사용함(floor은 소수점 이하를 그냥 다 버리는 것)
SELECT DEPTNO, trunc(AVG(SAL), 1) AS 평균급여
FROM EMP
GROUP BY DEPTNO;


--명선씨 방법( 더최선!: 이것이 테이블 구조를 조회했을때 not null 조건이 없으므로, 미래에 null값이 입력될 가능성이 있다)

desc emp;   
--위를 조회해보면 sal에 not null 제약조건이 없다는 것을 확인

SELECT DEPTNO, trunc(AVG(nvl(SAL,0)), 1) AS 평균급여
FROM EMP
GROUP BY DEPTNO;






--2. 사원 테이블에서
--각 부서별 총급여를 구하시오
--DEPTNO   총급여

select deptno, sum(sal) as 총급여
from emp
group by deptno;





--3. K-리그 선수들의 포지션별 평균키를 구하시오
--포지션    평균키
--- 키의 데이터가 없는 사람은 제외하시오(추가조건)
--- 포지션이 없는 선수는 제외한다(추가조건)
---평균키는 소수점 3째자리에서 반올림하시오

-- 내가 푼 방식
-- null이 존재하는 상태
select position as 포지션, round(avg(height),2) as 평균키
from player
group by position;


--준혁씨가 알려줌
--nvl로 null을 없앤후
--avg()
-- 전체 데이터 합 / 전체 데이터 갯수
-- 1) 전체 데이터 중 null제외 / null 제외 전체 데이터 갯수
-- 2) nvl을 이용시 키가 존재하지 않는 선수들 
select position as 포지션, round(avg(nvl(height,0)),2) as 평균키
from player
group by position;



--샘방식 (현실반영)
--mf인 선수들 중에 키에 대한 데이터가 존재하지않는 선수가 30명 가량 있다는 것을 확인 -> 30명을 제외시켜라
--사람이란 키가 존재한다 -> nvl로 키를 0으로 만들어서는 안된다

select count(position) df선수수, count(height)
from player
where position = 'DF';


-- 이문제의 완벽한 코드(샘방식)
select position as 포지션, round(avg(height),2) as 평균키
from player
where height is not null
and position is not null
group by position;





