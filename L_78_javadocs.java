///**
// * In this, we created the java docs for the library
// * @author ASHFAQUE
// * @version 0.1
// * @since 2022
// * @see <a href="https://www.youtube.com/watch?v=VysxZDROr64&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=61&t=661s"
// * target="_blank">for video click herer</a>
// */
//public class L_78_javadocs{
//    /**
//     * No use for now!
//     */
//    public L_78_javadocs() {
//        //No use for mow!!
//    }
//
//    /**
//     * This class holds the functionality of the library.
//     */
//    public static class Library{
//        String[] books;
//        int no_of_books;
//
//        /**
//         * This constructor can store 100 numbers of books.
//         * <pre>{It take no parameter and does not return anything.}</pre>
//         */
//
//        public Library(){
//            this.books = new String[100];
//            this.no_of_books = 0;
//        }
//
//        /**
//         *This method take parameter of book as string and perform an operation to add books in the library.
//         * @param books This method is use to add new book to the library
//         */
//        public void addbooks(String books){
//            this.books[no_of_books] = books;
//            no_of_books++;
//            System.out.println(books + " has been added");
//        }
//
//        /**
//         * This method shows all the available book in the library.
//         */
//        public void showavailablebooks(){
//            int a = 1;
//            System.out.println("Available books are: ");
//            for (String book:this.books) {
//                if (book == null){
//                    continue;
//                }
//                System.out.format("%d. %s\n", a, book);
//                a++;
//            }
//        }
//
//        /**
//         * To issue a book from the library
//         * @param book this method take parameter as name of the book in string form.
//         */
//        public void issuebook(String book){
//            for (int i = 0;i<this.books.length; i++){
//                if (this.books[i].equals(book)){
//                    System.out.println( book + " book has been issued");
//                    this.books[i] = null;
//                    return;
//                }
//            }
//            System.out.println("Sorry! we don't have "+ book + " book available yet.");
//        }
//
//        /**
//         * To return the issued book from the library
//         * @param book This method take parameter as name of the book in string form.
//         */
//        public void returnbook(String book){
//            addbooks(book);
//        }
//    }
//    /**
//     *The main function or method
//     * @param args These are the args supplied to the command lines
//     * <pre>Here we make our object of library class.</pre>
//     */
//    public static void main(String[] args) {
//        // You have to implement a library using java class "Library"
//        // Methods: addbook, issuebook, returnbook, showavailablebooks
//        // Properties: Array to store the available books.
//        // Array to store the issued books
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
//    }
//}
