import java.util.Scanner;

public class BookTest{
    public static class Book {
        private String bookName;
        private String isbnNumber;
        private String authorName;
        private String publisher;

        public Book(String bookName, String isbnNumber, String authorName, String publisher) {
            this.bookName = bookName;
            this.isbnNumber = isbnNumber;
            this.authorName = authorName;
            this.publisher = publisher;
        }

        public String getBookName(){
            return this.bookName;
        }
        public void setBookName(String bookName){
            this.bookName = bookName;
        }

        public String getIsbnNumber(){
            return this.isbnNumber;
        }
        public void setIsbnNumber(String isbnNumber){
            this.isbnNumber = isbnNumber;
        }

        public String getAuthorName(){
            return this.authorName;
        }
        public void setAuthorName(String authorName){
            this.authorName = authorName;
        }

        public String getPublisher(){
            return this.publisher;
        }
        public void setPublisher(String publisher){
            this.publisher = publisher;
        }

        public String getBookInfo(){
            return "Book Name: " + this.bookName + "\n" +
                   "ISBN Number: " + this.isbnNumber + "\n" +
                   "Author Name: " + this.authorName + "\n" +
                   "Publisher: " + this.publisher;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[30];

        for(int i = 0; i < books.length; i++){
            System.out.println("Enter details for book " + (i+1) + ":");

            System.out.print("Book Name: ");
            String bookName = scanner.nextLine();
            System.out.print("ISBN Number: ");
            String isbnNumber = scanner.nextLine();
            System.out.print("Author Name: ");
            String authorName = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            books[i] = new Book(bookName, isbnNumber, authorName, publisher);
        }

        for(int i = 0; i < books.length; i++){
            System.out.println("\nDetails of book " + (i + 1) + ":");
            System.out.println(books[i].getBookInfo());
        }

    }
}

