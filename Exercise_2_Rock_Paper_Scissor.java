
import java.util.Random;
import java.util.Scanner;

public class Exercise_2_Rock_Paper_Scissor {
    public static void main(String[] args) {
//        Enter 0 for Rock
//        Enter 1 for Paper
//        Enter 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock ; Enter 1 for Paper ; Enter 2 for Scissor");
        System.out.print("Enter your number here : ");
        int userinput = sc.nextInt();
        sc.close();
        Random random = new Random();
        int compinput = random.nextInt(3);

//        Print of Computer choose
        if (compinput == 0){
            System.out.println("Computer choose: Rock");
        }
        else if (compinput == 1){
            System.out.println("Computer choose: Paper");
        }
        else if (compinput == 2){
            System.out.println("Computer choose: Scissor");
        }

        if (userinput == compinput){
            System.out.println("Draw");
        }
        else if (userinput == 0 && compinput == 2 || userinput == 1 && compinput == 0 || userinput == 2 && compinput == 1) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Loose!");
        }
    }
}


