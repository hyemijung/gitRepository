SELECT *
FROM EMP01;

DESC EMP01;

--DROP TABLE EMP01;

CREATE TABLE EMP01
AS
SELECT *
FROM EMP;

--직급 컬럼을 최대 30글자까지 저장할 수 있도록 변경한다

ALTER TABLE EMP01
MODIFY(JOB VARCHAR2(30));

DESC EMP01;

DROP TABLE EMP02;

CREATE TABLE EMP02
AS
SELECT *
FROM EMP01;

DESC EMP02;

SELECT *
FROM EMP02;


--현재 가지고 있는 데이터의 크기보다 작은 크기로 변경할 수 없다
ALTER TABLE EMP02
MODIFY (JOB VARCHAR2(5));

--안의 데이터를 삭제하여 컬럼의 크기를 마음대로 변경할 수 있도록 함
DELETE FROM EMP02;

-- 길이가 아니라 타입을 변경해보자
ALTER TABLE EMP02
MODIFY (SAL VARCHAR2(100));

DESC EMP02;

SELECT *
FROM DEPT;

DESC DEPT;

CREATE TABLE DEPT01
AS
SELECT *
FROM DEPT;

DESC DEPT01;

--<컬럼명 바꾸기>
--[형식]
--ALTER TABLE 테이블명
--RENAME COLUMN 변경해야 할 컬럼명 TO 새로운 컬럼명;

ALTER TABLE DEPT01
RENAME COLUMN LOC TO LOCATION;

--<테이블명 변경하기>
--[형식]
--RENAME 변경 전 테이블명 TO 변경 후 테이블명

RENAME DEPT01 TO DEPARTMENT;

DESC DEPARTMENT;


--<제약조건>
--테이블에 새로운 행을 추가 INSERT INTO 문
--
--[형식]
--1. INSERT INTO 테이블명 (넣고자 하는 컬럼명들)
--VALUES (넣고자 하는 컬럼명들에게 넣을 데이터 리스트);
--INSERT INTO
--
--2. INSERT INTO 테이블명 
--VALUES (전체 컬럼에 넣을 데이터 리스트);

--<부가설명>
--해당 컬럼명과 입력되어야 하는 값을 서로 1:1로 매핑해서 입력한다

CREATE TABLE TEST
(
    NO NUMBER,
    NAME VARCHAR2(10),
    AGE NUMBER,
    BIRTHDAY DATE
);

DESC TEST;

SELECT *
FROM TEST;

INSERT INTO TEST
(NO, AGE, NAME)      -- 컬럼명들 순서도 상관없다(그래도 순서대로 넣는게 좋다) -- 하나든 여러개든 넣고자 컬럼명들 넣어주면됨
VALUES                
(1, 10, 'aaa');          -- 해당 컬럼명과 서로 1:1매핑 -- 컬럼명들 순서대로 데이터를 넣는다

INSERT INTO TEST
value (NO, AGE, NAME)      --원래는 앞에 value를 적어줘야함(안적어도 묵시적으로 존재)
VALUES                
(2, 20, 'bbb');    

SELECT *
FROM TEST;

insert into test                    --INSERT INTO 테이블명 
values(4, 'ddd', 40, null);         --VALUES (전체 컬럼에 넣을 데이터 리스트);

select * 
from dept;

desc dept;

CREATE TABLE dept01
as
select *
from dept;

desc dept01;

select *
from dept01;

insert into dept01
values(50, 'education', 'ganknam');

insert into dept01
(deptno, loc)
values
(60, 'seoul');


--< 테이블의 내용을 수정 UPDATE문>
--
--[형식]
--UPDATE 테이블명
--SET 변경하고자 하는 데이터가 있는 컬럼명 = VALUE1
--COLUMN2 = VALUE2
--WHERE 조건문;

SELECT *
FROM EMP03;

UPDATE EMP03
SET DEPTNO = 30,
      COMM = 100;

CREATE TABLE EMP03
AS
SELECT *
FROM EMP;

SELECT *
FROM DEPT;


SELECT *
FROM EMP;

SELECT *
FROM DEPT;

DROP TABLE DEPT01;

CREATE TABLE DEPT01
AS
SELECT *
FROM DEPT;

SELECT *
FROM DEPT01;

--<WHERE문 -> 조건문>
--UPDATE 테이블명
--SET 변경하고자 하는 데이터가 있는 컬럼명 = VALUE1
--COLUMN2 = VALUE2
--WHERE 조건문;

UPDATE DEPT01
SET DNAME = 'ACCOUNT'
WHERE DNAME = 'ACCOUNTING';


--<테이블의 불필요한 행을 삭제하는 DELETE문>
--[형식]
--DELETE FROM 삭제를 원하는 정보가 들어있는 테이블명
--WHERE 조건절;

DELETE FROM DEPT01;

COMMIT;

select *
from dept;

select *
from test;

insert into test
values (1, 'aaa', 10, null);

commit;

--이름으로 찾는 것은 중복이 될수있지만
select *
from test
where name = 'aaa';

select *
from dept;

--유일한 숫자로 되어있는 것을 숫자로 찾는다면 중복없이 찾을 수 있다
select *
from test
where no = 2;




--제약조건 확인하기

DESC USER_CONSTRAINTS;

SELECT *
FROM USER_CONSTRAINTS;


SELECT *
FROM EMP01;

DROP TABLE EMP01;

CREATE TABLE EMP01
(
    EMPNO   NUMBER(4),
    ENAME   VARCHAR2(10),
    JOB      VARCHAR2(9),
    DEPTNO  NUMBER(2)
);

SELECT * FROM EMP01;

INSERT INTO EMP01                         
VALUES(NULL, NULL, 'SALES', 30);    -- 언젠가는 사원번호와 사원이름 넣겠어라는 의미로 NULL을 넣은 것


--NOT NULL                 NULL을 허용하지 않는다

DROP TABLE EMP02;

CREATE TABLE EMP02(
    EMPNO   NUMBER(4) NOT NULL,                    --NOT NULL 제약조건
    ENAME   VARCHAR2(10) NOT NULL,
    JOB      VARCHAR2(9),
    DEPTNO  NUMBER(2)
);

INSERT INTO EMP02                         
VALUES(1, 'AAA', NULL, NULL);

DESC EMP02;

DROP TABLE PRODUCT;

CREATE TABLE PRODUCT(
    PRODUCT_NUMBER  NUMBER(2) NOT NULL,
    PRODUCT_NAME    VARCHAR2(100) NOT NULL,
    PRODUCT_COMPANY VARCHAR2(100)
);

INSERT INTO PRODUCT
VALUES(10, '핸드프로', '합격하자');

INSERT INTO PRODUCT
VALUES(20, '티비', '엘지');

INSERT INTO PRODUCT
VALUES(30, '스마트폰', '삼성');

SELECT * 
FROM PRODUCT;

SELECT * 
FROM EMP01;

DELETE FROM EMP01;
COMMIT;

INSERT INTO EMP01
VALUES(7499, 'AAA', 'SALES', 30);
INSERT INTO EMP01
VALUES(7499, 'BBB', 'MANAGER', 20);


--UNIQUE

DROP TABLE EMP03;

CREATE TABLE EMP03(
    EMPNO   NUMBER(4) UNIQUE,                    --UNIQUE 제약조건
    ENAME   VARCHAR2(10) UNIQUE,               -- 동명이인 불가능(UNIQUE)
    JOB      VARCHAR2(9),
    DEPTNO  NUMBER(2)
);

INSERT INTO EMP03
VALUES(7499, 'AAA', 'SALES', 30);
INSERT INTO EMP03
VALUES(7501, 'BBC', 'MANAGER', 20);

SELECT * FROM EMP03;



CREATE TABLE DEPT04(
    DEPNO NUMBER(2,0) UNIQUE,
    DNAME VARCHAR2(14),
    LOC VARCHAR2(13) UNIQUE    
);

INSERT INTO DEPT04
VALUES(10, 'ACCOUNT', 'BUSAN');
INSERT INTO DEPT04
VALUES(20, 'SALES', 'SEOUL');
INSERT INTO DEPT04
VALUES(30, 'HUMAN RESOUCE', 'JINJU');



SELECT *
FROM DEPT04;

DESC DEPT04;

--제약 조건확인 명령어
SELECT *
FROM USER_CONSTRAINTS;

--제약조건명을 명시하여 작성
--[형식]
--컬럼명 타입 CONSTRAINT 제약조건명 제약조건
CREATE TABLE EMP04(
    EMPNO   NUMBER(4) CONSTRAINT EMP04_EMPNO_UK UNIQUE,         --CONSTRAINT 테이블명_컬럼명_UK(UNIQUE KEY)          
    ENAME   VARCHAR2(10) CONSTRAINT EMP_ENAME_NN NOT NULL,     --CONSTRAINT 테이블명_컬럼명_NN(NOT NULL)         
    JOB      VARCHAR2(9),
    DEPTNO  NUMBER(2)
);

-- 제약조건명 명명규칙
--테이블명_컬럼명_제약조건명

SELECT *
FROM EMP03;

DELETE FROM EMP03;
COMMIT;

INSERT INTO EMP03
VALUES(NULL, 'JONES', 'MANAGER', 20);

INSERT INTO EMP03
VALUES(NULL, 'JONES', 'SALES', 10);

DROP TABLE EMP05;

CREATE TABLE EMP05(
    EMPNO   NUMBER(4) CONSTRAINT EMP05_EMPNO_PK PRIMARY KEY,                  
    ENAME   VARCHAR2(10) CONSTRAINT EMP05_ENAME_NN NOT NULL,               
    JOB      VARCHAR2(9),
    DEPTNO  NUMBER(2)
);

INSERT INTO EMP05
VALUES(7000, 'JONES', 'MANAGER', 20);  --두명의 JONES을 이름으로 구분할 방법이 없다

INSERT INTO EMP05
VALUES(7001, 'JONES', 'SALES', 10);  

INSERT INTO EMP05
VALUES(7499, 'ALLEN', 'SALES', 30);

SELECT *
FROM EMP05;

SELECT *
FROM EMP05
WHERE EMPNO = 7001;          -- 이름이 같은 두명을 구분할때 일련번호를 이용해 찾는다(PRIMARY KEY)

--NOT NULL + UNIQUE KEY = PRIMARY KEY
DROP TABLE PRODUCT;

CREATE TABLE PRODUCT(
    PRODUCT_NUMBER  NUMBER(2) CONSTRAINT PRODUCT_PRODUCT_NUMBER_PK PRIMARY KEY,
    PRODUCT_NAME     VARCHAR2(100) CONSTRAINT PRODUCT_PRODUCT_NAME_NN NOT NULL,
    PRODUCT_PRICE     NUMBER(6) CONSTRAINT PRODUCT_PRODUCT_PRICE_NN NOT NULL
);

INSERT INTO PRODUCT
VALUES(10, 'EPSON_SERIES1', 10000);

INSERT INTO PRODUCT
VALUES(20, 'EPSON_SERIES2', 100000);

INSERT INTO PRODUCT
VALUES(30, 'EPSON_SERIES1', 20000);

SELECT *
FROM PRODUCT;

SELECT *
FROM PRODUCT
WHERE PRODUCT_NUMBER = 10;