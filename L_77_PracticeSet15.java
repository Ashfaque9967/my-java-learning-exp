//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//
//public class L_77_PracticeSet15 {
//    public static void main(String[] args) {
//
//        // Problem : 1
//        ArrayList<String> al = new ArrayList<>();
//        int i = 1;
//        al.add("Iron man");
//        al.add("Captain america");
//        al.add("Thor");
//        al.add("Hulk");
//        al.add("Hawkeye");
//        al.add("Black widow");
//        al.add("Scarlet witch");
//        al.add("Vision");
//        al.add("Nick Fury");
//        al.add("War machine");
//        for (String A:al) {
//            System.out.println(i+". "+A);
//            i++;
//        }
//
//        // Problem : 2
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
//
//        // Problem : 3
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
//
//        // Problem : 4
//        LocalTime lt = LocalTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("kk:mm:ss");
//        String date = lt.format(dtf);
//        System.out.println(date);
//        // Problem : 5
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(4);
//        hs.add(6);
//        hs.add(4);
//        hs.add(9);
//        System.out.println(hs); // --> Direct printing objects.
//        for (int a : hs) {  //  --> Printing by for each loop.
//            System.out.println(a);
//        }
//
//    }
//}