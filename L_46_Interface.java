//interface bike{
//    int speed = 50;
//    void geardown(int decrement);
//    void gearup(int increment);
//}
//interface horn{
//    void horn();
//}
//class IronBike implements bike, horn{  //we can implement more than one interface in one class.
//    public void geardown(int decrement){
//        System.out.println("gear down...");
//    }
//    public void gearup(int increment){
//        System.out.println("gear up...");
//    }
//    public void horn(){
//        System.out.println("Tringg... Tringg... ");
//    }
//}
//
//
//
//
//public class L_46_Interface {
//    public static void main(String[] args) {
//        IronBike ironBike = new IronBike();
//        ironBike.gearup(8);
//        // you can create properties in interface
//        System.out.println(ironBike.speed);
//        // ypu can not modify properties in interface as they are final
////        ironBike.speed = 75;   // throws an error
////        System.out.println(ironBike.speed);
//        ironBike.horn();
//    }
//}
