create table bank(
        account    varchar2(100)     -- 소유자명
   ,    money       number                -- 소유자의 돈
);

create table bank_user(
        name    varchar2(100)
    ,   money   number                   -- 소지금
);



-- 성함, 얼마 예금하실건가요?

insert into bank values('aa', 0);    -- aa 라는 사람이 통장을 개설



select *
from bank;      

select *
from bank_user;

insert into bank_user
values('aa', 100000);

desc bank_user;
UPDATE bank_user
SET money = money-80000;
 
--DML
--insert
--delete
--update


rollback;

  
desc bank;
UPDATE bank
SET money = money+80000;
  
commit;


select *
from test;

delete from test;

commit;
rollback;

-- 테이블 복제 (백업)
create table dept02
AS
select *
from dept;

select *
from dept02;

--테이블 구조 변경하는 명령어 ALTER

--테이블 내용을 추가, 수정, 삭제하는 명령어

DROP TABLE BANK;
DROP TABLE BANK_USER;
DROP TABLE DEPT;
DROP TABLE EMP;
DROP TABLE SAM;
DROP TABLE TEST;

create table emp01
as select *
from emp;

select *       --만들었으면 확인하라
from emp;

--질의어 == SQL

DESC EMP01;

-- 사원 테이블에 취미 컬럼을 추가한다

ALTER TABLE EMP01  --기존의 있는 테이블에 수정하려는 것
ADD(HOBBY VARCHAR2(50));   -- 추가 ADD(컬럼명 데이터타입);  -- 추가하는 것은 마지막에 컬럼명이 저장된다

ALTER TABLE EMP01  --기존의 있는 테이블에 수정하려는 것
ADD(HOBBY2 VARCHAR2(50),);   

ALTER TABLE EMP01  --기존의 있는 테이블에 수정하려는 것
ADD(HOBBY3 VARCHAR2(50), STRENTH VARCHAR2(100));   -- 한번에 두개 추가하는 경우 잘 없다(그냥 하나를 입력하는 것을 기억하자)

DESC EMP01;

SELECT *
FROM EMP01;


--문제
--DEPT02 테이블에 문자 타입의 부서장(DMGR) 컬럼을 추가하시오
--문자열 길이는 10

--EMP02 테이블에 ADDRESS(주소) 컬럼을 추가하시오


create table DEPT02
as select *
from DEPT02;


ALTER TABLE DEPT02
ADD(DMGR VARCHAR2(10));

SELECT *
FROM DEPT02;

DESC DEPT02;


create table emp02
as select *
from emp;

SELECT *
FROM EMP02;

DESC EMP02;


ALTER TABLE EMP02
ADD(ADDRESS VARCHAR2(50));

SELECT *
FROM EMP02;

-- 계정을 만들자
--create user totoexam IDENTIFIED by toto;  -- 시스템 아니라 오류

-- 기존 컬럼을 삭제하자
ALTER TABLE EMP01
DROP COLUMN HOBBY2;

DESC EMP01;

SELECT *
FROM EMP01;

ALTER TABLE EMP01
DROP COLUMN JOB;




