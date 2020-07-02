package Bai6;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Bai6_2 implements ActionListener{
    private JFrame frame;
    private Panel inputPanel, oPanel;
    private Label urlLabel, queryLabel;
    private TextField urlField, queryField;
    private DefaultTableModel tblModel;
    private JTable table;
    private JScrollPane sPane;
    private Button sButton, rButton, cButton;
    private Connection conn;

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        try{
            new Bai6_2();
        }
        catch(ClassNotFoundException err){
            System.out.println("ClassNotFound: "+err.getMessage());
        }
        catch(SQLException err){
            System.out.println("SQLException: "+err.getMessage());
        }
        catch(Exception err){
            System.out.println("Exception: "+err.getMessage());
        }
    }
    public void connect(String url, String userName, String pwd) throws ClassNotFoundException, SQLException, Exception {
        if(url == null)
            throw new Exception("Loi");
        if(userName == null) userName = "root";
        if(pwd == null) pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, userName, pwd);
    }
    public Bai6_2() throws ClassNotFoundException, SQLException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(frame);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
    private void addComponents(JFrame frame) throws ClassNotFoundException, SQLException{
        urlLabel = new Label("Input information");
        urlField = new TextField();
        queryLabel = new Label("SQL");
        queryField = new TextField();
        inputPanel = new Panel();
        inputPanel.setLayout(new GridLayout(2,2));
        inputPanel.add(urlLabel);
        inputPanel.add(urlField);
        inputPanel.add(queryLabel);
        inputPanel.add(queryField);
        tblModel = new DefaultTableModel();
        table = new JTable(tblModel);
        sPane = new JScrollPane(table);
        sButton = new Button("Submit");
        sButton.addActionListener(this);
        rButton = new Button("Reset");
        rButton.addActionListener(this);
        cButton = new Button("Cancel");
        cButton.addActionListener(this);
        oPanel = new Panel();
        oPanel.setLayout(new FlowLayout());
        oPanel.add(sButton);
        oPanel.add(rButton);
        oPanel.add(cButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(inputPanel);
        frame.add(sPane);
        frame.add(oPanel);
    }
    private void fetchTableModel(String url, String query) throws ClassNotFoundException, SQLException, Exception{

        if(query==null || query=="" || url ==null || url=="")
            throw new Exception("Loi");
        connect(url, null, null);
        String[] colNames;
        List<String[]> data = new ArrayList<String[]>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData metadata = rs.getMetaData();
        colNames = new String[metadata.getColumnCount()];
        for(int i = 0; i<metadata.getColumnCount();++i){
            colNames[i] = metadata.getColumnName(i+1);
        }
        while(rs.next()){
            int n = metadata.getColumnCount();
            String[] temp = new String[n];
            for(int i = 0; i<n; ++i)
                temp[i] = rs.getString(i+1);
            data.add(temp);
        }
        stmt.close();
        rs.close();
        String[][] res = new String[data.size()][];
        for (int i = 0; i < data.size(); i++) {
            res[i] = data.get(i);
        }

        tblModel = new DefaultTableModel(res,colNames);
    }
    public void actionPerformed(ActionEvent args){
        Button bttn = (Button)args.getSource();
        try{
            if(bttn == sButton){
                String query = queryField.getText(),
                        url = urlField.getText();
                fetchTableModel(url, query);
                table.setModel(tblModel);
            }
            else if(bttn == rButton){
                urlField.setText("");
                queryField.setText("");
            }
            else if(bttn == cButton){

                System.exit(0);
            }
        }
        catch(ClassNotFoundException err){
            System.out.println("ClassNotFoundException: "+err.getMessage());
        }
        catch(SQLException err){
            System.out.println("SQLException: "+err.getMessage());
        }
        catch(Exception err){
            System.out.println("Common exception: "+err.getMessage());
        }
    }
}