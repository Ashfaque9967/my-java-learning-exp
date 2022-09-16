class exception extends Exception{
    public String toString(){
        return "can't use 8 or 9!";
    }
}
class zeroexception extends Exception{
    public String toString(){
        return "Cannot divide by zero!";
    }
}
class maxinout extends Exception{
    public String toString(){
        return "MAXEDINPUT!!!";
    }
}
class cuscalculator{
    double add(double a, double b) throws exception, maxinout{
        if (a==8 || b==9){
            throw new exception();
        } else if (a>=10000 || b>=10000) {
            throw new maxinout();
        }
        return a+b;
    }
    double subtract(double a, double b)throws maxinout{
        if (a>=10000 || b>=10000) {
            throw new maxinout();
        }
        return a-b;
    }
    double divide(double a, double b) throws zeroexception, maxinout{
        if (a==0 || b==0){
            throw new zeroexception();
        }else if (a>=10000 || b>=10000) {
            throw new maxinout();
        }
        return a/b;
    }
    double multiply(double a, double b) throws maxinout{
        if (a>=7000 || b>=7000) {
            throw new maxinout();
        }
        return a*b;
    }
}
public class Exercise_06_CustomCalculator {
    public static void main(String[] args) throws exception,zeroexception {
        cuscalculator cc = new cuscalculator();
//        cc.add(8,9);
//        cc.divide(100000000,7);
        try{
            cc.multiply(70000,9888);
        }catch (Exception e){
            System.out.println(e);
        }
        int b2 = 4;
        System.out.println(b2);
    }
}
