//import java.util.Scanner;
//
//public class L_62_exception_handling {
//    public static void main(String[] args) {
//        int [] marks = new int[3];
//        marks[0] = 54;
//        marks[1] = 65;
//        marks[2] = 75;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks index:");
//        int k = sc.nextInt();
//        System.out.println("Enter the number which divides the marks");
//        int y = sc.nextInt();
//        try{
//            System.out.println("The chosen marks = " + marks[k]);
//            System.out.println("The division of marks = " + marks[k]/y);
//        }catch (ArithmeticException e){
//            System.out.println("ArithmeticException error found!");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException error found!");
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
