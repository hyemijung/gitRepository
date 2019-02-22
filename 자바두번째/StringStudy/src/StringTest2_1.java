import java.util.Scanner;

public class StringTest2_1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner scan = new Scanner(System.in);
      String name = "";
      String dvName = "";
      
      dvName = "김준혁";
      
      while (true) {
         System.out.println("아무 글자나 입력해주세요. (힌트: 개발자 이름)");
         System.out.print("enter:) ");
         name = scan.nextLine();
         
         boolean compareName = name.equals(dvName);
         
         if (compareName == true) {
            System.out.println();
            System.out.println("게임을 종료합니다.");
            break;
            
         } else if (compareName == false) {
            System.out.println("틀렸습니다. 다시 입력해주세요.");
            System.out.println();
            
         }
      }

   }

}