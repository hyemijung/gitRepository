// 단일상속
// 자바에서는 다중상속을 허용하지 않는다
// 2개 이상의 상속을 받을 수 없다
// 부모는 하나만 허용한다 -> 부모는 유일

//다중상속을 허용하면 여러 클래스로부터 상속받을 수 있기 때문에
//복합적인 기능을 가진 클래스를 쉽게 작성할 수 있다는 장점이 있지만,
//클래스간의 관계가 매우 복잡해진다는 것과 
//서로 다른 클래스로부터 상속받은 멤버간의 이름이 같은 경우
//구별할 수 있는 방법이 없다는 단점을 가지고 있다

//public class CaptionMuteInternetTv extends CaptionTv, MuteTv {             // 이런 형식 불가능
//}

public class CaptionMuteInternetTv extends CaptionTv{  // 둘좀 좀더 많은 기능이 일치하는 것으로 가져온다

	MuteTv mTv = null;
	
	
}
