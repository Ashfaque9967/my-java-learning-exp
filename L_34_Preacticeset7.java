//public class L_34_Preacticeset7 {

//    Problem : 1

//    static int table(int n){
//        for (int i = 1;i<=10;i++){
//            System.out.format("%d X %d = %d\n", n, i, n*i);
//        }
//        return  n;
//    }

//    Problem : 2

//    static int star(int n){
//        for (int i = 0;i<=n;i++){
//            for (int j = 0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }return n;
//    }

//  Problem : 3
//    static int sum(int n){
//        Base condition
//        if (n==1){
//            return 1;
//        }
//        return n + sum(n-1);
//    }
//
//  Problem : 4

//    static int revstar(int n){
//        for (int i = n;i>=0;i--){
//            for (int j = 0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        return n;
//    }

//    Problem : 5
//    static int fib(int n){
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//
//    }

//    Problem : 6

//     static float avg(int ...arr){
//        float re = 0;
//         for (float res:arr) {
//             re = (re + res);
//         }
//         float fre =re / arr.length;
//         return fre;
//     }

//     Problem : 7
//
//    static int revstarre(int n){
//        if (n==1){
//            System.out.println("*");
//        }
//        else {
//            for (int i = n;i>=0; i--){
//                for (int j = 0;j<i;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//        return n;
//    }

//     Problem : 8

//    static int starre(int n){
//    if (n==1){
//        System.out.println("*");
//    }
//    else {
//        for (int i = 0;i<=n;i++){
//            for (int j = 0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    return n;
//    }

//    Problem : 9

//    static float fahre(float n){
//        float f = 0;
//        if (n==0){
//            return (n+32);
//        }
//        else {
//            f = n*9/5+32;
//        }
//        return f;
//    }

//    Problem : 10
//
//    static int sum_ite(int n){
//        int re = 0;
//        for (int a = 0;a<=n;a++){
//            re += a;
//        }
//        return re;
//    }
//
//    public static void main(String[] args) {
//
////        Solution : 1
//
////        table(6);
//
////        Solution : 2
//
////        star(4);
//
////        Solution : 3
//
////        int s = sum(4);
////        System.out.println(s);
//
////        Solution : 4
//
////        revstar(5);
//
////        Solution : 5
//
////        int n = fib(7);
////        System.out.println(n);
//
////        Solution : 6
//
////        float n = avg(25, 55, 17, 87, 100);
////        System.out.println(n);
//
////        Solution : 7
//
////        revstarre(4);
//
////        Solution : 8
//
////        starre(4);
//
////        Solution : 9
//
////        float c = 9;
////        System.out.println(fahre(c));
//
////        Solution : 10
//
////        int x = 5;
////        System.out.println(sum_ite(x));
//
//    }
//}
