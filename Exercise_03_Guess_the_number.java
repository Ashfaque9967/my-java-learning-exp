//import java.util.Random;
//import java.util.Scanner;
//
//class game{
//    public int number;
//    public int NoOfGuesses;
//    public int InputNumber;
//
//    public int getNoOfGuesses() {
//        return NoOfGuesses;
//    }
//
//    public void setNoOfGuesses(int noOfGuesses) {
//        NoOfGuesses = noOfGuesses;
//    }
//
//    game(){
//        Random ran = new Random();
//        this.number=ran.nextInt(100);
//    }
//    void TakeUserInput(){
//        System.out.print("Guess the number: ");
//        Scanner sc = new Scanner(System.in);
//        InputNumber = sc.nextInt();
//
//    }
//    boolean IsCorrectNumber(){
//        NoOfGuesses++;
//        if (InputNumber == number){
//            System.out.format("Yeah! you guessed it right,\nIt was %d.\nYou guessed it in %d attempts.\n",number,NoOfGuesses);
//            return true;
//        }
//        else if (InputNumber<number){
//            System.out.println("too low...");
//        }
//        else if (InputNumber>number){
//            System.out.println("too high...");
//        }
//        return false;
//    }
//}
//
//public class Exercise_03_Guess_the_number {
//    public static void main(String[] args) {
//        /*
//
//           Create a class game, which allows a user to play "Guess the Number" game once.
//           Game should have the following methods:
//           1. Constructor to generate the random number.
//           2. TakeUserInput() to take user input number
//           3. IscorrectNumber() to detect whether the number entered by the user is true
//           4. getter and setter for NoOfGuesses
//           use properties such as NoOfGuesses(int), etc to get this task done
//
//         */
//        game g = new game();
//        System.out.print("Can you guess the correct number between 1 to 100\nIf Yes then,\n");
//        boolean b = false;
//        while(!b) {
//            g.TakeUserInput();
//            b = g.IsCorrectNumber();
//        }
//    }
//
//}
