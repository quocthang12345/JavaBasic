package modal;

public class Reader {
    public static int id = 10000000;
    private int ReaderID;
    private String Fullname;
    private String Address;
    private int PhoneNumber;

    public Reader() {
    }

    public Reader(int readerID) {
        ReaderID = readerID;
    }

    public Reader(int readerID, String fullname, String address, int phoneNumber) {
        if(readerID == 0)
        {
            ReaderID = id++;
        }else ReaderID = readerID;
        Fullname = fullname;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reader.id = id;
    }

    public int getReaderID() {
        return ReaderID;
    }

    public void setReaderID(int readerID) {
        ReaderID = readerID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "ReaderID=" + ReaderID +
                ", Fullname='" + Fullname + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
