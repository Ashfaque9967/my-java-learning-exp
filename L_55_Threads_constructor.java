//class mythr extends Thread{
////  1: Thread();
//    public mythr(){
//        setName("Ashfaque's Thread");
//            System.out.println("I am a constructor which does not take parimeters...");
//    }
////  2: Thread(String name);
//    public mythr(String name){
//        super(name);
//    }
//
//    public void run(){
//        System.out.println("I am a Thread...");
//    }
//}
//// 3: Thread(Runnable r);
//class myt implements Runnable{
//    public void run(){
//        System.out.println("I am a Runnable method...");
//    }
//}
//// 4: Thread(Runnable r, String name);
//class rm extends Thread implements Runnable{
//    public rm(String name){
//        super(name);
//    }
//    public void run(){
//        System.out.println("I am implemented + extended");
//    }
//}
//public class L_55_Threads_constructor {
//    public static void main(String[] args) {
//
////      1: Thread();
//        System.out.println();
//        System.out.println("1: Thread();\n");
//        mythr m1 = new mythr();
//        System.out.println(m1.getId());
//        System.out.println(m1.getName());
//        m1.start();
//
////      2: Thread(String name);
//
//        System.out.println();
//        System.out.println("2: Thread(String name);\n");
//        mythr mt = new mythr("Ashfaque");
//        mythr mt1 = new mythr("Ashfaque1");
//        mt.start();
//        System.out.println(mt.getId());
//        System.out.println(mt.getName());
//        mt1.start();
//        System.out.println(mt1.getId());
//        System.out.println(mt1.getName());
//
////        3: Thread(Runnable r);
//
//        System.out.println();
//        System.out.println("3: Thread(Runnable r);\n");
//        myt m = new myt();
//        Thread t = new Thread(m);
//        t.start();
////
////        4: Thread(Runnable r, String name);
//
//        System.out.println();
//        System.out.println("4: Thread(Runnable r, String name);\n");
//        rm q = new rm("Ashfaque101");
//        Thread tt = new Thread(q);
//        tt.start();
//        System.out.println(q.getName());
//        System.out.println(q.getId());
//    }
//}
