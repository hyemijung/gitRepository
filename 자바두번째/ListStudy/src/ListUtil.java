import java.util.ArrayList;

public class ListUtil {
	
	
	int cnt = 1;
	
//	list내용 전부 출력
	void arrayListAllPrint(ArrayList list) {
		System.out.println(cnt + "번째: ====== list값 출력 =======");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		cnt++;
	}
	
	void arrayListAllPrint(ArrayList list, String title) {
		System.out.println("======" + title + " 출력 ======= 번째: " + cnt);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		cnt++;
	}
	
}
