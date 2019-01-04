
public class HomeTest {

	public static void main(String[] args) {

		int window = 2;
		int door = 1;
		int room = 2;

		Home home = new Home(window, door, room);
		home.print();

		Home home2 = new Home(5, 1);
		home2.print();
		
		Home home3 = new Home(2);
		home3.print();
		
		
//		home.window();
//		home.door();
//		home.room();

		
	}
}
