

-- 현재 시간에 대한 정보를 표시하시오
-- 년-월-일 수요일 시 : 분 : 초
-- 2019-01-23 수요일 오전 10 : 15 : 29  로 결과가 나오도록

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY AM HH24 : MI : SS')
FROM DUAL;


--2019-01-23 수요일 오후 13 : 15 : 29  로 결과가 나오도록
--현재 10시 몇분이니 임의로 3시간 더해서 결과값을 오후로 만들어서 본것

SELECT TO_CHAR(SYSDATE + 3/24, 'YYYY-MM-DD DAY PM HH24 : MI : SS')
FROM DUAL;



-- 숫자형을 문자형으로 변환하기

SELECT 1230000
FROM DUAL;

SELECT 1230000 + 1
FROM DUAL;


SELECT TO_CHAR(1230000) 
FROM DUAL;

-- 숫자로 구성된 문자는 숫자와(로서) 더해진다
SELECT TO_CHAR(1230000) + 1
FROM DUAL;


SELECT '1230000' + 1
FROM DUAL;

-- 오류
SELECT 'A1230000' + 1
FROM DUAL;


--오류
SELECT '1230000A' + 1
FROM DUAL;



-- 문자처럼 더해지려면 || (수직바)를 이용한다
SELECT '1230000' || 1
FROM DUAL;

-- 숫자의 단위를 표현할수 있더라
-- TO_CHAR( 관심있는 숫자, 숫자에 대한 포멧 형식)

--< 숫자 포맷 형식 >
--구분             설명
--0	 자릿수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다
--9	자릿수를 나타내며 자릿수가 맞지 않아도 채우지 않는다
--L	각 지역별 통화 기호를 앞에 표시한다
--.	소수점
--,	천 단위 자리 구분


--< 9 로 숫자 포맷 형식 >
-- 데이터를 보고 어느정도의 크기의 포멧형식을 쓸지 파악해야 한다
SELECT TO_CHAR(1230000, 'L9,999,999') 
FROM DUAL;

-- 자릿수 포멧형식이 부족하면 잘모르겠다는 표시가 뜬다 - ###### 으로
SELECT TO_CHAR(1230000, 'L999,999') 
FROM DUAL;

-- 포멧이 더 큰단위니깐 표현됨
SELECT TO_CHAR(1230000, 'L999,999,999') 
FROM DUAL;

SELECT TO_CHAR(1230000, 'L9,999,999') 
FROM DUAL;


--< L 로 포맷 형식 >
-- 대소문자 L ,l 되지만 소문자 ㅣ은 숫자 1과 헷갈리므로 사용하지 않는다

SELECT TO_CHAR(1230000, 'L9,999,999') 
FROM DUAL;

SELECT TO_CHAR(1230000, '9,999,999L') 
FROM DUAL;

--오류 뜸
SELECT TO_CHAR(1230000, '9,99L9,999') 
FROM DUAL;

-- 앞에 $ 를 붙이면 표현됨
SELECT TO_CHAR(1230000, '$9,999,999') 
FROM DUAL;




-- , 콤마 없어도 적을수는 있지만 가독성고 편리함 위해 적어준다
SELECT TO_CHAR(1230000, 'L9999999') 
FROM DUAL;



--< 0으로 포멧 형식 >
--대상 숫자의 자릿수 보다 포맷형식이 더크면(자릿수 많으면) 0 으로  그 자릿수만큼 채워진다

SELECT TO_CHAR(1230000, 'L0,000,000') 
FROM DUAL;


SELECT TO_CHAR(1230000, 'L000,000') 
FROM DUAL;



SELECT TO_CHAR(1230000, 'L000,000,000') 
FROM DUAL;

-- 숫자 자릿수보다 포멧형식이 크면 0 으로 채운다
SELECT TO_CHAR(123, 'L0,000,000') 
FROM DUAL;


-- <소수점 . 포멧형식 >
SELECT TO_CHAR(123, 'L0,000,000.000') 
FROM DUAL;


SELECT TO_CHAR(1230000.3230000, 'L9,999,999.9999999999999') 
FROM DUAL;


SELECT TO_CHAR(123.3230000, 'L0,000,000.000000000000') 
FROM DUAL;




--연봉 
--사원테이블에서 2년후 연봉을 계산하시오
--(테이블에 표시된 것은 월급)
--1년차 연봉 100   
--2년차 연봉이란? 현재 연봉에서 10%로 인상한 금액이다
--
--2년간 총받은 연봉
--원화  천단위를 표시
--1년 연봉100    
--2년차 연봉110
--
--1년차 연봉 + 2년차 연봉 =  210
-- 원화표시 2,100,000



-- 내가 한 방법
SELECT  EMPNO, ENAME, JOB, MGR, HIREDATE
                , SAL, TO_CHAR( (SAL*12)+( (SAL*12)+(SAL*12)*0.1) , 'L99,999,999' ) "1~2년치 연봉의 합"
                , COMM, DEPTNO
FROM EMP;


SELECT  EMPNO, ENAME, JOB, MGR, HIREDATE
                , SAL, TO_CHAR( (SAL*12)+( (SAL*12)*1.1) , 'L99,999,999' ) "1~2년치 연봉의 합"
                , COMM, DEPTNO
FROM EMP;


-- 명선씨 방법
SELECT  EMPNO, ENAME, JOB, MGR, HIREDATE
                , TO_CHAR( SAL*12 , 'L99,999,999' ) "1년차 연봉"
                , TO_CHAR((SAL*1.1) *12 , 'L99,999,999' ) "2년차 연봉"
                , TO_CHAR((SAL + SAL*1.1) *12  , 'L99,999,999' ) "1~2년치 연봉의 합"
                , COMM, DEPTNO
FROM EMP;


----------------------------------------------------------------------------



-- 이방법은 이미 존재하던 컬럼들이 나오고 난후 젤뒤에 새로운 컬럼 나옴
SELECT EMP.*,SAL * 12 년봉
FROM EMP;

-- 이방법은 젤앞에 새로운 컬럼만들고 그뒤에 이미 존재하던 컬럼들 나옴
SELECT SAL * 12 년봉, EMP.*
FROM EMP;

-- 사실은 위와같이 진행되는데 우리가 아래와같이 한것은 묵시적으로 되고 있었던것
SELECT *
FROM EMP;



--< 날짜형으로 변환하는 함수 >
--TO_DATE('문자', format)
--위 함수를  실행시키면 나오는 결과값은?
--날짜 형식의 값이 나온다

--!!!날짜를 계산할수 있어야한다




-- 숫자라 오류남
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = 19801217;

-- 숫자라 오류남
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = 80/12/17;



-- 자동 형변환되서 아래들 계산이 되는거라 착각되는 것
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = '19801217';

SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = '80/12/17';




-- 명시적 형변환

-- 숫자형 타입을 데이트형 타입으로 바꾼것 - 그것이 HIREDATE와 비교해서 같으므로 SMITH가 출력된것
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = TO_DATE(19801217, 'YYYYMMDD');


--!! 오류남: 날짜 데이터 - 숫자
SELECT SYSDATE - 20180123
FROM DUAL;

--!!오류남 - 문자는 사칙연산이 안됨
SELECT SYSDATE - '20180123'
FROM DUAL;




-- 이게 오류안나는건 SYSDATE에 20180123일만큼 더해진 것
SELECT SYSDATE + 20180123
FROM DUAL;


SELECT SYSDATE + '20180123'
FROM DUAL;

-- 계산할수있는 년도수를 넘어섬을 보여줌
SELECT TO_CHAR(SYSDATE + '20180123',  'YYYYMMDD')
FROM DUAL;

-- 잘못됨
SELECT SYSDATE + 2018/01/23
FROM DUAL;

--잘못됨 --숫자를 나눗셈 연산해서 SYSDATE에 더해진것
SELECT  TO_CHAR(SYSDATE + 2018/01/23,'YYYYMMDD')
FROM DUAL;


--2019/01/23
SELECT SYSDATE - TO_DATE('2018/01/22', 'YYYY/MM/DD')
FROM DUAL;
-- 결과 366


SELECT FLOOR (SYSDATE - TO_DATE('2018/01/22', 'YYYY/MM/DD')) "현재년도-1년전 일수"
FROM DUAL;
--결과 대략 366나와야 함


-- TO_DATE 을 쓸때는 - 문자만 들어갈수있음 
SELECT TO_DATE('20190123', 'YYYYMMDD') "문자를날짜로 표현"
FROM DUAL;


--<아래의 5가지 차이점>
--  20190912
--  '20190912'

--  HIREDATE VARCHAR2(233) '2019-09-12'  - 이건 그저 년,월,일 만 알면될때 - 연산 불가능
--  HIREDATE DATE 19/09/12    - DATE타입이므로 시,분,초 도 저장되어 있는것(보이지않지만) - DATE타입이므로 연산가능

--  '2019/09/12'



SELECT *
FROM EMP;


SELECT FLOOR (SYSDATE - HIREDATE)
FROM EMP;

-- 사원들의 입사년수를 구하시오
-- 꼭 TO_DATE를 사용하시오
-- 전체 컬럼,  입사년수

--충현씨꺼
SELECT TO_DATE(HIREDATE)
FROM EMP;

SELECT HIREDATE
FROM EMP;

SELECT TO_DATE(SYSDATE)
FROM EMP;



-- DATE 타입끼리 연산되나?? yes
-- DATE의 기본은 - 일수 인가? yes
-- SYSDATE +  1 : 하루를 더한것
-- SYSDATE + 1     20190123



--입사년수가 38년 이하인 사원들을 구하시오
--현재 0123 - 30일을 빼준것으로 하거나, SYSDATE + 30해서 사용하거나 둘중에 하나 선택해서 사용
--(SMITH, ALLEN, WARD는 안나와야함)

-- 연단위 계산전 일수로 계산하고 다시 연단위로 바꿔야함
-- 365일 = 1년
 
--충현씨 푼것
-- 임의의 날짜를 쓸때 TO_DATE 써야되는건데 이건이미 SYSDATE 과 HIREDATE 의 데이터타입끼리의 연산이니 T0_DATE 안써도됨
-- TO_DATE 쓰면 자동형변환으로 데이터타입이 문자로 또 문자가 데이터타입으로 되서 나온것
SELECT EMP.*,
                FLOOR( (TO_DATE(SYSDATE + 30) - TO_DATE(HIREDATE) ) /365) AS 입사년수
FROM EMP
WHERE ( (TO_DATE(SYSDATE + 30) - TO_DATE(HIREDATE) ) / 365) <= 38;



-- TO_DATE 안쓰고 계산
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE
                , SAL, COMM, DEPTNO
                , FLOOR( ( (SYSDATE + 30) - HIREDATE )/ 365 )  "입사년수"
FROM EMP
WHERE  ( (SYSDATE + 30) - HIREDATE )/ 365 <= 38;



SELECT EMP.*
                , FLOOR( ( (SYSDATE + 30) - HIREDATE )/ 365 )  "입사년수"
FROM EMP
WHERE  ( (SYSDATE + 30) - HIREDATE )/ 365 <= 38;



-- 내가 시도한 방법(오류!)
-- TO_DATE 안에 문자가 아니라 숫자를 넣은 것
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE
                , SAL, COMM, DEPTNO
                , TO_DATE(  ( FLOOR ( (SYSDATE + 30) - HIREDATE) )  / 365 ,'YYYYMMDD') "입사년수"
FROM EMP;

 

-------------------------------------



--< 숫자형으로 변환하는 TO_NUMBER 함수 >

-- TO_NUMBER('숫자로만 구성되어 있는 문자', '숫자 포맷' 형식)
--위 함수가 실행되서 나온는 결과는?
--숫자


SELECT '20,000' - '10,1000'
FROM DUAL;

--위의 결과 오류 뜨는것을 해결하려면?
SELECT TO_NUMBER('20,000', '99,999' ) 
        - TO_NUMBER('10,000', '99,999') AS "두 수를 뺀값"
FROM DUAL;
-- - 마이너스 연산자을 함께 두번째 줄로 내려야 오류안뜸

-- 자동 형변환때문에 결과 나오는것
SELECT TO_NUMBER(23)
FROM DUAL;


-- 실행안됨 - 포맷 형식이 없어서
SELECT TO_NUMBER('20,000')
FROM DUAL;


-- 콤마도 문자이므로 포맷 형식에도 콤마를 같이 넣어줘야 정확히 나옴
SELECT TO_NUMBER('20,000', '99,999')
FROM DUAL;

-- 숫자 + 숫자  이므로 연산됨
SELECT TO_NUMBER('20,000', '99,999') + 20000
FROM DUAL;

-- 형식 포맷이 더작은 범위라 오류
-- 단위를 잘 맞춰야 한다
SELECT TO_NUMBER('20,000', '9,999')
FROM DUAL;


SELECT '$20,000'
FROM DUAL;

SELECT TO_CHAR(TO_NUMBER('20,000', '99,999'), 'L99,999')
FROM DUAL;


SELECT *
FROM EMP;

-- 사원들의 급여를 백만단위로 변경해서 
-- 천단위와 원표시를 출력하시오
-- 전체 컬럼,    사원급여
--                   (원 기호)800,000,000

SELECT EMPNO, ENAME, JOB, MGR
            , HIREDATE, SAL, COMM, DEPTNO
            , TO_CHAR (SAL * 10000, 'L99,999,999') 사원급여
FROM EMP;


-- 전체컬럼 보여주고 사원급여 컬럼만 마지막에 붙이면 되므로 EMP.* 를 사용
SELECT EMP.*
            , TRIM(TO_CHAR (SAL * 10000, 'L99,999,999')) 사원급여
FROM EMP;



-- 스타디움에 스타디움이름과 좌석수를 표시하시오
-- 스타디움 이름         좌석수
--전주월드컵경기장     28,000좌석

SELECT *
FROM STADIUM;



--!!혼자 못함
-- 차근차근 생각하자 하나씩 하나씩 해결하자
-- SEAT_COUNT 는 NUMBER타입 -> ,  콤마를 넣으려면 TO_CHAR이용해 문자로 바꿔야 한다 -> || 수직바이용해 좌석이라는 단어를 더한다
SELECT STADIUM_NAME "스타디움 이름", TO_CHAR(SEAT_COUNT, '999,999') || '좌석' "좌석수"
FROM STADIUM;




--1. 자신이 해외로 여행을 가고자 한다
--국내 화폐가 서로 다른 2나라에서의
--환율을 반영한 가격을 표시하시오
-- 소수점 두번째자리까지 나오도록 한다
--대한민국   ????   ????
-- 1,000  ????   ????    
--> , 콤마 찍혀나오게 어떻게? -> 문자로 바꾼다 TO_CHAR 이용
--TO_CHAR( 관심있는 숫자, 숫자에 대한 포멧 형식)
-- DUAL 테이블을 이용해야함


--예시
SELECT 700 대한민국, 1700 미국, 1200 
FROM DUAL;

--분석1) 대한민국 1000원일때 미국과 일본의 화폐가치가 어떻게 변하는지 본다(네이버 환율계산기)
-- 방정식을 사용하여 미국돈 = 대한민국 * X , 일본돈 = 대한민국 * Y 하여, X와 Y를 구해준다
-- 

--내가한 방식 - 부족함
SELECT TO_CHAR(1000000, '999,999,999') 대한민국
            , TO_CHAR( (1000000 * 0.00089) ,'999,999,999')  미국
            , TO_CHAR( (1000000 * 0.0972) ,'999,999,999') 일본
FROM DUAL;


-- 지원씨 방식
--0	 자릿수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다
--9	자릿수를 나타내며 자릿수가 맞지 않아도 채우지 않는다
SELECT TO_CHAR(1000000, '999,999,999') 대한민국
            , TO_CHAR( (1000000 * 0.00089) ,'999,999,9990.99')  미국
            , TO_CHAR( (1000000 * 0.0972) ,'999,999,9990.99') 일본
FROM DUAL;


-- 지원씨 방식에  ROUND  두번째 자리에서 반올림 적용한것 -  ROUND ( 숫자 , 2)
SELECT TO_CHAR(1000000, '999,999,999') 대한민국
            , TO_CHAR( ROUND ( (1000000 * 0.00089), 2) ,'999,999,9990.99')  미국
            , TO_CHAR( ROUND ( (1000000 * 0.0972) , 2) ,'999,999,9990.99') 일본
FROM DUAL;




--샘방식 - 일본돈 1 에 대해 한국돈 10.30이 된다는 것을 이용
SELECT 1000 AS 대한민국
            , (100 * 10.30) AS 일본
             , 1000/ 10.30 일본환율적용
FROM DUAL;

--위를 보니 환율적용한값이 소수점이 너무 길다 -> ROUND 반올림을 해주자 판단
SELECT 1000 AS 대한민국
            , (100 * 10.30) AS 일본
            ,TO_CHAR(ROUND(1000/ 10.30, 2), '9,999,990.00') 일본환율적용
FROM DUAL;




--2. 팀 테이블의 zip 코드 1과 zip 코드2를
--숫자로 변환한 후 두 항목을 더한 숫자를 출력하시오
--TEAM_ID               우편번호합

--분석1) 현재 zip 코드는 CHAR 문자이다
--분석2) ZIP코드1 과 ZIP코드2를 더하려면 문자 -> 숫자로 형변환 해야한다
--분석3) TO_NUMBER('숫자로만 구성되어 있는 문자', '숫자 포맷' 형식)

SELECT *
FROM TEAM;


SELECT TEAM_ID
            , TO_NUMBER(ZIP_CODE1, '999') + TO_NUMBER(ZIP_CODE2, '999')   AS 우편번호합
FROM TEAM;



--------------------------------------------------------------


--!!!!!엄청 어려움!!!!!!!

--< CASE문 >

--부서 번호에 해당되는 부서명을 구하시오

--IF ELSE IF ELSE 와 로직이 완벽히 동일하다
--
--여러 가지 경우에서 하나는 선택할 때 사용
-- [ CASE문 표현식]
--  CASE 
--            WHEN 조건1 THEN 결과1
--            WHEN 조건2 THEN 결과2
--            WHEN 조건3 THEN 결과3
--            ELSE     결과N
--  END

SELECT *
FROM EMP;

SELECT *
FROM DEPT;

-- ELSE문이 없으면 조건에 맞는것이 아니면 결과가 나오지않는다
-- NULL 은 예외적인 데이터
--EMP에 있는 12명 모두에 대해 다 조사한다
SELECT ENAME, DEPTNO,
    CASE WHEN DEPTNO=10 THEN 'ACCOUNTING'
               WHEN DEPTNO=20 THEN 'RESEARCH'
               WHEN DEPTNO=30 THEN 'SALES'
               WHEN DEPTNO=40 THEN 'OPERATIONS'
    END AS DNAME
FROM EMP;   


-- ELSE를 쓰면 NULL도 ACCOUNTING 으로 표시됨으로 잘못된것
-- ELSE는 막강함으로 함부로 사용하면 안된다
SELECT ENAME, DEPTNO,
    CASE
               WHEN DEPTNO=20 THEN 'RESEARCH'
               WHEN DEPTNO=30 THEN 'SALES'
               WHEN DEPTNO=40 THEN 'OPERATIONS'
               ELSE 'ACCOUNTING'
    END AS DNAME
FROM EMP;


-- CASE 문 적을때마다 컬럼이 하나씩 생성되는 것이라 보면된다
-- 그래서 별칭으로 컬럼명을 표시해준다    AS 별칭으로 지정할 이름
SELECT ENAME, DEPTNO,
    CASE WHEN DEPTNO=10 THEN 'ACCOUNTING'
               WHEN DEPTNO=20 THEN 'RESEARCH'
               WHEN DEPTNO=30 THEN 'SALES'
               WHEN DEPTNO=40 THEN 'OPERATIONS'
    END AS 부서명
FROM EMP;   

--바로 위의 것과 비교하라
SELECT ENAME, DEPTNO,
    CASE WHEN DEPTNO=10 THEN 'ACCOUNTING'
               WHEN DEPTNO=20 THEN 'RESEARCH'
               WHEN DEPTNO=30 THEN 'SALES'
               WHEN DEPTNO=40 THEN 'OPERATIONS'
    END --AS 부서명
FROM EMP;   



------------------------------------------------


--사원 중에 급여가 2000원 이상인 경우
--인센티브 1000원 준다
--급여가 2000원 미만인 경우
--인센티브 2000원 제공해 준다

-- FROM 부터적어라 그래야 자동완성도 이용할수있다
SELECT *
FROM EMP;

-- 순서: 보고자하는 테이블 FROM부터 적고 -> 사원이름과 급여를 봐야하니 SELECT ->
-- --> 조건 CASE  END 먼저 적어놓고 -> 조건식 WHEN      THEN
SELECT ENAME, SAL,
    CASE 
              WHEN SAL >=2000 THEN 1000
              WHEN SAL <2000 THEN 2000
    END AS INCENTIVE
FROM EMP;

-- 월급여와 인센티브를 합한 결과를 나타내라
SELECT ENAME, SAL,
    CASE 
              WHEN SAL >=2000 THEN SAL+1000
              WHEN SAL <2000 THEN SAL+2000
    END AS "INCENTIVE + 월급여"
FROM EMP;



--부서 정보에서
--부서 위치를 미국의 동부, 중부, 서부로 구분하라
--NEW YOUR      EAST
--DALLAS          CENTER
--CHICAGO        CENTER
--BOSTON          EAST
--나머지 기타      ETC


SELECT *
FROM DEPT;

-- 데이터의 타입을 먼저 확인하는 습관을 가져라
-- 정신차려라 문자에 '' 싱글따옴표 하라고!!!!!!!!!!
-- LOC 는 VARCHAR2, 문자다 
SELECT LOC, 
    CASE
        WHEN LOC = 'NEW YORK' THEN 'EAST'
        WHEN LOC = 'DALLAS' THEN 'CENTER'
        WHEN LOC = 'CHICAGO' THEN 'CENTER'
        WHEN LOC = 'BOSTON' THEN 'EAST'
        ELSE 'ETC'
    END AS AREA
FROM DEPT;


----------------------------------------

--사원 정보에서 급여가
--2000이상이면 보너스를 1000으로,
--1000이상이면 500으로,
--1000 미만이면 0으로 계산한다
--보너스를 컬럼을 표현한다


--!!!어려움
-- 중첩 CASE문
SELECT ENAME, SAL,
    CASE
        WHEN SAL >= 2000 THEN 1000
        ELSE (CASE WHEN SAL >=1000 
                              THEN  500
                              ELSE 0
                     END
                  )
    END AS BONUS
FROM EMP;



--사원 정보에서 급여가
--3000 이상이면 HIGH로
--1000 이상이면 MID로
--1000 미만이면 LOW로 분류하시오
--ENAME  SAL    SALARY_GRADE
-- SMITH  800    LOW


--해결1) CASE문 - 자바 방식 점수
-- 첫번째 조건이 틀렸다는 전제하에 시작하므로 SAL <3000 를 적지않아도 이미 표현된것
SELECT ENAME, SAL,
    CASE 
            WHEN SAL >=3000 THEN 'HIGH'
            WHEN SAL >=1000 THEN 'MID'    
            ELSE 'LOW'
    END AS SALARY_GRADE
FROM EMP;



--해결2)CASE문 - 중첩방식
SELECT ENAME, SAL, 
    CASE
        WHEN SAL >= 3000 THEN 'HIGH'
        ELSE (CASE  WHEN SAL>=1000 
                                THEN 'MID'
                                ELSE 'LOW'
                    END             
                  )          
   END AS SALARY_GRADE
FROM EMP;