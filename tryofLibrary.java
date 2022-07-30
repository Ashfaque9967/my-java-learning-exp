//class Library1{
//    String[] books;
//    int no_of_book;
//    Library1(){
//        this.books = new String[100];
//        this.no_of_book = 0;
//    }
//    void addbook(String book){
//        this.books[no_of_book] = book;
//        no_of_book++;
//        System.out.println(book + " has been issued");
//    }
//    void showavailablebook(){
//        System.out.println("The available books are:");
//        for (String book:this.books) {
//            if (book == null){
//                continue;
//            }
//            System.out.println("* " + book);
//        }
//    }
//    void issuebook(String book){
//        for(int i = 0;i<this.books.length;i++){
//            if(this.books[i].equals(book)){
//                System.out.println(book+" book has been issued");
//                this.books[i] = null;
//            }
//            return;
//        }
//        System.out.println("Sorry!"+ book + " book is not available yet");
//    }
//    void returnbook(String book){
//        addbook(book);
//    }
//}
//
//public class tryofLibrary {
//    public static void main(String[] args) {
//        // You have to implement a library using java class "Library"
//        // Methods: addbook, issuebook, returnbook, showavailablebooks
//        // Properties: Array to store the available books.
//        // Array to store the issued books
//
//        Library1 lb = new Library1();
//        lb.addbook("Rich");
//        lb.addbook("Middle");
//        lb.addbook("Lower");
//        lb.showavailablebook();
//        lb.issuebook("Rich");
//        lb.showavailablebook();
////        lb.issuebook("grown");  ------> why we can't issue a book twice
//        lb.returnbook("Rich");
//        lb.addbook("Trees");
//        lb.showavailablebook();
//    }
//}
