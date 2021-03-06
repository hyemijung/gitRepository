<데이터 모델>

모델링의 이해
현실세계          -->          모델
                  추상화
                  단순화
                  명확화 
                  
추상화   <->   객체(구체화)
현실세계를 일정한 형식에 맞추어 표현을 한다는 의미
즉 다양한 현상을 일정한 양식인 표기법에 의해 표현한다는 것

단순화
복잡한 현실세계를 약속된 규약에 의해 제한된 표기법이나
언어로 표현하여 쉽게 이해할 수 있도록 하는 개념

명확화
누구나 이해하기 쉽게 하기 위해 대상에 대한 애매모호함을 제거하고
정확하게 현상을 기술하는 것

<데이터 모델링의 3단계 진행>
현실세계(개체)  ->  개념적 데이터 모델링 -> 개념세계(개념적 구조)

-> 논리적 데이터 모델링 -> 논리적 구조 -> 물리적 데이터 모델링 -> 데이터베이스 저장




                          현실 세계와 데이터베이스 사이의 모델 

개념적 데이터 모델링                                                                                          추상적
추상화 수준이 높고 업무중심적이고 포괄적인 수준의 모델링 진행

논리적 데이터 모델링 (로직)
시스템으로 구축하고자 하는 업무에 대해 Key, 속성, 관계 등을 정확하게 표현
재사용성이 높음


물리적 데이터 모델링 (구현부 - 개발자 영역)                                                            구체적
실제로 데이터베이스에 이식할 수 있도록 성능, 저장 등
물리적인 성격을 고려하여 설계



프로젝트 라이프 사이클

분석              (개념, 논리)
설계              (물리데이터 모델링)
개발              (DB구축, 변경, 관리)
테스트           (DB 튜닝)
이행              (DB 전환)

모두 만족하면 정보시스템 구축




스키마(Schema): db계정(프로젝트의 단위) -> 스키마(학업,학교에서 부르는 용어)
외부 스키마
개념 스키마: 개념단계 하나의 개념적 스키마로 구성
                 모든 사용자 관점을 통합한 조직 전체의 DB를 기술하는 것
                 모든 응용시스템들이나 사용자들이 필요로 하는 데이터를 통합한 조직 전체의 DB를
                 기술한 것으로 DB에 저장되는 데이터와 그들간의 관계를 표현하는 스키마
                 (조직전체 - 
    

내부 스키마: DB가 물리적으로 저장된 형식 
                 물리적 장치에서 데이터가 실제적으로 저장되는 방법을 표현


(프로젝트명과 스키마가 거의 일치된다)



<데이터 모델링의 중요한 세가지 개념>

1) 업무가 관여하는 어떤 것(Things)  ->  엔티티(entity)  -> 테이블
2) 어떤 것이 가지는 성격(Attributes) -> 속성(property) -> 컬럼  -> join(테이블간의 관계)
3) 업무가 관여하는 어떤 것의 관계(Relationships) - 관계(relation)



이주일과 심순애가 존재하고 둘 사이는 서로 사랑하는 연인사이이다.
이주일은 키가 180cm에 성격은 친절하고 심순애는 키가 165cm에
세심하며 활달한 성격을 가지고 있다.

: (명사) 이주일, 심순애  -> 객체
어떤 것 간의 관계(행위): 사랑하는 연인사이  
어떤 것의 성격(특징): 키가 180cm에 성격은 친절, 키가 165cm에 세심하며 활달함 -> (인스턴스 변수에 저장될 내용, 객체의 특징, 메서드로 만들게 된다)


문제)
여당은; 대통령을 가진 정당
야당은; 대통령을 가지지 못한 정당
야당은 정부와 여당의 잘못을 감시하고 비판하는 것이 주임무라
항상 정부여당에 대립되는 것 처럼 보인다 

어떤 것: 여당, 야당, 대통령, 정부      (o)
어떤 것 간의 관계: 서로의 잘못을 감시하고 비판   (x) -> 대통령을 가진 정당(has), 대통령을 가지지 못한 정당 
어떤 것의 성격: 항상 정부와 서로의 당에 대립되는 것 처럼 보임  (x)  -> 정부와 여당의 잘못을 감시하고 비판하는 것, 정부여당에 대립되는 것

어떤 것 - 명사:
어떤 것 간의 관계(행위) - 동사:
어떤 것의 성격(특징) - 성격(형용사): 인스턴스 변수에 저장될 내용, 객체의 특징, 메서드로 만들게 된다)


문제)
Tv와 리모컨이 존재한다. Tv는 화면을 보여주며 리모컨은 Tv를 조작할 수 있다
Tv는 크기가 70인치 이고, 리모컨은 20cm 정도로 작다

어떤 것: Tv, 리모컨
어떤 것 간의 관계: 화면을 보여준다(개념적인 것), Tv를 조작할 수 있다 (x) -> Tv는 화면을 보여준다, 리모컨은 Tv를 조작할 수 있다
어떤 것의 성격: 70인치, 20cm로 작다 (x) -> 70인치, 20cm



IE/Crow's Foot 표기법

 조작당함<-조작함
tv -----------(-)<리모컨
    1 : m(any)

책 n개 창고에 보관해야 함
창고에 여러권 놓을수잇음
창고에 0권있을수도 있음
======================
책이 존재하지 않으면 창고를 만들지 않겠다
책은 창고에 여러 권 놓아 둘 수 있다


엔티티 개념 (어떤 것)

변별할 수 있는 사물
데이터베이스 내에서 변별 가능한 객체
정보를 저장할 수 있는 어떤 것
정보가 저장될 수 있는 사람, 장소, 물건, 사건 그리고 개념 등

위의 정의들의 공통된 특징
1. 엔티티는 사람, 장소, 물건, 사건, 개념 등의 명사에 해당한다
2. 엔티티는 업무상 관리가 필요한 관심사에 해당한다.
3. 엔티티는 저장이 되기 위한 어떤 것이다.

엔티티란?
업무에 필요하고 유용한 정보를 저장하고 관리하기 위한 집합적인 것

예)
학생?
속성(성격) : 학번, 이름, 이수학점, 등록일자, 생일, 주소, 전화번호, 전공 등의 속성으로 특징되어질 수 있다.

엔티티는 인스턴스의 집합이다 (자바에서 만들면 class 이다)


엔터티: 과목, 강사, 사건 (가 있다면?)

과목: 수학, 영어

강사: 남궁성, 박성욱

사건: 2010-001, 2010-002

IE 표기법


엔티티의 찾는 요령?
<엔티티의 특징>
1. 반드시 해당 업무에서 필요하고 관리하고자 하는 정보 이어야 한다
예: 환자, 토익의 응시횟수
2. 유일한 식별자에 의해 식별이 가능해야 한다
3. 영속적으로 존재하는 인스턴스의 집합이어야 한다
("한 개"가 아니라 "두 개 이상")
4. 엔티티는 업무 프로세스에 의해 이용되어야 한다
5. 엔티티는 반드시 속성이 있어야 한다
6. 엔티티는 다른 엔티티와 최소 한 개 이상의 관계가 있어야 한다


(엔티티를 알면 클래스를 아는 것과 같다)


노동자 
    노동자 이름 : 홍길동, 박무개
    노동자 나이 : ''세



속성(instance)

속성의 개념
    사전의 정의 : 사물의 성질, 특징 또는 본질적인 성질
    그것이 없다면 실체를 생각할 수 없는 것으로 정의함
    
    데이터 모델링 관점에서 속성을 정의한다면...        ㄱ
    업무에서 필요로 하는 인스턴스로 관리하고자 하는      | ------중요
    의미상 더 이상 분리되지 않는 최소의 데이터 단위     」
    
    (엔터티는 속성들에 의해 설명된다)
    
강사 엔터티의 속성들
.이름
.주소
.생년월일
.계약일자
.전문분야

생년월일 : 19870423
생년 1987
월   04
일   23


속성의 정의
 .업무에서 필요로 한다
 .의미상 더 이상 분리되지 않는다
 .엔터티를 설명하고 인스턴스의 구성요소가 된다
 
 속성의 명명규칙(naming sence)
 1. 해당업무에서 사용하는 이름을 부여한다
 2. 서술식 속성명은 사용하지 않는다   ex)노동자의 이름은
 3. 약어사용은 가급적 제한한다  ex)employee등등 풀로 적기, 198열 참고
 4. 전체 데이터모델에서 유일성을 확보하는 것이 좋다(기본키, 나중에 설명 예정)
 
 치환 코드
 000_computerEducation5050
 001_edu1000
    
    
이름      박성욱     박성욱
.주소     신림동     신림동
.생년월일   87        87
.계약일자   00        00
.전문분야   자바      자바
===========>유일성이 없음. 지양할 것


도메인(Domain)

각 속성은 가질 수 있는 값의 범위가 있다. 이를 그 속성의 도메인이라 한다.
예 :  학생이라는 엔터티가 있을 때 학점이라는 속성의 도메인은 0.0에서 4.0 사이의 실수 값이며
      주소라는 속성은 길이가 20자리 이내인 문자열로 정의할 수 있다.
      여기서 각 속성은 도메인 이외의 값을 갖지 못한다(주소값(214열)에는 숫자 못들어감)
      정리하면, 엔터티 내에서 속성에 대한 데이터 타입과 크기 그리고 제약사항을 지정하는 것이라 할 수 있다.
      
      
관계형 데이터베이스

SQL
풀 네임 : Structure Query Language

관계형 데이터베이스에서
데이터 정의
제이터 조작
데이터 제어
를 하기 위해 사용하는 언어


데이터 조작어(DML : Data Manipulation Language)
명령어         설명
select       데이터베이스에 들어 있는 데이터를 조회하거나 검색하기 위한 명령어를 말함. Retrieve라고도 한다
-------------
insert       데이터베이스의 테이블에 들어 있는 데이터에 변형을 가하는 종류의 명령어들을 말한다.
update       예를 들어 데이터를 테이블에 새로운 행을 집어넣거나, 원하지 않는 데이터를 삭제하거나
delete       수정하는 것들의 명령어를 DML이라고 부른다

행 : Low
열 : Column

데이터 정의어 (DDL : Date Definition Language)
명령어         설명
CREATE       테이블과 같은 데이터 구조를 정의하는데 사용되는 명령어들로
ALTER        그러한 구조를 생성하거나 변경하거나 삭제하거나 이름을 바꾸는
DROP         데이터 구조와 관련된 명령어들을 DDL이라고 부른다
RENAME       -


데이터 제어어(DCL: Data Control Language)
명령어                 설명
GRANT               데이터베이스에 접근하고 객체들을 사용하도록 권한을 주고
REVOKE              회수하는 명령어를 DCL이라고 부른다

트랜잭션 제어어(TCL: Transaction Control Language)
명령어                 설명
COMMIT              논리적인 작업의 단위를 묶어서 DML에 의해 조작된 결과를
ROLLBACK            작업단위(트랜잭션) 별로 제어하는 명령어를 말한다








