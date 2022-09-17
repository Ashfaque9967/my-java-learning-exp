//class Library{
//    String[] books;
//    int no_of_books;
//
//    //    We can store 100 books:
//    Library(){
//        this.books = new String[100];
//        this.no_of_books = 0;
//    }
//    //    Add a book
//    void addbooks(String books){
//        this.books[no_of_books] = books;
//        no_of_books++;
//        System.out.println(books + " has been added");
//    }
//    //    Show's available books:
//    void showavailablebooks(){
//        int a = 1;
//        System.out.println("Available books are: ");
//        for (String book:this.books) {
//            if (book == null){
//                continue;
//            }
//            System.out.format("%d. %s\n", a, book);
//            a++;
//        }
//    }
//    //    To issue a book:
//    void issuebook(String book){
//        for (int i = 0;i<this.books.length; i++){
//            if (this.books[i].equals(book)){
//                System.out.println( book + " book has been issued");
//                this.books[i] = null;
//                return;
//            }
//        }
//        System.out.println("Sorry! we don't have "+ book + " book available yet.");
//    }
//    //    To return a book:
//    void returnbook(String book){
//        addbooks(book);
//    }
//}
//public class Exercise_04_Library {
//    public static void main(String[] args) {
//     // You have to implement a library using java class "Library"
//     // Methods: addbook, issuebook, returnbook, showavailablebooks
//     // Properties: Array to store the available books.
//     // Array to store the issued books
//
//        Library lb = new Library();
//        lb.addbooks("Rich N Poor");
//        lb.addbooks("Theory Of Time");
//        lb.addbooks("Money Is Easy");
//        lb.showavailablebooks();
//        lb.issuebook("Rich N Poor");
//        lb.showavailablebooks();
//        lb.addbooks("Time Is Everything");
//        lb.showavailablebooks();
//        lb.returnbook("Rich N Poor");
//        lb.showavailablebooks();
//
//    }
//}
