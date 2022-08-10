//class mythr extends Thread{
//    public void run(){
//        int i = 0;
//        int a = 0;
//        while(i<10){
//            a++;
//            System.out.format("%d. Hey! Thread\n", a);
//            i++;
//        }
//    }
//}
//class mythr1 extends Thread{
//    public void run(){
//        int i = 0;
//        int a = 0;
//        while(i<10){
//            a++;
//            System.out.format("%d. Hey! I am a Thread\n", a);
//            i++;
//        }
//    }
//}
//public class L_58_Threads_Methods {
//    public static void main(String[] args) {
//        mythr m = new mythr();
//        mythr1 m1 = new mythr1();
//        m.start();
//
//        try{
//            m.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        m1.start();
//    }
//}
