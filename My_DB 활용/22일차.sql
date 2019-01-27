SELECT PLAYER_NAME, POSITION, BACK_NO, HEIGHT
FROM PLAYER
WHERE TEAM_ID IN('K02', 'K07')
AND POSITION = 'MF';

-- 위의 코드가 무슨 뜻인지 설명하라?
-- IN을 사용하지않고 같은 결과 되도록 만들어라

--팀 삼성블루윙즈와 전남 드래곤즈 두팀의 선수들 중에 
--포지션이 미드필더인 선수들의 
--플레이어 네임, 포지션, 백넘버, 키를 모두 조회하시오

SELECT PLAYER_NAME, POSITION, BACK_NO, HEIGHT
FROM PLAYER
WHERE (TEAM_ID = 'K02' OR TEAM_ID= 'K07')         -- 괄호가 없으면 찾는 순서가 완전히 바뀐다 
AND POSITION ='MF';                                                




SELECT *
FROM EMP;

--< rownum >

SELECT *
FROM EMP
WHERE ROWNUM = 1;

--위와 같은 결과 - 하지만 아래는 정확한 넘버를 모르면 조회할수 없다
SELECT *
FROM EMP
WHERE empno = 7369;

-- 5줄 가져오기
SELECT *
FROM EMP
WHERE ROWNUM <= 5;


SELECT *
FROM EMP
WHERE ROWNUM <= 10+1;               -- 가능하지만 11로 적는게 낫다 의미없음


-- 선수테이블에서 40명만 볼수있도록 조회하시오
SELECT *
FROM PLAYER
WHERE ROWNUM <= 40;


--24 * 234324 의 결과를 오라클에서 알고 싶다면?
SELECT 24 * 234324      -- 결과값이 EMP 컬럼갯수인 12개가 나온다 -> 낭비
FROM EMP;

--!!!! 무조건 알아야!!
-- 가상테이블  - 테스트해봐라 활용해봐라고 만든것
SELECT 24 * 60
FROM DUAL;


DESC DUAL;

--!!!현재 날짜를 데려오는 것 - SYSDATE !!
-- 이걸 모르면 사용자가 언제 접근했는지 알수 없음
SELECT SYSDATE
FROM DUAL;


-- 절대값
SELECT -10, ABS(-10)
FROM DUAL;


-- 소수점 아래를 버린다 (무조건 내림)
SELECT 34.5678, FLOOR(34.5678)
FROM DUAL;


-- 특정 자리수에서 반올림한다 -- 아무것도 없으면 디폴트 값 0을 붙여주는것 ROUND(34.5678, 0)
SELECT 34.5678, ROUND(34.5678)
FROM DUAL;



SELECT 34.5678, ROUND(34.5678, 2)
FROM DUAL;



SELECT 34.5678, ROUND(34.5678, -1)   -- 마이너스 붙으면 . 기준 왼쪽부터 시작됨 4에서 반올림 된것
FROM DUAL;


-- 특정 자리수에서 잘라내는 함수 --  .  을 기준으로
SELECT TRUNC(34.5678,2), TRUNC(34.5678, -1), TRUNC(34.5678)
FROM DUAL;



-- 나머지를 구하는 함수
SELECT MOD(27, 2), MOD(27, 5)
FROM DUAL;



-- 사원 번호가 홀수인 사람들을 검색하시오
-- 전체검색
-- 혼자 못품
SELECT *
FROM EMP
WHERE MOD(EMPNO, 2) = 1;     -- 홀수이므로 EMPNO를 2로 나누어 나머지 1이인 EMPNO를 검색하는 것 


-- 문자형 데이터의 길이를 구한다
SELECT LENGTH('SQL Expert')
FROM DUAL;



-- 문자 더하기
SELECT CONCAT(1, '축구') 스포츠
FROM DUAL;
-- CONCAT 대신 ||(수직바)를 통해 주로 해결한다



SELECT *
FROM STADIUM;


SELECT DDD, TEL
FROM STADIUM;


-- 경기장의 지역번호와 전화번호를 합친!!! 번호의 길이를 구하시오
-- STADIUM_ID        TEL               T_len
--      D03            063273-1763      11
-- !!한번에 못품 -- 수직바 사용, 별칭(대소문자구별) 

SELECT STADIUM_ID, DDD||TEL AS TEL,  LENGTH(DDD) + LENGTH(TEL) "T_len"
FROM STADIUM;
-- 이것은 DDD길이와 TEL길이를 따로 구해서 합한것 - TEL 컬럼값 중 NULL 이 있어서 길이값도 NULL,  
-- 즉 길이값 NULL 과의 연산은 NULL이 되므로 - 결과값이 NULL이 존재 
-- NULL은 무슨짓을 해도 NULL이다

SELECT STADIUM_ID, DDD||TEL AS TEL,  LENGTH(DDD||TEL) "T_len"
FROM STADIUM;
-- 실제 강사님이 요구하신 답
-- 이것은 미리 DDD길이와 TEL길이를 합한상태에서 - 길이를 구했으므로, TEL 컬럼값이 NULL 이더라도 지역번호 3개의 길이가 나오는 것


-- 올림처리 한다
SELECT ENAME, CEIL(SAL/12)        --66.6666666
FROM EMP;

--------------------------------------------------------------------------

-- LOWER : 어떠한 것이든 소문자로 바꿔준다
SELECT LOWER('SQL Expert')
FROM DUAL;


-- UPPPER : 어떠한 것이든 대문자로 바꿔준다
SELECT UPPER('SQL Expert')
FROM DUAL;


--!! 무조건 알아야
-- SUBSTR                                           -- 1. 글자들 2. 시작의 위치(인덱스), 3.몇 글자 가져올래 
SELECT substr('SQL Expert', 5, 3)   -- S부터 5번째인 E앞에서(E앞에서 커서 깜박) 시작해서 3글자 들고온다 - 자릿수 카운트 1부터 시작(0이 아니라)
FROM DUAL;

SELECT substr('SQL Expert', 10, 3)   
FROM DUAL;

-- 함수안에 함수값이 들어갈수 있다 - 괄호안 숫자값들어갈수 있으므로 LENGTH 사용한것
SELECT substr('SQL Expert', 1, LENGTH('SQL Expert'))  
FROM DUAL;


-- LTRIM - LEFT TRIM : 첫글자를 기준으로 왼쪽으로 지운다
SELECT LTRIM('xxxYYZZxYZ', 'x')  -- 연속된 똑같은 내용 xxx가 나오므로 동일하게 취급해서 x 3개 모두 자름
FROM DUAL;

SELECT LTRIM('x1xxYYZZxYZ', 'x')  
FROM DUAL;

-- RTRIM - RIGHT TRIM : 뒤에서 시작!!!! : 젤 뒤의 글자를 기준으로 지워나간다
SELECT RTRIM('xxxYYZZxYZ', 'x')
FROM DUAL;

SELECT RTRIM('xxxYYZZxYZ', 'Z')
FROM DUAL;

SELECT RTRIM('xxxYYZZxYZZZZ', 'Z')
FROM DUAL;



-- TRIM : 양옆을 제거한다 - 왼쪽 오른쪽 제거
SELECT TRIM('x' FROM 'xxxYYZZxYZxxx')
FROM DUAL;


SELECT TRIM('x' FROM 'xxxYYZZxYZxx1x')
FROM DUAL;


-- 양쪽의 공백도 제거한다 - LTRIM RTRIM 도 매개변수 없으면 공백 제거
SELECT TRIM(' ' FROM '      xxxYYZZxYZxx1x       ')
FROM DUAL;


SELECT TRIM('      xxxYYZZxYZxx1x       ')
FROM DUAL;


SELECT RTRIM('xxxYYZZxYZ              ')
FROM DUAL;


-- 오른쪽 공백제거
SELECT RTRIM('         xxxYYZZxYZ              ')
FROM DUAL;


-- 왼쪽 공백제거
SELECT LTRIM('          xxxYYZZxYZ              ')
FROM DUAL;

------------------------------------------------------------------

--Welcome to Oracle
-- 모두 대문자로
SELECT UPPER('Welcome to Oracle')
FROM DUAL;



--사원명을 전부 소문자로 바꿔라
SELECT LOWER(ENAME)
FROM EMP;



-- select empno, ename, job
-- from emp
-- where ???????? ='manager';
-- 매니저인 사원만 조회하시오 (물음표 부분만 마음대로 바꿔서)
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE LOWER(JOB) = 'manager';


-- 승환씨 방법 -- ??? 이외의 곳을 바꾼것, 결과는 같지만 샘이 요구한  사항에 맞지 않음
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE JOB = UPPER('manager');


--!!!!!!!!!!!!!!!!!!!!!!
--SELECT 에서 (사용자 입장에서 볼수있는) 표현이 나오도록 하는 것



------------------------------------------------------------------

-- 글자의 개수를 구한다
-- LENGTH
SELECT LENGTH('Oracle'), LENGTH('오라클')
FROM DUAL;


-- 메모리에서 차지하는 바이트 수를 구한다
-- LENGTHB  - 영어는 1바이트, 한글은 3바이트(UTF-8방식) - (DBA님이 한글을 몇바이트로 설정하느냐에 따라 2바이트되기도)
SELECT LENGTHB('Oracle'), LENGTHB('오라클')
FROM DUAL;




-----------------------------------------------------------------------

-- Welcome to Oracle 중에서
-- com 이라는 글자만 출력되도록
SELECT substr('Welcome to Oracle', 4, 3)   -- 4번째부터 3글자만 추출
FROM DUAL;


-- Welcome to Oracle 중에서
-- acle 만 출력되도록
SELECT substr('Welcome to Oracle', 14, 4)    -- 14개를 찾고 들고오므로 아래보다 느리다
FROM DUAL;

SELECT substr('Welcome to Oracle', -4, 4)     -- 마이너스 붙이면 뒤에서부터 글자를 찾아간다 -- 4개를 찾고 들고오므로 위보다 빠르다
FROM DUAL;





-- 사원테이블에서 입사년도가 있는데
-- 년도와 달을 구하시오
-- 년도      달
-- 80      12
-- 형태로 12개가 나오도록
-- 혼자 못품
SELECT SUBSTR(HIREDATE, 1, 2) 년도, SUBSTR(HIREDATE, 4, 2) AS 달
FROM EMP;
-- SUBSTR이 글자 처럼도 잘라지는 구나!




-- 81년도에 입사한 직원을 알아내는 SQL 구문을 작성하시오
-- SQL 연산자를 사용해 풀기
-- SQL 연산자 없이 구하기
-- SUBSTR 로 구하기


-- SQL 연산자를 사용해 풀기
SELECT *
FROM EMP
WHERE HIREDATE BETWEEN '81/01/01' AND '82/01/01';


-- SQL 연산자 없이 구하기
SELECT *
FROM EMP
WHERE HIREDATE >= '81/01/01' AND HIREDATE < '82/01/01';



-- SUBSTR 로 구하기 (함수!)
-- !!혼자 못함
SELECT *
FROM EMP
WHERE SUBSTR (HIREDATE, 1, 2) = 81;




-- 사원의 이름중 E로 끝나는 사원을 검색하시오
--SQL 연산자 사용
--SQL 연산자 없이 구하기

--SQL 연산자 사용
SELECT *
FROM EMP
WHERE ENAME LIKE '%E';


--SQL 연산자 없이 구하기 (함수!)
-- !!혼자 못함
SELECT*
FROM EMP
WHERE SUBSTR (ENAME, -1,1) = 'E';



-- (       )가 있으면  함수이다!!! -- IN은 예외
-----------------------------------------------------------



SELECT SUBSTR('웰컴투오라클', 3, 4), SUBSTRB('웰컴투오라클', 3, 4)
FROM DUAL;
--SUBSTRB 는 바이트 단위를 살펴보는 것
SELECT SUBSTR('웰컴투오라클', 3, 4), SUBSTRB('웰컴투오라클', 1, LENGTH('웰컴투오라클')*3)
FROM DUAL;


-- INSTR  !!!!!위치!!!!!!!
-- 특정 문자의 위치를 구하는 함수 - 그 문자들 중에 처음 존재하는 특정문자
SELECT INSTR('Welcome to Oracle', 'O')   --12번째에 대문자 O가 존재해
FROM DUAL; 

SELECT INSTR('WELCOME TO ORACLE', 'O')  -- WELCOME의 O 를 찾아서 -- 5번째에 존재하는 걸로 뜸
FROM DUAL;


-- INSTR(대상, 찾을 글자, 시작 위치, 몇 번째 발견)
SELECT INSTR('WELCOME TO ORACLE', 'O', 6, 2)  
FROM DUAL;
-- 대상중 'O'를 찾는데 시작위치는 6번째부터/ 카운트해서 2번째 'O'가 나오는 자릿수


SELECT EMPNO, ENAME
FROM EMP
WHERE ENAME LIKE '__R%';
-- 결과 4명 나옴

-- 이 문제의 뜻?
-- 사원 테이블에서 사원이름의 (앞의 두글자는 무엇이 와도 상관없는) 세번째 글자가 R인 사원들의 직원번호와 직원이름을 조회하시오




-- 지금 배운 것들로
-- INSTR을 사용하여 풀기
--SUBSTR을 사용하여 풀기

-- INSTR을 사용하여 풀기
SELECT EMPNO, ENAME
FROM EMP
WHERE INSTR(ENAME, 'R', 3,1) = 3 ;
-- ENAME 중 R을 찾는데 시작위치는 3번째부터 / 시작위치부터 첫번째로 나오는 R의 위치가 3번째(=3 의 의미)

SELECT EMPNO, ENAME
FROM EMP
WHERE INSTR(ENAME, 'R', 3,1) = 4 ;
-- ENAME 중 R을 찾는데 시작위치는 3번째부터 / 시작위치부터 첫번째로 나오는 R의 위치가 4번째(=4 의 의미)


--SUBSTR을 사용하여 풀기
SELECT EMPNO, ENAME
FROM EMP
WHERE SUBSTR(ENAME, 3, 1) = 'R';
--ENAME 중 3번째부터 1개만 추출 / 그 1개만 추출한 글자가 R 인 것




------------------------------------------------------------------------

-- 특정 문자를 채워주는 함수

-- LAPD(대상, 채워넣을 갯수, 채워넣을 기호)
SELECT LPAD('Oracle', 20, '#')
FROM DUAL;
-- 총 20개를 채울껀데 Oracle(6개) 기준으로 왼쪽에 #을 14개 채워넣은 것



SELECT RPAD('Oracle', 20, '#')
FROM DUAL;
--  총 20개를 채울껀데 Oracle(6개) 기준으로 오른쪽에 #을 14개 채워넣은 것

SELECT RPAD('Oracle', 7, '#')
FROM DUAL;



-- TRIM : 공백 양쪽으로 제거
SELECT TRIM('         Oracle           ')
FROM DUAL;



SELECT ENAME
FROM EMP
WHERE ' oracle ' = ' oracle ';


SELECT EMPNO
FROM EMP
WHERE TRIM(' oracle ') =  ' oracle ';


SELECT EMPNO
FROM EMP
WHERE 'oracle' =  ' oracle ';
-- 공백도 문자다


-- !!확인해라 보고 못적음
SELECT LENGTH('oracle'), LENGTH( ' oracle ')
FROM EMP;


select *
from player;

-- 출력결과 (480명 나오도록)
-- 별명이 NULL인 선수는 조회하지 않는다
-- 모든 선수명에는 님자가 붙는다
-- 별명은  무조건 뒤에 !!!이 붙는다

--  선수명                별명
-- 김장관님            배추도사,작은삼손!!!
-- 김정효님             깜둥이, 동키통!!!


SELECT PLAYER_NAME ||'님 '  AS 선수명, NICKNAME || '!!!' AS 별명
FROM PLAYER;


-- 데이터가 모두 다름으로  rpad로 만들수 없다;;;;
select rpad(nickname, length(nickname)*2 + 3, '!')
from player;


SELECT RPAD(PLAYER_NAME, '님') AS 선수명
FROM PLAYER;


SELECT RPAD('한', 7, '#')
FROM DUAL;
-- 한글은 2바이트로 인식



-----------------------------------------------------------


-- !!!무조건 알아야!!!
-- DATE  날짜!!!

SELECT SYSDATE
FROM DUAL;

-- 날짜 연산

-- 현재날짜 + 1 = 내일
SELECT SYSDATE + 1
FROM DUAL;

-- 현재날짜 - 1 = 어제
SELECT SYSDATE - 1
FROM DUAL;


SELECT SYSDATE - 1 AS 어제, SYSDATE AS 오늘, SYSDATE + 1 AS 내일
FROM DUAL;



-- 사원들 입사한 날
-- 지금 현재를 기준으로 몇일이 흘렀을까 ? 근무일수?

SELECT SYSDATE - HIREDATE AS "입사후 근무일수"
FROM EMP;


-- 사원들의 근무일수를 구하시오
-- 출력 (12명 출력)
-- 사원이름       근속년수         근무일수
-- SMITH                          13915
-- ALLEN                          13850


-- 일수를  계산하고 근속년수 년수이므로 나누기 365일 해야되는 것을 생각해내야한다

-- 문권씨 방법 - TRUNC 이용 : . 을 기준으로 특정자릿수에서 잘라내는 것
SELECT ENAME AS 사원이름,
        TRUNC( (SYSDATE - HIREDATE)/365 ) AS 근속년수,  
        TRUNC(SYSDATE - HIREDATE) AS 근무일수
FROM EMP;


-- 명선씨 방법 - FLOOR 이용 : 소수점 아래를 버리는 것
-- 보통 쓰는 방법
SELECT ENAME AS 사원이름, 
        FLOOR( (SYSDATE - HIREDATE)/365 ) AS 근속년수,  
        FLOOR(SYSDATE - HIREDATE) AS 근무일수
FROM EMP;


-- 충현씨 방법 
SELECT ENAME AS 사원이름, 
        FLOOR( (SYSDATE - HIREDATE)/365 ) AS 근속년수,  
        SUBSTR(SYSDATE - HIREDATE, 1, 5) AS 근무일수
FROM EMP;


-- 연 : 년수를 더하는 방법
SELECT SYSDATE, SYSDATE + (2 * 365)
FROM DUAL;


-- 시간을 더하는 공식
-- 날짜 + 숫자/24

-- 24시간 더한 것
SELECT SYSDATE + 24/24
FROM DUAL;

-- 3시간 더한 것
SELECT SYSDATE + 3/24
FROM DUAL;


------------------------------------------------------------


-- EXTRACT(YEAR | MONTH | DAY FROM DATE)
-- 날짜 데이터에서 년 | 월 | 일 데이터를 출력할수 있다
-- 시분초도 가능
-- SUBSTR로 데이터 건드는 것이 아니라 이 방법을 써야한다
SELECT ENAME, HIREDATE 
        ,EXTRACT(YEAR FROM HIREDATE) AS 입사년도
        ,EXTRACT(MONTH FROM HIREDATE) AS 입사월
        ,EXTRACT(DAY FROM HIREDATE) AS 입사일
        ,EXTRACT(DAY FROM SYSDATE) AS 현재일
FROM EMP;


--위의 출력한 결과값과 비교하여  것을 
--출력 결과값이  입사월 입사일 모두 두자리가 출력되도록

-- EXTRACT(YEAR | MONTH | DAY FROM DATE)
-- 날짜 데이터에서 년 | 월 | 일 데이터를 출력할수 있다
-- 시분초도 가능
-- SUBSTR로 데이터 건드는 것이 아니라 이 방법을 써야한다

-- !!혼자 못품
-- LAPD(대상, 채워넣을 갯수, 채워넣을 기호)
SELECT ENAME, HIREDATE 
        ,EXTRACT(YEAR FROM HIREDATE)  AS 입사년도
        ,LPAD (EXTRACT(MONTH FROM HIREDATE), 2, '0') AS 입사월
        ,LPAD (EXTRACT(DAY FROM HIREDATE), 2, '0') AS 입사일
        ,EXTRACT(DAY FROM SYSDATE) AS 현재일
FROM EMP;
-- 설명 LPAD 를 사용 - 채워넣을 갯수는 2인데 채워넣을 기호는 '0' 을 LPAD 이므로 왼쪽부터 채워나감
-- 그러므로 입사월이 이미 두자리인 숫자는 채워넣을 갯수 2를 모두 만족하므로 '0'를 넣을수 없고
-- 입사월이 한자리 숫자인 것은 채워넣을 갯수 2를 만족하기위해 '0'으로 한자리 숫자(월) 왼쪽을 채움





-- ADD_MONTH

-- 개월 수를 더하는 함수 ??
-- 어느달은 28일까지 어느달은 30일 31일까지 존재함으로 어렵다

--하루를 더하는 방법
SELECT SYSDATE + 1
FROM DUAL;

-- 1개월후
SELECT ADD_MONTHS(SYSDATE, 1) 개월수를더하는함수
FROM DUAL;

-- 4개월후
SELECT ADD_MONTHS(SYSDATE, 4) 개월수를더하는함수
FROM DUAL;


-- 입사후 6개월을 더한 결과
SELECT ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 6)
FROM EMP;



--NEXT DAY

-- NEXT_DAY(현재날짜,'수요일') - 현재날짜를 기준으로 가장 빨리오는 수요일 
-- 해당 요일의 가장 가까운 날짜를 반환하는 함수
SELECT SYSDATE, NEXT_DAY(SYSDATE, '수요일')
FROM DUAL;


SELECT SYSDATE, NEXT_DAY(SYSDATE, 'WEDESDAY')
FROM DUAL;
-- 우리나라 기준으로 설치되어있어서 영어로 안됨(자동으로 KOREAN으로 설정된 것)
-- 영어로 조회되려면? DBA님이 설정하는 것 - 강사님이 하시는 것 참고만 하자



-- NEXT_DAY(현재날짜,'금요일') - 현재날짜를 기준으로 가장 빨리오는 금요일 
SELECT SYSDATE, NEXT_DAY(SYSDATE, '금요일')
FROM DUAL;


-- NEXT_DAY(현재날짜,'화요일') - 현재날짜를 기준으로 가장 빨리오는 화요일 
-- 현재 화요일이이므로 다음주 화요일
SELECT SYSDATE, NEXT_DAY(SYSDATE, '화요일')
FROM DUAL;


-- LAST_DAY
-- 해당 달의 마지막 날짜를 반환하는 LAST_DAY 함수
SELECT SYSDATE, LAST_DAY(SYSDATE)
FROM DUAL;

-- 2월달의 마지막 날짜
--SYSDATE 19/01/22기준 대충 10일 더하면 2월로 넘어가니깐
SELECT SYSDATE, LAST_DAY(SYSDATE + 10)  
FROM DUAL;



--!!!무조건 알아야!!!!

-- 형변환 함수

-->>명시적 데이터 변환 : 데이터 형변환 함수로 변환하여 계산한다
--
-->>암시적(묵시적) 데이터 변환: 자동으로 DBMS가 변환해서 계산한다
--
--묵시적 코드를 사용하는 경우에는 성능 저하가 발생할 수 있다
--자동족으로 데이터베이스가 알아서 계산하지 않는 경우가 있어 에러를 발생할 수도 있으므로 명시적인 데이터 형변환을 사용하는 것이 바람직하다
--
--
--TO_CHAR 
--날짜형 혹은 숫자형을 문자형으로 변환한다
--TO_DATE 
--문자형을 날짜형으로 변환한다
--TO_NUMBER
--문자형을 숫자형으로 변환한다
--

--[형식]
--TO_CHAR(날짜 데이터, '출력 형식')
--
--출력형식 = 포맷 FORMAT

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD')
FROM DUAL;
-- 년도 뒤에 2자리/월 2자리/ 일2자리 DATE 로 지금까지 봐왔음- 1900년대인지 2000년대인지 오해가 생길수 있음


-- 날짜 포맷 형식에 대해서는 전세계가 약속이 되어있음
-- 날짜 FORMAT 형식
--종류        의미
--YYYY    년도 표현(4자리)
--YY	     년도 표현(2자리)
--MM	     월을 숫자로 표현
--MON	     월을 알파벳으로 표현
--DAY	     요일 표현
--DY	     요일을 약어로 표현
--DD	     일을 표현


-- 일반인도 오해하지않고 알아볼수 있도록 입사년도를 바꾼것 : TO_CHAR 포맷 이용
SELECT EMPNO, ENAME, HIREDATE, TO_CHAR(HIREDATE, 'YYYY-MM-DD') 입사년도
FROM EMP;


SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY/MM/DD')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY/MM-DD')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY/MM******DD')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY:MM:DD')
FROM DUAL;


-- 글자의 의미만 지켜준다면 -(대쉬), / (슬래시), 등은 바꿔도 상관없다


SELECT SYSDATE, TO_CHAR(SYSDATE, 'YY/MM/DD')
FROM DUAL;


SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY/MON/DD')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY/MM/DAY')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DY')
FROM DUAL;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD DY') || '요일'
FROM DUAL;


-- 날짜 , 시, 분, 초   도 표현가능


--AM   OR   PM            오전, 오후 시각 표시
--A.M  OR    P.M	         오전, 오후 시각 표시
--HH    OR   HH12        12시간으로 표현(1~12)
--HH24                        24시간으로 표현(0~23)
--MI		                     분 표현
--SS		                     초 표현


SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD, HH24 : MI : SS')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD, HH : MI : SS')
FROM DUAL;



SELECT TO_CHAR(SYSDATE, 'AM HH24 : MI : SS'), TO_CHAR(SYSDATE, 'PM HH24 : MI : SS')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'AM HH : MI : SS'), TO_CHAR(SYSDATE, 'HH24 : MI : SS')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'AM HH : MI : SS'), TO_CHAR(SYSDATE, 'HH24 - MI ~ SS')
FROM DUAL;



--!!! 중요
-- 시간을 더하는 방법
-- < 시간을 더하는 공식 >
-- 날짜 + 원하는시간/24 

-- 3시간을 더하는 방법
-- SYSDATE + 3/24 

SELECT SYSDATE + 3 /24
FROM DUAL;

-- 1시간을 더한 것
SELECT SYSDATE, TO_CHAR(SYSDATE + 1/24, 'YYYY-MM-DD HH : MI : SS') 
FROM DUAL;



--DUAL 테이블에서 
--현재시간에서 오전12시를 표현하고,
--현재시간에서 오전12시 뒤에 1시간을 더하면 
--어떤 결과가 나오는지 출력하시오

-- 출력결과
-- 현재시간마지막시간표시     다음날최초시간표시





--현재시간 6시 몇분일떄 이 문제 품

-- 샘의도 표현단위에 대해서 알아라
-- 샘의도 -> 오전 12시로 넘어가면, 0시로 표현되느냐 12시로 표현되느냐 보라는것
-- 그리고 한시간을 더더하면 1시로 표현됨을 알수 있음
SELECT TO_CHAR(SYSDATE + 6/24, 'YYYY-MM-DD, HH : MI : SS') --"현재시간에서 오전12시를 표현"
                , TO_CHAR( (SYSDATE + 6/24) + 1/24, 'YYYY-MM-DD, HH : MI : SS') --"현재시간에서 오전 12시 뒤에  1시간을 더하면"
FROM DUAL;


-- 샘의도 -> 오후 24시로 넘어가면, 0시로 표현되느나 24시로 표현되느냐 보라는 것
-- 그리고 한시간을 더더하면 
SELECT TO_CHAR(SYSDATE + 6/24, 'YYYY-MM-DD, HH24 : MI : SS') --"현재시간에서 오후23시를 표현하고"
                , TO_CHAR( (SYSDATE + 6/24) + 1/24, 'YYYY-MM-DD, HH24 : MI : SS') --"현재시간에서  오후23시 뒤에 1시간을 더하면"
FROM DUAL;


-- 위의 것
--DUAL 테이블에서 
-- 현재시간에서 오후23시를 표현하고,
-- 현재시간에서 오후23시 뒤에 1시간을 더하면 
-- 어떤 결과가 나오는지 출력하시오

-- 출력결과
-- 현재시간마지막시간표시     다음날최초시간표시













