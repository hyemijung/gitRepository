public class ExceptionEx2_2 {
   public static void main(String[] args) {

      System.out.println(1);
      System.out.println(2);
      
      String[] strArr = new String[2];
      strArr[0] = null;
      
      try {
//         strArr[0].charAt(1);
         System.out.println(3);
//         strArr[2] = "sdf";
         System.out.println(0/0);
         System.out.println(4);
      }catch (ArithmeticException e) {
         System.out.println(e.getMessage());
//         e.printStackTrace();
         System.out.println(5);
         System.out.println("ArithmeticException");
      }catch(IndexOutOfBoundsException e) {
         System.out.println(6);
         System.out.println("IndexOutOfBoundsException");
      }catch (Exception e) {
         System.out.println(7);
         System.out.println(e.getMessage());
         System.out.println("Exception");
//         e.printStackTrace();
      }
      
      System.out.println(8);

   }
}