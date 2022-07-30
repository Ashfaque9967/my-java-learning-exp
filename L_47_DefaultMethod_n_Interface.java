//interface mycamera{
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
//interface mywifi{
//    String[] getNetworks();
//    void ConnectingToNetwork(String network);
//}
//class mycellphone{
//    void callnumber(int phoneNumber){
//        System.out.println("Calling... " + phoneNumber);
//    }
//    void pickcall(){
//        System.out.println("Connecting...");
//    }
//}
//class mysmartphone extends mycellphone implements mycamera, mywifi{
//    public void takesnap(){
//        System.out.println("Taking snap...");
//    }
//    public void recordvideo(){
//        System.out.println("Recording Videos...");
//    }
////    public void record4Kvideo(){
////        System.out.println("recording in 2x 1080p...");
////    }
//    public String[] getNetworks(){
//        System.out.println("Getting lists of network");
//        String[] networklist = {"Abhi" , "Vishal" , "Mukesh"};
//        return networklist;
//    }
//    public void ConnectingToNetwork(String network){
//        System.out.println("Connecting to " + network);
//    }
//}
//
//public class L_47_DefaultMethod_n_Interface {
//    public static void main(String[] args) {
//        mysmartphone ms = new mysmartphone();
//        ms.record4Kvideo();
////        ms.greet ---> gives an error
//        String [] arr = ms.getNetworks();
//        for (String inner: arr) {
//            System.out.print(inner+ ", ");
//        }
//        System.out.println();
//        ms.ConnectingToNetwork("akash5G");
//    }
//}
