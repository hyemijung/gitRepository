

select *
from emp;

-- 전체 조회 기술
SELECT *
FROM PLAYER;

DESC PLAYER;

-- SELECT문 : 원하는 컬럼명으로 필요한 것만 조회
-- 내가 컬럼을 적는대로 순서대로 조회가 된다

SELECT PLAYER_ID, PLAYER_NAME, TEAM_ID,
            POSITION, HEIGHT, WEIGHT, BACK_NO
FROM PLAYER;                                              --DBMS 는 FROM 뒤의 테이블부터 확인하고 필요한 컬럼의 모든 데이터를 조회                                 



SELECT EMPNO, SAL, ENAME
FROM EMP;

-- DISTINCT 사용
-- 해당 컬럼에 반복하여 존재하는 값을 묶어서 하나로 표시한다 (그룹화) -- 분석통계에 사용된다
SELECT DISTINCT POSITION
FROM PLAYER;


SELECT * 
FROM EMP;


SELECT JOB
FROM EMP;

SELECT DISTINCT JOB
FROM EMP;


--사원 테이블에서 사원들의 부서 번호가 어떤 부서 번호가 존재하는지 확인하시오
--부서번호만 표시

SELECT DISTINCT DEPTNO
FROM EMP;