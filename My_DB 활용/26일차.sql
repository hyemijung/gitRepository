--비동등 조인(Non-Equi Join)
--= 이 동등조인
--= 이외의 것 : 비동등조인

select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;


--급여 등급 테이블
select *
from salgrade;


select *
from emp e, salgrade s
where e.sal between s.losal and s.hisal;


--선수에 관한 정보를 출력하시오
--- 선수에 관해 연고지, 팀명, 구장명을 구하시오
--- 선수명을 오름차순 정렬하시오
--출력될 컬럼명
--선수명  포지션  연고지(region_name)  팀명  구장명(stadium_name)

-- 내가한 방법 맞는지 확인 
-- 지문내용과 다르기 때문에 결과가 같아도 틀린것으로 볼수있다
--   팀<=>선수<=>구장 의 관계
-- 선수는 구장과 직접적인 관계가 없다 
-- 정규화가 제대로 안되어있으면 - 오류가 남(관계를 무시하여 짠 것)

select p.player_name            as 선수명
    , p.position                        as 포지션
    , t.region_name                   as 연고지
    , t.team_name                     as 팀명
    , s.stadium_name                as 구장명
from player p, team t, stadium s          -- 출력순서를 봐라 출력에서 스타디움이 마지막이므로 조인걸때도 마지막에 적어줘야(난 stadium을 두번째 적음)
where p.team_id = t.team_id
and p.team_id = s.hometeam_id
order by p.player_name asc;


--수정
-- 선수<=>팀<=>구장  의 관계
select p.player_name        as 선수명
    , p.position                    as 포지션
    , t.region_name               as 연고지
    , t.team_name                  as 팀명
    , s.stadium_name            as 구장명
from player p, team t, stadium s
where p.team_id = t.team_id
and t.stadium_id = s.stadium_id
order by p.player_name asc;



select *
from player;

select *
from stadium;

select *
from team;


-- 분석> 승환씨가 힌트줌!! 세가지 테이블을 연결하라!
-- player : 선수명, 포지션, 팀아이디,
-- stadium : 구장명, 구장아이디, 홈팀 아이디
-- team: 팀아이디, 연고지, 팀네임

select *
from  user_constraints
where table_name = 'PLAYER'
or table_name = 'STADIUM'
or table_name = 'TEAM';

-- 샘풀이!
-- 안시표준조인
select p.player_name 선수명, p.position 포지션,
            t.region_name 연고지, t.team_name 팀명,
            s.stadium_name 구장명
from player p inner join team t
on p.team_id = t.team_id
    inner join stadium s
on t.stadium_id = s.stadium_id
order by 선수명;


--!!!!엄청 어려움!!!!!
--self join 셀프조인
-- 셀프조인 가르치기위해 mgr이 있었던 것
-- 같은 테이블을 조인하는 기술 - 연관있는 컬럼들을 조인시킨다

select *
from emp;
-- mgr은 다 empno에 있는 일련번호로 구성되어 있다

select ename, mgr
from emp;

--from에서 emp테이블을 두개에 조인을 걸음
select employee.ename || '의 매니저는 ' || manager.ename || ' 입니다'
        ,employee.empno 나의사원번호, employee.ename 나의이름
        ,employee.mgr 나의상사번호, manager.ename 상사이름
from emp employee, emp manager                                                                 -- 1
where employee.mgr = manager.empno;                                                       -- 2




--문제> 아래 두문제 모두 셀프조인으로 구하시오
--1. 매니저가 KING인 사원들의 이름과 직급을 출력하세요
--부하직원이름   JOB
--오라클 조인

select *
from emp;
-- 분석)매니저가 KING인 사원들 - 7566 JONES, 7698 BLAKE, 7782 CLARK

select employee.ename as 부하직원이름,  employee.job "JOB"
from emp employee, emp manager
where employee.mgr = manager.empno
and manager.empno = 7839;  


--2. SMITH와 동일한 근무지에서 근무하는 
--사원의 이름을 출력하세요
--나의이름      동료이름    
--SMITH
--안시 표준 조인

--분석) SMITH 근무지 DEPTNO: 20
--동일 근무지 근무하는 사원: 7566 JONES, 7902 FORD


-- 승환씨거 보고옴
-- coworker 를 생각해내야함 - 테이블 별칭처럼 사용하는 것의 응용
--틀린것 기록
select employee.ename as 나의이름, coworker.ename as 동료이름
from employee.deptno inner join coworker.deptno;                     -- 테이블 조인하는곳에 컬럼명을 적음


--두번째 틀린것 기록
select employee.ename as 나의이름, coworker.ename as 동료이름
from emp employee inner join emp coworker
on deptno = 20                                                                       -- 단순히 deptno = 20만 해서 동료와 연관관계가 없다
and employee.ename = 'SMITH'
and coworker.ename <> 'SMITH';


--승환씨꺼 최종
--하지만 보지않았다면 and 이후의 조건을 스스로 생각해서 걸지 못했을 것이다
select employee.ename as 나의이름, coworker.ename as 동료이름
from emp employee inner join emp coworker
on employee.deptno = coworker.deptno                                       -- 단순히 deptno = 20만 해서 동료와 연관관계가 없다
where employee.ename = 'SMITH'
and coworker.ename <> 'SMITH';



--서브쿼리
--인라인 뷰(가상 테이블)  <--> 정적테이블 (괄호없이 원래 사용하던 방식)

--윈도우 함수
--rank over
select rank() over(order by sal desc) 순위, e.*
from emp e
order by sal;

--rownum을 제대로 쓰려면 이정도는 알아야 한다

SELECT rownum 급여순위, E.*
FROM (SELECT *
      FROM EMP
      ORDER BY SAL DESC) E
WHERE ROWNUM <= 5;



--인터넷 검색한 rownum의 정보
--ROWNUM이 부여되는 순서는 테이블에 먼저 입력(INSERT) 된 레코드의 순서대로 번호가 부여되어
--정렬을 하더라도 입력된 순서는 바뀌지 않기 때문이다
--ROWNUM의 한계는 숫자가 1부터 반영이 되기 때문에
--ROWNUM의 중간의 값으로 시작되는 조건의 레코드를 검색할 수 없다.

--인라인 뷰(INLINE VIEW)
-- 인라인 뷰는 FROM 절에 사용되는 서브 쿼리를 의미한다. 
--이전에 알아본 뷰(VIEW)는 CREATE 명령어를 이용하여 생성하지만 
--인라인 뷰는 SQL 문 내부에 뷰를 정의하여 사용한다. 
--CREATE를 사용하지 않기 때문에 인라인 뷰는 일시적으로 사용되는 특징이 있다.

--인라인 뷰를 통해 새로운 테이블을 일시적으로 생성하고, 
--인라인 뷰에 대해서 ROWNUM을 이용하여 쿼리문을 실행하면 원하는 결과를 검색이 가능하다.
--(인라인 뷰에 의해 ROWNUM이 1부터 새로 부여됨)