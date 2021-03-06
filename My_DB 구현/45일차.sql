SELECT      E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO,D.DNAME
FROM        EMP E, DEPT D
WHERE       E.DEPTNO = D.DEPTNO AND E.DEPTNO IS NOT NULL
ORDER BY    D.DEPTNO;

CREATE TABLE LICENSE_INFO(
SNUMBER      NUMBER(2),
NAME        VARCHAR2(10),
ADRESS      VARCHAR2(20),
PHONE       VARCHAR2(50),
LICENSE     VARCHAR2(20),
LNUMBER     NUMBER(5),
LDATE       VARCHAR2(10)
);

--DROP TABLE LICENSE_INFO;
SELECT * FROM LICENSE_INFO;

INSERT INTO LICENSE_INFO(SNUMBER,NAME,ADRESS,PHONE,LICENSE,LNUMBER,LDATE)
VALUES (1,'김개똥','하와이','010-9999-9999','정보처리',12345,'대4');

INSERT INTO LICENSE_INFO(SNUMBER,NAME,ADRESS,PHONE,LICENSE,LNUMBER,LDATE)
VALUES (1,'김개똥','하와이','010-9999-9999','워드1급',23456,'고2');

INSERT INTO LICENSE_INFO(SNUMBER,NAME,ADRESS,PHONE,LICENSE,LNUMBER,LDATE)
VALUES (1,'김개똥','하와이','010-9999-9999','SQLD',34567,'고3');

INSERT INTO LICENSE_INFO(SNUMBER,NAME,ADRESS,PHONE,LICENSE,LNUMBER,LDATE)
VALUES (1,'김개똥','하와이','010-9999-9999','TOEIC',45678,'고3');
