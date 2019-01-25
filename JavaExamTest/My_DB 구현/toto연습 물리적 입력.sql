--테이블명: dept 부서 테이블
--
--컬럼명: 부서명 층수 인원

CREATE TABLE DEPT(
    DEPTNAME VARCHAR2(30),
    FLOOR NUMBER,
    NUM_OF_PEOPLE NUMBER(30)
 );
    

--테이블에 새로운 행을 추가하는 insert문
--insert into 테이블명
--(컬럼명, 컬럼명2, ...)
--values
--(컬럼에 넣을 값, 컬럼에 넣을 값2, ...):

desc dept;

insert into dept 
(deptname, floor, num_of_people)
values
('운영', 12, 16);

insert into dept 
(deptname, floor, num_of_people)
values
('편입지원', 13, 5);

select *
from dept;

--오라클 싱글 따옴표만 문자로 인식

insert into dept 
(deptname, floor, num_of_people)
values
('aaaaaabbbbbbcccccdddddeeeeefffff1', 13, 5);


insert into dept 
(deptname, floor, num_of_people)
values
('가나다라마바사ㅁㅂㅈ1', 13, 5);

--한글 글자 1자는 (3byte)
--select  LENGTHB ('ㅎ'), LENGTHB('a')
--from dual;



desc book;

-- number에 대해 배워보자!!

insert into book
(title, writer, price)
values
('다이나믹 오라클 11g', '성윤정', 2500.0);

insert into book
(title, writer, price)
values
('다이나믹 오라클 11g', '홍길동', 3500);


insert into book
(title, writer, price)
values
('다이나믹 오라클 11g', '홍길동', 3500.9);


--정밀성
--value larger than specified precision allowed for this column


select * 
from book;



--생성된 테이블을 지우는 명령어
--DROP TABLE 테이블명;

DROP  TABLE BAN;

DROP TABLE BOOK;

DROP TABLE EMP;

DROP TABLE DEPT;



-- 문제
-- DB는 대소문자를 구분하지 않으므로 의미가 구분될때 _ 를 넣어준다

--테이블명 SAM
--
--SAM_NAME    선생님 이름  30
--SEX             성별           10
--MEET_YEAR   만난지 몇 년  NUMBER  3자리
--
--테이블을 만드시오
--
--데이터는 자신의 경험으로 알아서 2사람 넣으시오

-- 가독성을 위해 들여쓰기하라(자동완성 없다)

CREATE TABLE SAM(
    SAM_NAME    VARCHAR2(30),
    SEX             VARCHAR2(10),
    MEET_YEAR    NUMBER(3)
);

DESC SAM;

INSERT INTO SAM
(
    sam_name, 
    SEX, 
    MEET_YEAR
)VALUES(
    '박성욱', '남자', 1
);


INSERT INTO SAM
(
    sam_name, 
    SEX, 
    MEET_YEAR
)VALUES(
    '이연수', '여자', 3
);

SELECT *
FROM SAM;

--에러가 뜨면 그것부터 해결해야 한다.

----<테이블 식별자 명명규칙>
--1. 반드시 문자로 시작해야 함
--2. 1~30자까지 가능함
--3. A~Z까지의 대소문자와 0~9까지의 숫자, 특수 기호는(_, $, #)만 포함 가능
--4. 오라클에서 사용되는 예약어나 다른 객체명과 중복 불가
--5. 공백 허용 안함


-- 글을 명령어로 변환시킬줄 알아야함

--사원(EMP) 테이블
--
--사원 번호 컬럼, 사원명 컬럼, 급여 컬럼
--
--사원번호: 4자리 숫자
--사원명: 20자리 문자열
--급여: 정수 5자리 소수점 2자리 까지 표현 가능

--사원 테이블 생성
--사원 3명의 내용을 모두 입력한다 (동기 3명)
--사원 테이블을 조회하시오

CREATE TABLE EMP(
    EMP_NUMBER NUMBER(4),
    EMP_NAME    VARCHAR2(20),
    EMP_SALARY NUMBER(5, 2)
);

DROP TABLE EMP;

CREATE TABLE EMP(
    EMP_NUMBER NUMBER(4),
    EMP_NAME     VARCHAR2(20),
    EMP_SALARY   NUMBER(5, 2)
);

DESC EMP;

INSERT INTO EMP
(   
    emp_number,
    EMP_NAME,
    EMP_SALARY
)
VALUES
(
    2019, '최주희', 240.00
);
    
INSERT INTO EMP
(   
    emp_number,
    EMP_NAME,
    EMP_SALARY
)
VALUES(
    2016, '이명선', 270.84
);

INSERT INTO EMP
(   
    emp_number,
    EMP_NAME,
    EMP_SALARY
)
VALUES(
    2017, '최문권', 250.30
);

SELECT *
FROM EMP;





CREATE TABLE DEPT(
    DEPTNO  NUMBER(2),
    DNAME   VARCHAR2(14),
    LOC       VARCHAR2(13)
);


DESC DEPT;

--    DEPTNO  NUMBER(2),             >> 부서 번호는 2자리 정수로 이루어짐
--    DNAME   VARCHAR2(14),        >> 부서 이름은 문자열을 받을수 있는데14자리 문자로 이루어짐
--    LOC       VARCHAR2(13)         >> 부서 위치는 문자열을 받을수 있는데 13자리 문자로 이루어짐


----물리적인 설명     VS          논리적인 설명
--테이블명: DEPT                          부서
--컬럼명: DEPTNO                          부서번호
--DNAME                                     부서명
--LOC                                         부서위치


---물리적인 영역 - 실제 SQL을 칠수 있는 부분
---논리적인 영역 - 

DESC SAM;

-- 샘이라는 테이블을 만듬
-- 샘 이름은 문자열을 받는데 30자리 문자 입력가능
-- 성별은 문자열을 받는데 10자리 문자 입력가능
-- 알고지낸 해는 숫자를 받는데 3자리 정수 입력가능


DESCRIBE DEPT;

INSERT INTO DEPT
(
    DEPTNO,
    DNAME,
    LOC
)VALUES(
    10,
    'SALES',
    'SEOUL'
);


INSERT INTO DEPT
(
    DEPTNO,
    DNAME,
    LOC
)VALUES(
    20,
    'MARKETING',
    'BUSAN'
);

COMMIT;

SELECT *
FROM DEPT;
