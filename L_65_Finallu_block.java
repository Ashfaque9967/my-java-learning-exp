//public class L_65_Finallu_block {
//    public static int block(){
//        try{
//            int a = 4;
//            int b = 2;
//            int c = a/b;
//            return c;
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        finally{
//            System.out.println("I will execute no matter wht!");
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int b = block();
//        System.out.println(b);
//        int a1 = 10;
//        int d1 = 5;
//        while(true){
//            try{
//                System.out.println(d1/a1);
//            }
//            catch (Exception e){
//                System.out.println(e);
//                break;
//            }
//            finally {
//                System.out.println("A = " + a1);
//            }
//            a1--;
//        }
//
//        try{
//            System.out.println(50/0);
//        }
//        finally {
//            System.out.println("Told ya!");
//        }
//    }
//}
