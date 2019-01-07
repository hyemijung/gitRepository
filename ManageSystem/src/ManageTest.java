
public class ManageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "";
		String made= "";
		int price = 0;
		int ea = 0;
		
		name = "a";
		made= "b";
		price = 10;
		ea = 20;
		
		
		Manage manage = new Manage(name, made, price, ea);
		
		
		manage.manageSnack();
		
//		manage.manageContainer();
		
		
		
		

	}

}
