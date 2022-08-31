//import java.util.Scanner;
//class Maxtries extends Exception{
//    @Override
//    public String toString() {
//        return "Max tries reached!";
//    }
//}
//public class L_66_Practiceset14 {
//    //Problem:5
//    public static int RIndex() throws Maxtries{
//        int[] arr = {1, 2, 3, 4, 5};
//        Scanner sc = new Scanner(System.in);
//        int flag = 0;
//        while(flag<5) {
//            System.out.print("Enter rhe value of index: ");
//            int k = sc.nextInt();
//            try {
//                System.out.println("your index = " + arr[k]);
//                break;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e + "\nEnter the correct index number!");
//            }
//            flag++;
//        }
//        if(flag == arr.length) {
//            //Problem:4
//            try{
//                throw new Maxtries();
//            }
//            catch (Maxtries e){
//                System.out.println(e.toString());
////              System.out.println("Error!\nBetter luck next time.\nMax tries reached!");
//            }
//        }
//        return 0;
//    }
//    public static void main(String[] args) throws Maxtries {
//
//        //Problem:1
////        int a = 23  // Syntax error!
////        int age = 50;
////        int B_year = 2000-age; // Logical error (Should be (-) by current year
////        System.out.println(9/0);
//
//        //Problem:2
//        try{
//            System.out.println(9/0);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e + "\nHaHAHaHA...");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e + "HeHEHeHE...");
//        }
//
//        //Problem:3
//        int[] arr = {1, 2, 3, 4, 5};
//        Scanner sc = new Scanner(System.in);
//        int flag = 0;
//        while(flag<5) {
//            System.out.print("Enter rhe value of index: ");
//            int k = sc.nextInt();
//            try {
//                System.out.println("your index = " + arr[k]);
//                break;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e + "\nEnter the correct index number!");
//            }
//            flag++;
//        }
//        if(flag == arr.length) {
//            //Problem:4
//            try{
//                throw new Maxtries();
//            }
//            catch (Maxtries e){
//                System.out.println(e.toString());
////              System.out.println("Error!\nBetter luck next time.\nMax tries reached!");
//            }
//        }
//
//        //Problem:5
//        try{
//            System.out.println(RIndex());
//        }catch (Maxtries e){
//            System.out.println(e);
//        }
//    }
//}
