//public class L_33_Recursion {

//        factorial(0) = 1
//        factorial(n) = n * n-1 *......1
//        factorial(5) = 5*4*3*2*1
//        factorial(n) = n * factorial(n-1)
//    static int factorial(int n){
//        if(n==0 ||n==1){
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
//    }
//
//    static int factoria(int n){
//        if(n==0 ||n==1){
//            return 1;
//        }
//        else{
//            int product = 1;
//            for (int i = 1;i<=n;i++){
//                product *= i;
//            }
//            return product;
//        }
//    }

//    Additional Quick Quiz
//    static int fibonaci(int n){
//        int a = 0;
//        int b = 1;
//        int c;
//        int result = 0;
//        System.out.print(a + " ");
//
//        for (int i = 1;i<n;i++){
//            c = a+b;
//            a=b;
//            b=c;
//            result=c;
//            System.out.print(c + " ");
//        }
//        System.out.println(" ");
//        return result;
//    }
//    public static void main(String[] args) {
//        int x = 10;
//        System.out.println("The value of n is : " + factorial(x));
//        System.out.println("The value of n is : " + factoria(x));
//        System.out.println("The value of fibonacci x is : " + fibonaci(x));
//        }
//    }

