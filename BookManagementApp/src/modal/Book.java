package modal;

public class Book {
    public static int id = 100000;
    private int BookId;
    private String BookName;
    private String Author;
    private String Specialization;
    private int PublishYear;
    private int quantity;

    public Book() {
    }

    public Book(int bookId) {
        BookId = bookId;
    }

    public Book(int bookId, String bookName, String author, String specialization, int publishYear, int quantity) {
        if(bookId == 0)
        {
            BookId = id++;
        }else{
            BookId = bookId;
        }

        BookName = bookName;
        Author = author;
        Specialization = specialization;
        PublishYear = publishYear;
        this.quantity = quantity;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public int getPublishYear() {
        return PublishYear;
    }

    public void setPublishYear(int publishYear) {
        PublishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", PublishYear=" + PublishYear +
                ", quantity=" + quantity +
                '}';
    }
}
