
/*
class phone{

    public void SwitchOn(){
        System.out.println("Turning ON Phone...");
    }

    public void DisplayMessage(){
        System.out.println("Brand Name...");
    }

    public void MakeCall(){
        System.out.println("Making a Call...");
    }

}
class Smartphone extends phone{
    public void SwitchOn(){
        System.out.println("Turning ON Phone...");
    }

    public void DisplayMessage(){
        System.out.println("Brand Name...");
    }

    public void MakeCall(){
        System.out.println("Making a Call...");
    }

    public void PlayMusic(){
        System.out.println("Playing Music...");
    }

}

public class L_44_Dynamic_Dispatch_Method {
    public static void main(String[] args) {
//        phone cell = new phone();
//        cell.SwitchOn();
//        cell.DisplayMessage();
//        cell.MakeCall();
//        Smartphone smcell = new Smartphone();
//        smcell.SwitchOn();
//        smcell.DisplayMessage();
//        smcell.PlayMusic();

//        Smartphone cell1 = new phone();
        phone cell = new Smartphone();  // If reference is of parent class it only reaches OverRide Methods
        cell.SwitchOn();
        cell.DisplayMessage();
        cell.MakeCall();
//        cell.PlayMusic();



    }
}

 */
