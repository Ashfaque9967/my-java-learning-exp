class myt extends Thread{
    public myt(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("THank you: " + this.getName());
        }
    }
}
public class L_57_Threads_Priority {
    public static void main(String[] args) {

        myt m = new myt("Ashfaque Shaikh 101");
        m.setPriority(Thread.MAX_PRIORITY);
        m.start();

        myt m1 = new myt("Ashfaque Shaikh");
        m1.setPriority(Thread.NORM_PRIORITY);
        m1.start();


        myt m2 = new myt("Ashfaque2");
        m2.setPriority(Thread.MIN_PRIORITY);
        m2.start();

        myt m3 = new myt("Ashfaque3");
        m3.setPriority(Thread.MIN_PRIORITY);
        m3.start();

    }
}
