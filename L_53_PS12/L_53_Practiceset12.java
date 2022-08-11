package L_53_PS12;  //Problem 1:

class calculator{
    void calculator1(int i1, int i2){
        System.out.println("the value is: " + i1+i2);
    }
}
class sccalculator{
    void sccalculator1(int i1, int i2){
        System.out.println("the Sc valur is: " + 2*i1+i2);
    }
}
class hybcalculator{
    void calculator(int i1, int i2){
        System.out.println("the value is: " + i1+i2);
        System.out.println("the Sc valur is: " + 2*i1+i2);
    }
}

public class L_53_Practiceset12{
    public int pub = 8;
    protected int prot = 4;
    int def = 5;
    
    public static void main(String[] args) {
        calculator c = new calculator();
        c.calculator1(3, 3);
    }
}
