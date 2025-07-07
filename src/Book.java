public class Book {
//    Book attributes
//    TODO create the attributes of the blook
//    TODO adding the behaviours

    private long bookNumber;
    private String bookName;
    private int bookQuantity;
    private String bookAuthor;

    public long getBookNumber() {
        return bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public void setBookNumber(long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }




    public void increaseQuantity(){
        System.out.println("Increasing");
    }

    public void decreaseQuantity(){
        System.out.println("Decreasing");
    }

}
