
public class PlayerTest {

	public static void main(String[] args) {
		
//		Player p = new Player(); //Cannot instantiate the type Player (추상클래스는 객체를 만들수없다)
		
		AudioPlayer ap = new AudioPlayer();
		
		ap.play(1);
		
	}
	
}
