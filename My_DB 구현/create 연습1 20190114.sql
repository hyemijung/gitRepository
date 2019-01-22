--파일명.sql

--형식
--새로운 테이블을 생성하는 명령어

--CREATE TABLE table_name(
--   컬럼명1, data_type,
--   column_name2, data_type,
--   column_name3, data_type,
--   ....
--);

--테이블명: ban 
--이름, 성별, 나이
--stuName, sex, age

CREATE TABLE BAN(
   stuName varchar2(20),
   sex varchar2(6),
   age number(3)
);

--테이블 내용 조회 방법
--select * from 테이블명;
select *
from ban;

select *                              
from emp;

-- 테이블 구조를 분석해서 보여준다
desc ban;

-- 테이블에 데이터(내용)를(을) 삽입한다, 입력한다
insert into ban 
    (stuName, sex, age)
values(
    '홍길동', '남', 20
);

ROLLBACK; -- 되돌리다



--부서
--부서명       문자열 100
--부서인원수          숫자 1
--부서특활비           숫자 7   (1000000)

--대소문자 구분 안함
create table officeDept
(
        deptName VARCHAR(100)
    ,   dept_people_count number(1)
    ,   dept_poket_money number(7)
);

desc officeDept;




