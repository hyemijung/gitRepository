
public class NotebookTest {

	public static void main(String[] args) {
		
		String manufacturer = "";    //
		int price = 0;               //  이후 배열을 사용하려면 변수를 사용하지 말라 (//표신한 변수 4줄 모두)
		int hardDisk = 0;            //  이부분은 사용자가 결정할 부분
		int ram = 0;                 //  이후 스캐너를 사용하여 사용자가 결정하게 할것임
		
//		Notebook.manufacturer = "LG";   // static을 쓸경우
		
		
//		Notebook notebook1 = new Notebook(10000, 500, 4);  // 이렇게하면 유지보수 때문에 힘듬//스캐너를 만들거나 한다면 변수명을 활용하는 것이 더 낫다
//		notebook1.info();
		
		
		manufacturer = "LG";
		price = 10000;
		hardDisk = 500;
		ram = 4;
		
		Notebook notebook1 = new Notebook(manufacturer, price, hardDisk, ram);
		notebook1.info();
		
		manufacturer = "LG";
		price = 20000;
		hardDisk = 800;
		ram = 4;
		
		Notebook notebook2 = new Notebook(manufacturer, price, hardDisk, ram);
		notebook2.info();
				
		manufacturer = "LG";
		price = 10000;
		hardDisk = 300;
		ram = 8;
		
		Notebook notebook3 = new Notebook(manufacturer, price, hardDisk, ram);
		notebook3.info();
		
		
//		내가 저지른 오류
//	 3개의 제품에 가격, 하드 디스크, 메모리를 알아서 작성한다(디렉션) -> 이후 배열로 이마저도 간단하게(샘코드 확인)
//		- 각각의 원하는 값을 작성하고 난 뒤에 - 각각의 노트북을 new를 통해 만들어 메서드를 찾아가야함
//	1>	(난 1개의 값만 작성하고 노트북 3개를 만들었었음) -> 3개의 값을 작성해야함
//	2>	(3개의 값을 연달아 작성하고 그뒤에 노트북 3개를 연달아 만들었음) -> 값을 작성하고 그에 해당하는 노트북을 만들어야함을 몰랐음
//	3>	(println을 메인에 두번 작성했음 -> 이를 클래스(설계도)로 보내어 한번에 출력 가능함을 몰랐음)
//	4> static 사용 못함
//	5> 노트북을 만들고 ()안에 변수값 바로 작성 가능함.	
//	6> 이후 배열로 이마저도 간단하게 만들수 있다 (배열 + for문)- 단, 입력과 출력을 분리하라	
	}
}
