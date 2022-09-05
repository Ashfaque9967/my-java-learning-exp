import java.time.Instant;
import java.util.Date;
public class L_72_Date_class {
    public static void main(String[] args) {


//        After & before  method :
        Date d = new Date(104,9,17);
        System.out.println(d);
        Date d1 = new Date(122,8,4);
        System.out.println(d1.after(d));
        System.out.println(d1.before(d));

//        SetTime :
        Date d2 = new Date(104,9,17);
        long l = 1000;
        d2.setTime(l);
        System.out.println(d2.getTime());

//        Hashcode :
        Date d3 = new Date(104,9,17);
        System.out.println(d3);
        System.out.println(d3.hashCode());

//        Toinstant :
        Date d4 = new Date(104,9,17,05,30);
        System.out.println(d4);
        Instant i = d4.toInstant();
        System.out.println(i);

//        toString :
        Date d5 = new Date(104,9,17,04,30);
        System.out.println(d5);
        System.out.println(d5.toString());

    }
}
