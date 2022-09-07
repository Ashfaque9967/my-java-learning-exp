//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//public class L_74_Gregorian_Calender {
//    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTime());
//
////        12 hours format:
//        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//
////        24 hours format:
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//
////        Timezone ID:
//        System.out.println(c.getTimeZone().getID());
//
////        Months:
//        String month[] = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
////        AM/PM:
//        String ampm[] = {"AM", "PM"};
////        days:
//        String days[] = {"sat", "sun", "mon", "tue", "wed", "thu", "fri"};
//
////        object:
//        GregorianCalendar c1 = new GregorianCalendar();
//
////
//        System.out.println(days[c1.get(Calendar.DAY_OF_WEEK)] +
//                " " + month[c1.get(Calendar.MONTH)] +
//                " " + c1.get(Calendar.DATE) +
//                " " + c1.get(Calendar.HOUR_OF_DAY) +
//                ":" + c1.get(Calendar.MINUTE) +
//                ":" + c1.get(Calendar.SECOND) +
//                " " + ampm[c1.get(Calendar.ERA)] +
//                " " + c1.getTimeZone().getDisplayName() +
//                " " + c1.get(Calendar.YEAR));
//
//
//    }
//}
