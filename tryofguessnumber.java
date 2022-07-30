//import java.util.Random;
//import java.util.Scanner;
//
//class game1{
//    public int number;
//    public int Numofguesses;
//    public int inputnumber;
//
//
//    public int getNumofguesses(){
//        return Numofguesses;
//    }
//
//    public void setNumofguesses(int numofguesses) {
//        Numofguesses = numofguesses;
//    }
//
//     game1(){
//        Random rand = new Random();
//        this.number = rand.nextInt(100);
//    }
//
//    void inputnumber(){
//        Scanner sc1 = new Scanner(System.in);
//        inputnumber=sc1.nextInt();
//    }
//
//    boolean IsCorrectNumber(){
//        Numofguesses++;
//        if(number==inputnumber){
//            System.out.format("It's the right guess\nYou guessed it right :)\nThe right number is %d\nYeah!\nYour score is %d attempts",number,Numofguesses);
//        }
//        else if(inputnumber<number){
//            System.out.println("A lil greater...");
//        }
//        else if(inputnumber>number){
//            System.out.println("umm lil smaller...");
//        }
//        return false;
//
//    }
//}
//public class tryofguessnumber {
//    public static void main(String[] args) {
//        game1 gm = new game1();
//        System.out.println("Let's play the game\nShall we begin:👇");
//        boolean b = false;
//        while (!b) {
//            gm.inputnumber();
//            gm.IsCorrectNumber();
//        }
//    }
//}
