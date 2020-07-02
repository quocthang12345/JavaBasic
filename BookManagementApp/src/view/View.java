package view;

import controller.DataControl;
import controller.UtilityControl;
import modal.BRManage;
import modal.Book;
import modal.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataControl control = new DataControl();
        var BookFile = "BOOK.DAT";
        var ReaderFile = "Reader.DAT";
        var BrmFile = "BRM.DAT";
        var Utility = new UtilityControl();
        var brms = new ArrayList<BRManage>();
        var books = new ArrayList<Book>();
        var readers = new ArrayList<Reader>();

        boolean IsBorrowable = false;
        boolean Isbookcheck = false ;
        boolean Isreadercheck = false ;
        int choose = 0;
        do{
            System.out.println("______________________________MENU_________________________________");
            System.out.println("1. Thêm Book vào File ! ");
            System.out.println("2. In danh sách các Book có trong File !" );
            System.out.println("3. Thêm Reader vào File ! ");
            System.out.println("4. In danh sách các Reader có trong File !");
            System.out.println("5. Lập thông tin quản lý mượn !");
            System.out.println("6. Sắp xếp thông tin quản lý mượn !");
            System.out.println("7. Tìm kiếm thông tin quản lý mượn !");
            System.out.println("0. Thoát khỏi ứng dụng !");
            System.out.println("Bạn chọn ?");

            choose = scanner.nextInt();
            String choose1 = scanner.nextLine();
            switch (choose){
                case 0: {
                    System.out.println("______________________THANK YOU______________________________");
                    System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi, hãy quay lại và trải nghiệm thêm lần nữa nhé <3");
                    break;
                }
                case 1:{
                    if(!Isbookcheck) {
                        CheckBookID(control, BookFile);
                        Isbookcheck = true;
                    }
                    String[] typebook ={"Sciene","Art","Economic","IT"};
                    String bookname,author,spec;
                    int pyear,quantity,sp;

                    System.out.println("Moi nhap ten sach: ");
                    bookname = scanner.nextLine();

                    System.out.println("Moi nhap tac gia: ");
                    author = scanner.nextLine();

                    do{
                        System.out.println("Moi nhap loai sach cua bạn: ");
                        System.out.println("1.Sciene\t2.Art\t3.Economic\t4.IT");
                        sp = scanner.nextInt();
                    }while(sp < 1 || sp > 4 );
                    spec = typebook[sp-1];

                    System.out.println("Nhap nam xuat ban cua sach: ");
                    pyear = scanner.nextInt();

                    System.out.println("Nhap so luong sach: ");
                    quantity = scanner.nextInt();

                    Book book = new Book(0,bookname,author,spec,pyear,quantity);
                    control.WriteBooktoFile(BookFile,book);
                    break;
                }
                case 2:
                {
                    books = control.ReadBooktoFile(BookFile);
                    ShowInfoBook(books);
                    break;
                }
                case 3:
                {
                    if(!Isreadercheck) {
                        CheckReaderID(control, ReaderFile);
                        Isreadercheck = true;
                    }
                    String name,address;
                    int phonenumber;
                    System.out.println("Nhap ho va ten cua nguoi doc: ");
                    name = scanner.nextLine();
                    System.out.println("Nhap dia chi cua nguoi doc: ");
                    address= scanner.nextLine();
                    System.out.println("Nhap so dien thoai cua nguoi doc: ");
                    phonenumber = scanner.nextInt();
                    Reader reader = new Reader(0,name,address,phonenumber);
                    control.WriteReadertoFile(ReaderFile,reader);
                    break;
                }
                case 4:
                {
                    readers = control.ReadReadertoFile(ReaderFile);
                    ShowInfoReader(readers);
                    break;
                }
                /*
                    Chức năng 5: Khó nhất
                    B1: Đọc ra danh sách của reader, book, BookReaderManagement
                    B2: Chọn một bạn từ danh sách reader để cho phép mượn. Nếu đủ số lượng mượn sách thì không cho mươn
                    nữa ( 1 Reader => 5 Books difference , 1 Books => 3 cuốn)
                    B3: Chọn một đầu sách từ danh sách book cần mượn. Nếu đầu sách đó đã được mượn tối đa số lượng cuốn sách
                    cho phép thì không được mượn tiếp, yêu cầu mượn sách khác .
                    B4: Nếu được mượn tiếp thì thực hiện nhập số lượng mượn, tình trạng sách lúc mượn( nhập NumofBorrow và State)
                    B5: Ghi vào File và cập nhật BRM.DAT
                    B6 : In danh sách ra màn hình
                */
                case 5:
                {
                    //b1:
                    int ReaderID, BookID;
                    books = control.ReadBooktoFile(BookFile);
                    readers = control.ReadReadertoFile(ReaderFile);
                    brms = control.ReadBRMtoFile(BrmFile);

                    //b2:
                    boolean IsBorrowFullEachBook = false;
                    do{
                        System.out.println("_____________________________Thong tin reader dang co___________________________");
                        ShowInfoReader(readers);
                        System.out.println("Moi nhap ID cua reader, Nhap 0 de bo qua: ");
                        ReaderID = scanner.nextInt();
                        if (ReaderID == 0) break;
                        else{
                            IsBorrowable = CheckBorrow(brms,ReaderID);
                            if(IsBorrowable) break; // đc tt mượn
                            else{
                                System.out.println("Ban doc da muon du sach! Cam on");
                            }
                        }
                    }while(true);
                    //b3:
                    do{
                        System.out.println("_____________________________Thong tin book dang co_____________________________");
                        ShowInfoBook(books);
                        System.out.println("Moi nhap ID cua book, Nhap 0 de bo qua: ");
                        BookID = scanner.nextInt();
                        if(BookID == 0) break;
                        else{
                            IsBorrowFullEachBook = CheckBorrowFull(brms,ReaderID,BookID);
                            if (IsBorrowFullEachBook) {
                                System.out.println("ban da muon du so luong sach nay! Vui long muon sach khac");
                            }else {
                                break;
                            }
                        }
                    }while (true);

                    //b4:
                    int total = getTotal(brms,ReaderID,BookID); // numOfBorrow
                    int totalrent;
                    do{
                        System.out.println("Nhap so luong sach muon, toi da 3 cuon(da muon " + total + "): "+" ");
                        int x = scanner.nextInt();
                        if( (x + total) >= 1 && (x + total) <= 3){
                            total+=x;
                            break;
                        }
                        else{
                            System.out.println("Moi nhap lai");
                        }
                    }while (true);
                    scanner.nextLine(); // xoa bo dong chua so;
                    System.out.println("Nhap tinh trang cua sach: ");
                    String status = "";
                    status = scanner.nextLine();

                    //b5:
                    Book currentBook = getBook(books,BookID);
                    Reader currentReader = getReader(readers,ReaderID);
//                    BRManage(Reader reader, Book book,int numofBorrow, String state, int total)
                    BRManage brManage = new BRManage(currentReader,currentBook,total,status,0);
                    /* Update */
                    brms = Utility.UpdateBRmInfo(brms,brManage); // update thông tin trong list
                    control.UpdateFile(brms,BrmFile); // update thông tin trên file
                    //b6:
                    ShowInfoBRM(brms);
                    break;

                }
                case 6:
                    int x;
                    brms = control.ReadBRMtoFile(BrmFile);
                    // update tổng số lượng mượn
                    brms = Utility.UpdateTotalBorrow(brms);
                    do {
                        System.out.println("_________________________Sắp xếp________________________________");
                        System.out.println("1. Sắp xếp theo tên ");
                        System.out.println("2. Sắp xếp theo tổng số lượng mượn(giảm dần) ");
                        System.out.println("0. Kết thúc");
                        x = scanner.nextInt();
                        if (x == 0) break;
                        switch (x){
                            case 1:
                                // update sắp xếp theo tên
                                Utility.SortByName(brms);
                                ShowInfoBRM(brms);
                                break;
                            case 2:
                                // update sắp xếp theo số lượng
                                Utility.SortByTotalBorrow(brms);
                                ShowInfoBRM(brms);
                                break;

                        }
                    }while(true);
                case 7:
                    brms=control.ReadBRMtoFile(BrmFile);
                    System.out.println("Nhap ten nguoi doc ma ban muon tim: ");
                    String key = scanner.nextLine();
                    var res = Utility.Find(brms,key);
                    if (res.size() == 0) System.out.println("Khong co ket qua");
                    else {
                        ShowInfoBRM(res);
                    }
                    break;

            }
        }while(choose!=0);
    }

    private static void ShowInfoBRM(ArrayList<BRManage> brms) {
        for (var b: brms) {
            System.out.println(b);
        }
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

    private static int getTotal(ArrayList<BRManage> brms, int readerID, int bookID) {
        for (var b: brms) {
            if(b.getReader().getReaderID() == readerID && b.getBook().getBookId() == bookID)
                return b.getNumofBorrow();
        }
        return 0;
    }

    private static boolean CheckBorrowFull(ArrayList<BRManage> brms, int readerID, int bookID) {
        for (var b: brms) {
            if(b.getReader().getReaderID() == readerID && b.getBook().getBookId() == bookID && b.getNumofBorrow() >= 3)
                return true;
        }
        return false;
    }

    private static void CheckReaderID(DataControl control, String FileName) {
        var listreader = control.ReadReadertoFile(FileName);
        Reader.setId(listreader.get(listreader.size()-1).getReaderID() + 1);
    }
    private static void ShowInfoReader(ArrayList<Reader> readers) {
        System.out.println("______________________Thong tin Reader____________________________");
        for (var b: readers) {
            System.out.println(b);
        }
    }



    private static void ShowInfoBook(ArrayList<Book> books) {
        System.out.println("______________________Thong tin Book______________________________");
        for (var b: books) {
            System.out.println(b);
        }
    }
    private static void CheckBookID(DataControl control,String FileName) {
        var listbook = control.ReadBooktoFile(FileName);
        Book.setId(listbook.get(listbook.size() - 1 ).getBookId() + 1); // lấy id cuối cùng của danh sách + 1
    }

    private static boolean CheckBorrow(ArrayList<BRManage> brm , int ReaderID)
    {
        int count = 0;
        for (var r : brm) {
            if(r.getReader().getReaderID() == ReaderID){
                count += r.getNumofBorrow();
            }
        }
        if(count >= 15) return false;
        else return true;
    }
}
