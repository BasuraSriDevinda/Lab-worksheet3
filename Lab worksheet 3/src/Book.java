public class Book extends BorrowableItems{
   private  String title ;
    private  String author ;
    private  String ISBN ;


    private  boolean available ;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public  void  displayInfo(){
        System.out.println("title "+title);
        System.out.println("author "+author);
        System.out.println("ISBN "+ISBN);
        System.out.println("available "+available);

    }
}
