/*
public class L_30_Methods {
     static int logic(int x, int y){    // Remove static to make it object method
        int z;
        if (x<y){
            z = x+y;
        }
        else {
            z = (x+y)*2;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c;
        if (a>b){
            c = (a+b)*5;
        }
        else {
            c = (a+b);
        }
        System.out.println(c);

//        Method invocation using Oblect creation
        int a1;
        int b1;
        int c1;
        a1 = 5;
        b1 = 6;
        c1 = logic(a1, b1);
        System.out.println(c1);

/*
//        Object Method
        int a2 = 4;
        int b2 = 6;
        int c2;
        L_30_Methods obj = new L_30_Methods();
        c2 = obj.logic(a2, b2);
        System.out.println(c2);




    }
}

 */
