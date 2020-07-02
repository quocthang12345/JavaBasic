package modal;

public class BRManage {
    private Reader reader;
    private Book book;
    private int NumofBorrow;
    private String state;
    private int Total;

    public BRManage(Book book) {
        this.book = book;
    }

    public BRManage() {
    }

    public BRManage(Reader reader, Book book,int numofBorrow, String state, int total) {
        this.reader = reader;
        this.book = book;
        NumofBorrow = numofBorrow;
        this.state = state;
        Total = total;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumofBorrow() {
        return NumofBorrow;
    }

    public void setNumofBorrow(int numofBorrow) {
        NumofBorrow = numofBorrow;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    @Override
    public String toString() {
        return "BRManage{" +
                " ReaderID=" + reader.getReaderID() +
                ", Reader=" + reader.getFullname() +
                ", BookID=" + book.getBookId() +
                ", BookName=" + book.getBookName() +
                ", State='" + state + '\'' +
                ", NumofBorrow=" + NumofBorrow +
                ", Total=" + Total +
                '}';
    }
}
