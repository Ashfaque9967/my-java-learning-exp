package learnjava;
class AM{
        public int a = 4;
        protected int b = 75;
        int c = 7;
        private int d = 73;
        public void  meth1(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
}
public class L_52_access_modifiers {
    public static void main(String[] args) {
        AM am = new AM();
        am.meth1();

//        System.out.println(am.a);
//        System.out.println(am.b);
//        System.out.println(am.c);
//        System.out.println(am.d);
    }
}
