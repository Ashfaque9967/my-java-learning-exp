//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class L_76_DateTimeFormatter {
//    public static void main(String[] args) {
//
//        LocalDateTime ldt = LocalDateTime.now();  // This is a date
//        System.out.println(ldt);
//        System.out.println("-------------------------------");
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  // This is a Format
//        String date = ldt.format(dtf);  //Creating date string using date and format
//        System.out.println(date + " <-custom format");
//        System.out.println("-------------------------------");
//
//        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_DATE;  // This is a pattern format
//        String Date = ldt.format(dtf1);  //Creating date string using date and format
//        System.out.println(Date + "<-pattern format");
//        System.out.println("-------------------------------");
//
//        // Creating my owm Date and Time format using formatter
//        DateTimeFormatter mf = DateTimeFormatter.ofPattern("h:m\nE, d LLL");
//        String md = ldt.format(mf);
//        System.out.println("---My Phone's Date 'n' Time format---\n"+md);
//        System.out.println("-------------------------------");
//    }
//}
