--선수테이블에서 전체 행의 수, 키 건수, 최대키, 최소키, 평균키를 구하시오
---평균키는 소수점 3째자리에서 반올림
--
--
--480    447    196    165   179.31

-- 승환씨가 도와줌
-- !!!그룹함수 (max, min, sum, avg, count) 는 null이 존재하더라도 null뛰어넘고 연산에 포함하지않는다
-- avg 는 null이 존재하면 계산하지않고 넘어간다
-- 내가 한것 처럼 nvl 처리하면 키가 0 인 선수들까지 더해져서 현실과 달리 키 데이터가 터무니 없이 작아짐
-- 기본키에 not null 이 있으면 된다
select count(*)                       "전체 행의 수" 
          , count(height)              "키 건수"
          , count(*) -  count(height) "height val null cnt"
          , max(height)                 "최대키"
          , min(height)                  "최소키"
          , round(avg(height),2)  "평균키"
from player;



-- 전체 행을 조회하는 건 * 를 사용한다
select count(player_id)         "전체 행의 수" 
          , count(height)              "키 건수"
          , max(height)                 "최대키"
          , min(height)                  "최소키"
          , round(avg(height),2)  "평균키"
from player;


select *
from player;



-- 테이블 구조 복사 - 구조만 그대로 복제하고 데이터를 비워놓는 방식(where절 사용)
-- 12개 중에 WHERE 1=0; 조건절을 이용하여, 1=0이 아니므로 잘못된값을 설정해 데이터를 다 비우는 것(공집합)
as 
select ename, sal, job
create table emp_test
from emp
where 1 = 0;            



select*
from emp_test;


select rownum, emp_test.*
from emp_test;


desc emp_test;


insert into emp_test(
    ename
)
values(null);


-- 전체행을 조회할때는 * 사용!!
-- 아직 구체적 정보는 입력하지않았더라도 전체행 조회가능
-- 구체적 컬럼명으로 count 조회하면 데이터가 없는 null은 세지않으므로 전체가 조회되지 않는다
select count(*), count(ename), count(sal), count(job)
from emp_test;



--포지션별 최대키, 최소키, 평균키를 출력하시오
--포지션   인원수   키대상   최대키   최소키    평균키
--NULL     3	   0      NULL  NULL   NULL     
--GK   	43	 43       196       174    186.26
--DF
--FW
--MF



-- 키대상 의미 몰라서 혜선씨에게 물어봄
-- 포지션이 NULL 인 사람들을 보니 HEIGHT도 다 NULL 이었다
-- 인원수에는 그 3명이 포함되지만 키 값이 있는 대상을 상태로 세어보면 0명이다 - 키대상
select position                          as 포지션
            , count(*)                        as 인원수
            , count(height)               as 키대상
            , max(height)                  as 최대키
            , min(height)                   as 최소키
            , round(avg(height),2)   as 평균키
from player
group by position;




SELECT position
FROM PLAYER
WHERE position IS NULL;

SELECT COUNT(position)
FROM PLAYER
WHERE position IS NULL;

SELECT COUNT(ROWNUM)
FROM PLAYER
WHERE position IS NULL;


-- 샘이 rownum을 쓰는 방법
select *
from emp
where rownum <= 3;

------------------------------------------------------------


-- < Having 절 >
--SELECT 절에 조건을 사용하여 결과를 제한할 때는
--WHERE 절을 사용하며
--그룹의 결과를 제한할 때는 HAVING절을 사용한다

--단일 데이터는 WHERE
--그룹(집합)으로 되어있는 데이터는 HAVING



-- where절에는 집계함수를 사용할수 없다
--having 절은 집계함수를 가지고 조건비교를 할떄 사용
--having 절은 group by 절과 함꼐 사용이 된다


select deptno, avg(sal)
from emp
group by deptno;


-- 부서별 평균 급여가 2000이상인
-- 부서의 부서번호와 부서별 평균 급여를 출려하시오
select deptno, avg(sal)
from emp
group by deptno
having avg(sal) >= 2000;



--부서의 최대값과 최소값을 구하되
--최대 급여가 2900 이상인 부서만 출력하시오
--DEPTNO    MAX(SAL)   MIN(SAL)



select deptno, max(sal), min(sal)
from emp
group by deptno
having max(sal) >= 2900;




--1. 선수테이블에서 포지션별 평균키가 180센티미터 이상인
--정보만을 표시하오
--포지션	        평균키


select position as 포지션, avg(height) as 평균키
from player
group by position
having avg(height) >= 180;




--2. k-리그의 선수들 중
--삼성블루윙즈와 FC 서울의 인원수는 얼마인가
--팀_ID    인원수

--삼성블루윙즈 k02
--FC 서울 k09


--오류-내가 처음 시도한 방법
select team_id      as 팀_ID
        , count(team_id = 'K02') "삼성블루윙즈 인원수"
        , count(team_id = 'K09') "FC서울의 인원수"
from player
group by team_id;


--혜선씨가 도와줌
-- 여기서 난 두번쨰 실수함 count(team_id)를 한것 - 이렇게 하면 팀아이디가 null 인 선수는 조회안됨
-- count(*) 해야 전체 인원수 조회가능
-- 더 일처리가 빠름
select               team_id                                                as 팀_ID
                        , count(*)                                              as 인원수
from                  player
where               team_id = 'K02' or team_id = 'K09'   
group by          team_id;


-- 이것도 맞다 의미는 같으나 속도가 더 느리다 - 그룹화하는것은 어렵고 오래 걸린다
SELECT      TEAM_ID AS "팀_ID", COUNT(*) AS 인원수
FROM          PLAYER
GROUP BY  TEAM_ID
HAVING      TEAM_ID = 'K02' OR TEAM_ID = 'K09';

--3.포지션별 평균키만 출력하는데
--최대키가 190cm 이상인 선수를 가지고 있는
--포지션의 정보만 조회하시오(평균키는 소수점 3자리에서 반올림)
--포지션		평균키

select position                         as 포지션
        , round(avg(height),2)      as 평균키
from player
group by position
having max(height) >= 190;



--------------------------------------------------


--< order by절 >
--정렬
--정렬은 크기 순서대로 나열하는 것이다
--정렬은 크게 두 가지로 나누어진다
--작은 값이 출력되면서 갈수록 큰 값이 출력되는 오름차순(ascending)
--큰 값이 출력되면서 아래로 갈수록 작은 값이 출력되는 내림차순(descending) 정렬 방식이 있다


--asc : 조회한 데이터를 오름차순으로 정렬한다(생략가능)
--desc : 조회한 데이터를 내림차순으로 정렬한다


select *
from emp;


--급여순으로 데이터 볼수있는 것
-- 사원테이블에서 급여가 가장 작은 값에서 
--가장 큰 급여순으로 출력하시오

--묵시적 오름차순
select *
from emp
order by sal;

--명시적 오름차순
select *
from emp
order by sal asc;


--명시적 내림차순
select *
from emp
order by sal desc ;



-------------------------------------------------------------------

--표현식은 한글을 써서 (컬럼명,테이블명,조건식,표현식)을 표현하라는 것!!!!!!!


--표현식
--SELECT 컬럼명                                              5
--FROM 테이블명                                                 1
--[WHERE 조건식]                                               2
--[GROUP BY 컬럼명이나 표현식]                              3
--[HAVING 그룹조건식]                                           4         
--[ORDER BY 컬럼이나 표현식 [ASC 또는 DESC]]       6      



--실행순서
--: FROM -> WHERE -> GROUP BY -> HAVING  -> SELECT -> ORDER BY 

--1: 발췌 대상 테이블을 참조한다
--2: 발췌 대상 데이터가 아닌 것은 제거한다
--3: 행들을 소그룹화 한다
--4: 그룹핑된 값의 조건에 맞는 것만을 출력한다
--5: 데이터 값을 출력/계산한다
--6: 데이터를 정렬한다


select dept.*, deptno*10 as newcol
from dept
order by deptno desc, dname asc, loc desc;

desc dept;

select dept.*, deptno * 10 as newcol
from dept
order by 1 desc, 2 asc, 3 desc;


select dname, loc, deptno
from dept
order by 1 desc, 2 asc, 3 desc;


select dept.*, deptno*10 as newcol
from dept
order by newcol;


select dept.*, deptno*10 as newcol
from dept
order by newcol desc, 1 desc;


--1. 사원의 정보를 입사한 날짜가 가장 오래된 
--순서대로 출력하시오(일반인의 표현)
--모든 컬럼 표시

select *
from emp
order by hiredate asc;



--2. 가장 최근에 입사한 사람부터 조회가 가능하도록 
--SQL문을 작성하시오(우리가 작성하고 있는것이 sql문이다 - 코드치는 것, 데이터베이스를 조작할수 있는 것)
--모든 컬럼 표시

select *
from emp
order by hiredate desc;





--1.EMP테이블의 자료에서 입사일을 오름차순으로 정렬하여 출력하되 
--사원번호, 사원명, 직급, 입사일 컬럼을 출력하는 쿼리문을 작성하세요

select empno              as 사원번호
          , ename              as 사원명
          , job                   as 직급
          , hiredate          as 입사일
from emp
order by hiredate asc;



--2. EMP테이블의 자료르 사원번호를 기준으로 내림차순으로 정렬하여 
--사원번호와 사원명 컬럼을 표시하세요
--(단, 컬럼명은 영어로 표시한다)

select empno, ename
from emp
order by empno desc;



----------------------------------------------

select *
from emp
order by sal desc;


-- 만약에 sal이 같다면 그 다음은 ename 기준으로 내림차순으로 정리하라는 것
--위와 비교해서 ward 와 martin이 바뀌는 것을 확인하라
select *
from emp
order by sal desc, ename desc;


-- 
select ename
from emp
order by hiredate desc, sal asc;


--3. 부서 번호가 빠른 사원부터 출력하되
--같은 부서내의 사원을 출력할 경우
--최근에 입사한 사원부터 출력하되 
--사원번호, 입사일,사원명,급여순으로 출력하시오

select empno        as 사원번호
        , hiredate      as 입사일
        , ename         as 사원명
        , sal               as 급여
from emp
order by deptno asc, hiredate desc;



--4.선수테이블에서 선수들의 이름, 포지션, 백넘버를 출력하는데 사람 이름을 내림차순으로 출력하시오
--선수명, 포지션, 백넘버


select player_name   as 선수명
            , position       as 포지션
            , back_no        as 백넘버
from player
order by player_name desc;


--5. 키가 큰 순서대로, 키가 같은 경우 백넘버 순으로
--적용하시오
--(단, 키가 null인 데이터는 제외한다)
--선수이름, 포지션, 백넘버,  키


select player_name      as 선수이름
           , position            as 포지션
           , back_no             as 백넘버
           , height                as 키
from player
where height is not null
order by height desc, back_no asc;





-- < VIEW >

--뷰
--VIEW 보다
--
--실제 테이블에 저장된 데이터를 뷰를 통해서 볼 수 있다
--
--뷰는 물리적인 테이블에 근거한 논리적인 가상 테이블이라고 정의할 수 있다. 
--가상이란 단어는 실질적으로 데이터를 저장하고 있지 않기 때문에 붙인것이다.
--(뷰의)테이블이라는 단어는 실질적으로 데이터를 저장하고 있지 않더라도
--사용자는 마치 테이블을 사용하는 것과 동일하게 뷰를 사용할 수 있기 때문에 붙인 것이다.

select empno, ename, job, mgr
        , hiredate, comm, sal, sal*12 yearsal
from emp;


select ename, job, sal, sal*12 yearsal
from emp;


-- 급여 대장부
create view emp_books_view
as
select ename, job, sal, sal*12 yearsal
from emp;


-- 뷰 테이블을 만들때 들어가지 않은 정보는 이후에 뷰에서 조회할수가 없다 - 그래서 오류 뜸
select empno
from emp_books_view;



drop view  emp_books_view2;





create view emp_books_view2
as
select ename, job, sal, sal*12 yearsal
from emp
where 1 = 0;;


select *
from emp_books_view;


select *
from emp_books_view
where rounum <=3;





--문제>
--사원테이블에서 입사년도, 입사일, 입사시간, 입사분, 입사초와 같이 날짜 단위들을 view로 생성 하시오
--
--2000년1월1일 0시 0분 0초  를 기준으로 빼기해서 계산한다
--2000년1월1일 0시 0분 0초  - 입사날짜 as 경력년수

--사원번호, 사원이름, 입사날짜, 경력년수, 경력초
-- 입사한 년도가 몇년쨰인지 입사일이 몇일쨰인지 입사시간이 몇시간째인지 입사초가 몇초쨰인지

drop view emp_clock_view;

--trunc 대신 floor 써도됨
-- floor는 소수점 아래를 버리는 함수
-- trunc는 특정 자릿수에서 잘라내는 함수
-- 이문제는 floor든 trunc든 소수점 아래만 버리면 되는것이 상관없음
create view emp_clock_view
as
select empno                                                                                                                                                 as 사원번호
          , ename                                                                                                                                                 as 사원이름
          , hiredate                                                                                                                                              as 입사날짜
          , trunc( (to_date('2000-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') - hiredate)/365)          as 경력년수 
          , (to_date('2000-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') - hiredate)*(24*60*60)            as 경력초
from emp;



select *
from emp_clock_view;


------------------------------------------------------------------


--!!!!!몹시 어려움

--조인(JOIN)

--관계형 데이터베이스에서는 테이블 간의 관계를 중요시 한다.
--하나 이상의 테이블을 빈번히 결합하여 사용하는데 
--이때 사용된는 것을 조인이라고 한다.

--2개 이상의 테이블을 통해 원하는 정보를 얻기 위해서는
--여러 테이블을 조인해야 한다. 

--equi join (동등조인)

--[표현식]
--select 테이블1.컬러명, 테이블2.컬럼명, ...
--from 테이블1, 테이블2
--where 테이블1.컬럼명1 = 테이블2.컬럼명2;  <- 조인구문


-- 동등조인 (equi join)

-- 사원의 정보와 각 사원의 부서정보를 
-- 조회하시오
select *
from emp, dept
where emp.deptno = dept.deptno;


select emp.ename, dept.deptno, dept.dname
from emp, dept
where emp.deptno = dept.deptno;


--두테이블간의 관계와 제약조건을 조회할수 있다
--emp에서 왜래키 제약조건을 걸었으니 자식이고, dept가 부모이다

--마음대로 조인하는 것이 아니다!!! 왜래키로 참조하므로 조인 가능한것!!!

select *
from user_constraints
where table_name = 'EMP'
or table_name = 'DEPT';



--alias 별칭
-- 테이블명도 별칭 지정이 가능하다 
-- from 에서 테이블명 (한칸 띄워쓰고) 테이블명의 별칭 - 적어주면 된다
-- emp e : 앞으로 emp 테이블 별칭은 e 라고 하자는 것
-- join은 where에서 하는것!!
select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc as 이것도 별칭
from emp e, dept d
where e.deptno = d.deptno;




--선수 테이블과 팀 테이블에서 선수 이름과 소속된 팀의 이름을 출력하시오
--
--선수명 소속팀명 

select p.player_name            as 선수명
          , t.team_id                     as 소속팀명
from player p, team t
where p.team_id = t.team_id;



select *
from user_constraints
where table_name = 'PLAYER'
or table_name = 'TEAM';



-- 명선씨가 궁금해 한것
SELECT EMP.ENAME, DEPT.DEPTNO, DEPT.DNAME
FROM EMP,DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
ORDER BY DEPTNO, ENAME;


-- column ambiguously defined
-- team_id 가 두 테이블 모두에 존재한다 그러므로 어디의 팀 아이디를 기준으로 정렬해야할지 모르겠다는것
SELECT *
FROM PLAYER, TEAM
WHERE PLAYER.TEAM_ID = TEAM.TEAM_ID
ORDER BY TEAM_ID;


-- 팀테이블의 팀아이디 를 보고 정렬하라는 뜻- 위의 문제에서 모호함을 해결함
SELECT *
FROM PLAYER, TEAM
WHERE PLAYER.TEAM_ID = TEAM.TEAM_ID
ORDER BY TEAM.TEAM_ID;



--문권씨가 궁금해한 것
-- 7200개 나옴
select count(*)
from player, team;

-- 48개 나옴
-- emp 각 행마다 dept가 조인된 것 -> cross join 크로스 조인 -> 하면 절대 안됨!!! 과부화 걸림!!!
select count(*)
from emp, dept;


select *
from emp, dept
where emp.deptno = dept.deptno;



-- 사원 중에 SMITH라는 이름의 사원에 대해 
--이름과 부서명을 출력하시오
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.ename = 'SMITH';


--사원 중 입사일이 현재날짜 보다 작거나 같은
-- 사원의 이름과 부서명을 조회하시오 (부서가 없는 사원은 제외)
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.hiredate <= sysdate;

-- 외부조인(몰라도됨) -- 부서가 없는 사원은 제외된다는 조건이 없을경우- 부서가 없는 사원도 조회되도록
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno(+)
and e.hiredate <= sysdate;




-- 오라클 전용 SQL문
select   e.ename, d.dname
from      emp e, dept d
where    e.deptno = d.deptno;
--and   e.ename = 'SMITH';


-- ANSI STANDARD JOIN : 안시 표준 조인
--!!!무조건 알아야함
-- 내부조인 inner join >= 동등조인 (오라클) 과 비슷하지만 더 큰 개념
-- 내부조인 (동등조인=, 범위조인)

--차이점 inner join
-- on 절에 적음

select e.ename, d.dname
from    emp e inner join dept d
on        e.deptno = d.deptno;


select e.ename, d.dname
from    emp e inner join dept d
on        e.deptno = d.deptno
where  e.ename = 'SMITH';



---오라클조인
---안시표준조인 둘다 사용해서 풀자!!!

--조인을 사용하여
--1.뉴욕에 근무하는 사원의 이름과 급여를 출력하시오
--ENAME SAL


--오라클조인
select      e.ename, e.sal 
from         emp e, dept d
where      e.deptno = d.deptno
and          d.loc = 'NEW YORK';

--안시표준조인
select      e.ename, e.sal 
from        emp e inner join dept d
on            e.deptno = d.deptno
where     d.loc = 'NEW YORK';


--2. ACCOUNTING 부서 소속 사원의 이름과
--입사일을 SQL문으로 작성하시오
--ENAME  HIREDATE


--오라클조인
select      e.ename, e.hiredate 
from         emp e, dept d
where      e.deptno = d.deptno
and          d.dname = 'ACCOUNTING';

--안시표준조인
select      e.ename, e.hiredate 
from         emp e inner join dept d
on             e.deptno = d.deptno
and          d.dname = 'ACCOUNTING';



--3. 직급이 MANAGER인 사원의
--이름, 부서명을 조회하되
--사원의 이름순으로 정렬하시오
--ENAME   DNAME


--오라클조인
select         e.ename, d.dname
from           emp e, dept d
where        e.deptno = d.deptno
and            e.job = 'MANAGER'
order by    e.ename asc;

--안시표준조인
select         e.ename, d.dname
from            emp e inner join dept d
on                e.deptno = d.deptno
where         e.job = 'MANAGER'
order by     e.ename asc;

-- 컬럼명이 특정테이블에만 존재하는 컬럼명이더라도 미래의 유지보수를 위해 - 테이블.컬럼명 하여 누가봐도 쉽게 알수있도록 하는 것이 좋다




-- 비동등 조인
--범위를 구하는 코드가 조건절에 오면 , 비동등 조인이 된다
select    e.empno, e.ename, e.job, e.sal, d.dname
from      emp e join dept d
on          e.deptno = d.deptno
where   e.sal between 1000 and 3000 ;


--위의 것을 오라클 조인으로 구하라(두가지로)
--첫번쨰는 SQL연산자 사용해서 구하고, 두번째는 SQL 연산자 없이 구하라
--기본 연산으로 구하시오

select     e.empno, e.ename, e.job, e.sal, d.dname
from        emp e , dept d
where      e.deptno = d.deptno
and          e.sal between 1000 and 3000;


select     e.empno, e.ename, e.job, e.sal, d.dname
from        emp e , dept d
where      e.deptno = d.deptno
and          e.sal >= 1000 and e.sal <= 3000;
