//class NegRadius extends Exception{
//    public String toString(){
//        return "Negative Radius!";
//    }
//}
//public class L_64_Throws_n_Throw{
//    public static double area(double r) throws NegRadius{
//        if(r<0) {
//            throw new NegRadius();
//        }
//        double result = r * r * Math.PI;
//            return result;
//    }
//    public static int divide(int a, int b) throws ArithmeticException{
//        int result = a/b;
//        return result;
//    }
//    public static void main(String[] args) {
//        try {
////            int c = divide(4, 0);
////            System.out.println(c);
//            double d = area(4);
//            System.out.printf("The area = %.2f", d);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}