create user totoExam IDENTIFIED by toto account unlock;

--alter user totoExam account unlock;    -- 계정을 안쓸때 잠그거나 풀수있다

GRANT CONNECT TO totoExam;
GRANT RESOURcE TO totoExam;
GRANT CONNECT TO totoExam;

--drop user totoexam;

--select *
--from all_users;
