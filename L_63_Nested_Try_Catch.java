//import java.util.Scanner;
//
//public class L_63_Nested_Try_Catch {
//    public static void main(String[] args) {
//
//        int [] mrks = new int[3];
//        mrks[0] = 64;
//        mrks[1] = 32;
//        mrks[2] = 47;
//
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while(flag) {
//            System.out.println("Enter your index value: ");
//            int k = sc.nextInt();
//            try {
//                System.out.println("Program is started well.");
//                try {
//                    System.out.println("Here is your value: " + mrks[k]);
//                    flag = false;
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("ArithmeticException found!");
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
