package controller;

import modal.BRManage;
import modal.Book;
import modal.Reader;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataControl {
    /*
        Ghi thông tin Book vào file
        Ghi thông tin Reader vào file
        Ghi thông tin BRManage vào file

        Đọc thông tin Book/Reader/BRManage trong file qua các bước:
        + Chuyển dữ liệu sang kiểu đối tượng Book/Reader/BRManage ( vì kiểu từ file vào là String)
        + Thêm vào danh sách đối tượng Book/Reader/BRManage
        + Xuất danh sách đối tượng Book/Reader/BRManage

        Quy ước ghi thông tin vào file
            + Mỗi đối tượng đc ghi trên 1 dòng
            + Giữa các thuộc tính cách nhau bằng dấu |
        Ví dụ:
        Reader(ReaderID,fullname,adress,phonenumber)
        thì thông tin trong file sẽ là : ReaderID | fullname | address | phonenumber

     */

    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;


/*Bắt đầu Ghi file*/
    public void OpenFiletoWrite(String FileName)
    {
        try {
            fileWriter = new FileWriter(FileName,true);// Mở file hiện đang có và ghi vào cuối danh sách bằng method append()
            // để ko mất dữ liệu
            bufferedWriter = new BufferedWriter(fileWriter);// gói dữ liệu ghi được ở trên vào bufferedwriter để tăng hiệu suất
            printWriter = new PrintWriter(bufferedWriter); // ghi tất cả dữ liệu vào file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void WriteBooktoFile(String FileName, Book book)
    {
        OpenFiletoWrite(FileName);
        printWriter.println(book.getBookId() + "|" + book.getBookName() + "|" + book.getAuthor() + "|" + book.getSpecialization()
                            + "|" + book.getPublishYear() + "|" + book.getQuantity() );
        CloseFileAfterWrite(FileName);
    }
    public void WriteReadertoFile(String FileName, Reader reader)
    {
        OpenFiletoWrite(FileName);
        printWriter.println(reader.getReaderID()+ "|"+ reader.getFullname()+ "|" +reader.getAddress() + "|" +reader.getPhoneNumber());
        CloseFileAfterWrite(FileName);
    }
    public void WriteBRMtoFile(String FileName, BRManage brManage)
    {
        OpenFiletoWrite(FileName);
        printWriter.println(brManage.getReader().getReaderID()+ "|"+ brManage.getBook().getBookId()+ "|" +brManage.getNumofBorrow() +
                "|" + brManage.getState()); // ko cập nhật getTotal vì sẽ được xử lí bằng 1 method khác
        CloseFileAfterWrite(FileName);
    }
    public void CloseFileAfterWrite(String FileName)
    {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*Kết thúc Ghi File*/




/*Bắt đầu Đọc File và convert từ String sang Đối tượng*/
    public void OpenFiletoRead(String FileName)
    {
        try {
            File file = new File(FileName);
            if (!file.exists()){
                file.createNewFile(); // nếu file ko tồn tại thì tạo file mới
            }
            scanner = new Scanner(Paths.get(FileName),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public ArrayList<Book> ReadBooktoFile(String FileName)
    {
        OpenFiletoRead(FileName);
        ArrayList<Book> books = new ArrayList<>();
        while(scanner.hasNextLine())// nếu file vẫn còn dòng
        {
            String data = scanner.nextLine();
            Book book = CreateBookFromData(data);
            books.add(book);
        }
        CloseFileAfterRead(FileName);
        return books;
    }
    private Book CreateBookFromData(String data) {
        String[] res = data.split("\\|");
//        printWriter.println(book.getBookId() + " | " + book.getBookName() + " | " + book.getAuthor() + " | " + book.getSpecialization()
//                + " | " + book.getPublishYear() + " | " + book.getQuantity() );
//        Book(int bookId, String bookName, String author, String specialization, int publishYear, int quantity)
        Book book = new Book(Integer.parseInt(res[0]),res[1],res[2],res[3],Integer.parseInt(res[4]),Integer.parseInt(res[5]));
        return book;
    }



    public ArrayList<Reader> ReadReadertoFile(String FileName)
    {
        OpenFiletoRead(FileName);
        ArrayList<Reader> readers = new ArrayList<>();
        while(scanner.hasNextLine())// nếu file vẫn còn dòng
        {
            String data = scanner.nextLine();
            Reader reader1 = CreateReaderFromData(data);
            readers.add(reader1);
        }
        CloseFileAfterRead(FileName);
        return readers;
    }
    private Reader CreateReaderFromData(String data) {
        String[] res = data.split("\\|");
//        printWriter.println(reader.getReaderID()+ " | "+ reader.getFullname()+ " | " +reader.getAddress() +" | " +reader.getPhoneNumber());
//        Reader(int readerID, String fullname, String address, int phoneNumber)
        Reader reader1 = new Reader(Integer.parseInt(res[0]),res[1],res[2],Integer.parseInt(res[3]));
        return reader1;
    }



    public ArrayList<BRManage> ReadBRMtoFile(String FileName)
    {
        var books = ReadBooktoFile("BOOK.DAT");
        var readers = ReadReadertoFile("Reader.DAT");
        OpenFiletoRead(FileName);
        ArrayList<BRManage> brm = new ArrayList<>();
        while(scanner.hasNextLine())
        {
            String data = scanner.nextLine();
            BRManage brm1 = CreateBrmFromData(data,books,readers);
            brm.add(brm1);
        }
        CloseFileAfterRead(FileName);
        return brm;
    }
    private BRManage CreateBrmFromData(String data, ArrayList<Book>books,ArrayList<Reader>readers) {
        String[] res = data.split("\\|");
//        printWriter.println(brManage.getReader().getReaderID()+ " | "+ brManage.getBook().getBookId()+ " | " +brManage.getNumofBorrow() +
//                " | " + brManage.getState()); // ko cập nhật getTotal vì sẽ được xử lí bằng 1 method khác
//        BRManage(Reader reader, Book book,int numofBorrow, String state, int total)
        BRManage brm1 = new BRManage(getReader(readers,Integer.parseInt(res[0])),getBook(books,Integer.parseInt(res[1]))
                ,Integer.parseInt(res[2]),res[3],0);
        return brm1;
    }
    private static Book getBook(ArrayList<Book> books, int bookID) {
        for (int i = 0 ; i < books.size() ; i++) {
            if(books.get(i).getBookId() == bookID)
                return books.get(i);
        }
        return null;
    }
    private static Reader getReader(ArrayList<Reader> readers, int readerID) {
        for (int i = 0 ; i < readers.size() ; i++) {
            if(readers.get(i).getReaderID() == readerID)
                return readers.get(i);
        }
        return null;
    }



    public void CloseFileAfterRead(String FileName)
    {
        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

/* Kết thúc đọc file*/


/* Bắt đầu Update File*/
    public void UpdateFile(ArrayList<BRManage> b, String FileName)
    {
        // xóa file đang có và tạo một file mới
        File file = new File(FileName);
        if(file.exists()){ // nếu file tồn tại
            file.delete(); // xóa file cũ
        }
        OpenFiletoWrite(FileName);// tạo file mới
        for (var brManage: b) {
            printWriter.println(brManage.getReader().getReaderID()+ "|"+ brManage.getBook().getBookId()+ "|" +brManage.getNumofBorrow() +
                    "|" + brManage.getState()); // ko cập nhật getTotal vì sẽ được xử lí bằng 1 method khác
        }
        CloseFileAfterWrite(FileName);
    }
/* Kết thúc Update*/

}
