//abstract class parent{
//    public parent(){
//        System.out.println("I am a constructor of parent class ");
//    }
//    abstract public void greet();
//}
//class child extends parent{
//    @Override
//    public void greet() {
//        System.out.println("Namaste");
//    }
//}
//abstract class child2 extends parent{
//    abstract public void print();
//}
//
//class child3 extends child2{   // Needs both the abstracts
//
//    @Override
//    public void greet() {
//        System.out.println("Hello,_______");
//    }
//    @Override
//    public void print() {
//        System.out.println("I am a printing method of child3");
//    }
//}
//
//public class L_46_Abstract {
//    public static void main(String[] args) {
//        // child2  c = new child2();    // It's an abstract class
//        child c = new child();
//        child3 c = new child3();
//        System.out.println(c.greet());
//        System.out.println(c.print());
//
//    }
//}
