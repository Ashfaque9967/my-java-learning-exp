//interface mycamera1{
//    void takesnap();
//    void recordvideo();
//    private void greet(){
//        System.out.println("Good morning");
//    }
//    default void record4Kvideo(){
//        greet();
//        System.out.println("recording in 4K...");
//    }
//
//}
//interface mywifi1{
//    String[] getNetworks();
//    void ConnectingToNetwork(String network);
//}
//class mycellphone1{
//    void callnumber(int phoneNumber){
//        System.out.println("Calling... " + phoneNumber);
//    }
//    void pickcall(){
//        System.out.println("Connecting...");
//    }
//}
//class mysmartphone1 extends mycellphone implements mycamera1, mywifi1{
//    public void takesnap(){
//        System.out.println("Taking snap...");
//    }
//    public void recordvideo(){
//        System.out.println("Recording Videos...");
//    }
//    //    public void record4Kvideo(){
////        System.out.println("recording in 2x 1080p...");
////    }
//    public String[] getNetworks(){
//        System.out.println("Getting lists of network");
//        String[] networklist1 = {"Abhinav" , "Vishal5G" , "Mukesh"};
//        return networklist1;
//    }
//    public void ConnectingToNetwork(String network){
//        System.out.println("Connecting to " + network);
//    }
//}
//public class L_49_Polymorphism_in_Interface {
//    public static void main(String[] args) {
//
//        mycamera1 mycam = new mysmartphone1(); // ---> this object only uses mycamera1 methods
////        mycam.ConnectingToNetwork();  ---> gives an error
//        mycam.record4Kvideo();
//        mycam.takesnap();
//        mycam.recordvideo();
//
//        mysmartphone1 sm1 = new mysmartphone1();
//        sm1.ConnectingToNetwork("harry0101");
//        String [] arr1 = sm1.getNetworks();
//        for (String inner2 : arr1){
//            System.out.println(inner2);
//        }
//        sm1.recordvideo();
//
//    }
//}
