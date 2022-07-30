//// Problem : 1
//
//abstract class pen{
//    abstract void write();
//    abstract void refill();
//}
//
//// Problem : 2
//
//class mypen extends pen{
//
//    @Override
//    void write() {
//        System.out.println("Writing...");
//    }
//
//    @Override
//    void refill() {
//        System.out.println("refilled.");
//    }
//    void changenib() {
//        System.out.println("Nib Changed.");
//    }
//}
//
//// Problem : 3
//
//interface animalsbacis{
//    void eats();
//    void sleep();
//}
//class monkey{
//    void jump(){
//        System.out.println("jumping...");
//    }
//    void bite(){
//        System.out.println("biting...");
//    }
//}
//class human extends monkey implements animalsbacis{
//    void talk(){
//        System.out.println("hey! i am human.");
//    }
//    public void eats(){
//        System.out.println("Eating...");
//    }
//    public void sleep(){
//        System.out.println("Sleep...");
//    }
//}
//
//// Problem : 4 & 5
//
//abstract class function{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class telephone extends function{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//    public void lift(){
//        System.out.println("call is Lifted.");
//    }
//    public void disconnect(){
//        System.out.println("call is discoonected.");
//    }
//}
//class smarttelephone extends telephone{
//    void dispalys(){
//        System.out.println("Display turn  onn");
//    }
//}
//
//// Problem : 6
//
//interface tvremote{
//    void turnontv();
//    void turnofftv();
//    void numbers();
//}
//interface smarttvremote extends tvremote{
//    void openNetflix();
//    void openGassistance();
//}
//
//// Problem : 7
//
//class tv implements smarttvremote{
//
//    @Override
//    public void openNetflix() {
//        System.out.println("Opening Netflix...");
//    }
//
//    @Override
//    public void numbers() {
//        System.out.println("Using numbers...");
//    }
//
//    @Override
//    public void turnofftv() {
//        System.out.println("Turning OFF TV");
//    }
//
//    @Override
//    public void turnontv() {
//        System.out.println("Turning ON TV");
//    }
//
//    @Override
//    public void openGassistance() {
//        System.out.println("Opening Google Assistance...");
//    }
//}
//public class L_50_PracticeSet11 {
//    public static void main(String[] args) {
//        // problem : 1 & 2
//
////        mypen mp = new mypen();
////        mp.changenib();
//
//        // Problem : 3
//
////        human man = new human();
////        man.eats();
////        man.sleep();
////        man.bite();
////        man.jump();
////        man.talk();
//
//        // Problem : 4
//
////        smarttelephone st = new smarttelephone();
////        st.disconnect();
////        st.dispalys();
////        telephone t = new telephone();
////        t.disconnect();
////        t.dispalys(); ----> noy allowed cuz of polymorphism
//
//        // Problem : 5
//
////        monkey m = new human();
////        m.bite();
////        m.talk ---> not allowed cuz of polymorphism
//
//        // Problem 6 & 7
//
////        tv tv = new tv();
////        tv.numbers();
////        tv.openGassistance();
////        tv.openNetflix();
////        tv.turnofftv();
//
//    }
//}
