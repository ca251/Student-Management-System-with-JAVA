package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;
    Scanner sc = new Scanner(System.in);


    public Model() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s.t.e.m", "root", "");
            System.out.println("connected to DB...");
        } catch (Exception err) {=
            System.out.println("Error: " + err);
        }

    }

//--------------------------------------------------------------------------------------------------------------------------
    public void showLogInMenu() {

        System.out.println("************WELCOME TO S.T.E.M ********************");
        System.out.println("1.Admin");
        System.out.println("2.Agent");
        System.out.println("3.Student");
        System.out.println("4. exit");
    }
    //--------------------------------------------------------------------------------------------------------------------
    private static void logAgent(String username, String password)throws SQLException{
        String databaseUsername = "";
        String databasePassword = "";
        int count=0;
        Scanner sc = new Scanner(System.in);
        // Check Username and Password
        System.out.print("Enter Username: ");
        String name = sc.next();
        System.out.print("Enter Password: ");
        String Password = sc.next();

        // Create SQL Query
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/s.t.e.m", "root", "");
            //stmt = conn.createStatement();
            Statement stmt = co.createStatement();
            String SQL = "SELECT * FROM agent WHERE userName='" + name + "' && password='" + Password+ "'";

            ResultSet rs = stmt.executeQuery(SQL);

            // Check Username and Password
            while (rs.next()) {
                databaseUsername = rs.getString("userName");
                databasePassword = rs.getString("password");
            }

            if (name.equals(databaseUsername) && Password.equals(databasePassword)) {
                System.out.println("Successful Login!\n----");
            } else {
                System.out.println("Incorrect Password\n----");
            }
        }catch (Exception err) {
            System.out.println("Error: " + err);

        }

        if (name.equals(databaseUsername) && Password.equals(databasePassword)) {
            showAgentMenu();

        }
    }
//---------------------------------------------------------------------------------------------------------------------
    private static void logStudent(String username, String password) throws SQLException{

        String databaseUsername = "";
        String databasePassword = "";
        Scanner sc = new Scanner(System.in);
        // Check Username and Password
        System.out.print("Enter Username: ");
        String name = sc.next();
        System.out.print("Enter Password: ");
        String Password = sc.next();

        // Create SQL Query
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/s.t.e.m", "root", "");
            //stmt = conn.createStatement();
            Statement stmt = co.createStatement();
            String SQL = "SELECT * FROM student WHERE userName='" + name + "' && password='" + Password+ "'";

            ResultSet rs = stmt.executeQuery(SQL);

            // Check Username and Password
            while (rs.next()) {
                databaseUsername = rs.getString("userName");
                databasePassword = rs.getString("password");
            }

            if (name.equals(databaseUsername) && Password.equals(databasePassword)) {
                System.out.println("Successful Login!\n----");
            } else {
                System.out.println("Incorrect Password\n----");
            }
            }catch (Exception err) {
            System.out.println("Error: " + err);
        }
        if (name.equals(databaseUsername) && Password.equals(databasePassword)){
            showStudentMenu();
        }
    }
    //---------------------------------------------------------------------------------------------------------------
    private static void logAdmin(String username, String password)throws SQLException {
        boolean login = false;
        String databaseUsername = "";
        String databasePassword = "";
        Scanner sc = new Scanner(System.in);
        // Check Username and Password
        System.out.print("Enter Username: ");
        String name = sc.next();
        System.out.print("Enter Password: ");
        String Password = sc.next();

        // Create SQL Query
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/s.t.e.m", "root", "");
            //stmt = conn.createStatement();
            Statement stmt = co.createStatement();
            String SQL = "SELECT * FROM admin WHERE userName='" + name + "' && password='" + Password+ "'";

            ResultSet rs = stmt.executeQuery(SQL);

            // Check Username and Password
            while (rs.next()) {
                databaseUsername = rs.getString("userName");
                databasePassword = rs.getString("password");
            }

            if (name.equals(databaseUsername) && Password.equals(databasePassword)) {
                System.out.println("Successful Login!\n----");
            } else {
                System.out.println("Incorrect Password\n----");
            }
        }catch (Exception err) {
            System.out.println("Error: " + err);
        }
        if (name.equals(databaseUsername) && Password.equals(databasePassword)){
            showAdminMenu();
        }
    }

//---------------------------------------------------------------------------------------------------------------------
    public static void showAdminMenu()throws SQLException {
        System.out.println("***************Admin***********************");
        System.out.println("1.view customers");
        System.out.println("2.view loans");
        System.out.println("3.approve customer loan");
        Scanner sc = new Scanner(System.in);
        int option;
Model db = new Model();
        System.out.println("enter your choice");
        option = sc.nextInt();

        if (option == 1) {

         db.listStudents();

        } else if (option == 2) {
        db.listLoans();


        } else if (option == 3) {


        } else if (option == 4) {

            // listStudents();
        }

    }
//-------------------------------------------------------------------------------------------------------------------
    public static void showAgentMenu()throws SQLException {
        System.out.println("***************Agent***********************");
        System.out.println("1.create studentAccount");
        System.out.println("2.facilitate loan");
        System.out.println("3.flag customers");
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("enter your choice");
        option = sc.nextInt();
        Model db =new Model();


        if (option == 1) {

            if (option == 1 ){

                System.out.print("enter username");
                String userName = sc.next();
                System.out.print("enter password");
                String   password = sc.next();
                System.out.print("enter email");
                String  emailAddress = sc.next();
                System.out.print("enter firstname");
                String firstName = sc.next();
                System.out.print("enter lastname");
                String lastName = sc.next();
                System.out.print("enter address");
                String physicalAddress = sc.next();
                System.out.print("enter customernumber");
                int customerNumber = sc.nextInt();
                System.out.print("enter date");
                Date dateIssued = Date.valueOf(sc.next());


                db.addStudent(userName, password, emailAddress,  firstName, lastName, physicalAddress,customerNumber,dateIssued);

            }



        } else if (option == 2) {
            System.out.print("customerNumber");
            int customerNumber = sc.nextInt();
            System.out.print("dateIssued");
            Date   dateIssued = Date.valueOf(sc.next());
            System.out.print("Amount");
            Double  balance = sc.nextDouble();
            System.out.print("interest");
            Double intrest = sc.nextDouble();
            db.addLoan(customerNumber,dateIssued,balance,intrest);
        } else if (option == 3) {
            System.out.print("customerNumber");
            int customerNumber = sc.nextInt();
            System.out.print("flag");
            String flagged= sc.next();
            db.updateStudent(flagged);


        } else if (option == 4) {

            // listStudents();
        }
    }
//---------------------------------------------------------------------------------------------------------------------
    public static void showStudentMenu()throws SQLException {

        System.out.println("***************Student***********************");
        System.out.println("1.showBalance");
        System.out.println("2.payment");
        System.out.println("3.viewLoan");
        Model db = new Model();
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("enter your choice");
        option = sc.nextInt();

        if (option == 1) {
        db.listBalance();



        } else if (option == 2) {
            double balance=0;
            System.out.print("customerNumber");
            int customerNumber = sc.nextInt();
            System.out.print("payAmount");
            double  payAmount = sc.nextDouble();
            balance = balance - payAmount;
            System.out.println("u have deposited P "+payAmount+" ur new balance is P "+balance);

db.updateBalance(balance,customerNumber);

        } else if (option == 3) {


        } else if (option == 4) {

            // listStudents();
        }
    }
//-------------------------------------------------------------------------------------------------------------------
    public int addStudent(String userName, String password, String emailAddress, String firstName, String lastName, String physicalAddress,int customerNumber,Date dateIssued) throws SQLException {

            String query = "insert into student(userName,password,emailAddress,firstName,lastName,physicalAddress,customerNumber,dateIssued) values(?,?,?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(query); // create a statement
            pstmt.setString(1, userName);
            pstmt.setString(2, password); // set input parameter 1
            pstmt.setString(3, emailAddress); // set input parameter 2
            pstmt.setString(4, firstName); // set input parameter 3
            pstmt.setString(5, lastName);
            pstmt.setString(6, physicalAddress);
            pstmt.setInt(7, customerNumber);
            pstmt.setDate(8, dateIssued);


            int status = pstmt.executeUpdate(); // execute insert statement
            if (status > 0)
                System.out.println("record inserted");
            else
                System.out.println("Insert failed");
            return status;
        }





    //-----------------------------------------------------------------------------------------------------------------------
    public int updateStudent(String flagged)throws SQLException{

        PreparedStatement pst = conn.prepareStatement("update student set flagged=? where userName =?");

       // pst.setString(1, first);
       // pst.setString(2, last);
       // pst.setString(3, email);
        //pst.setString(1, flagged);


        int upd = pst.executeUpdate();

        if(upd >0)
            System.out.println("Number of updated records: " + upd);
        else
            System.out.println("update failed");
        return upd;

    }

//-------------------------------------------------------------------------------------------------------------------
    public ArrayList<Student> listStudents() throws SQLException {
        stmt = conn.createStatement();

        String sql = "SELECT userName,password,emailAddress,firstName,lastName,physicalAddress FROM student";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Student> list = new ArrayList<>();
        while (rs.next()) {
            //Retrieve by column name
            String userName = rs.getString("userName");
            String password = rs.getString("password");
            String emailAddress = rs.getString("emailAddress");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String physicalAddress = rs.getString("physicalAddress");

            //Display values
            System.out.print("userName: " + userName);
            System.out.print(", password: " + password);
            System.out.print(", Email: " + emailAddress);
            System.out.print(", firstName: " + firstName);
            System.out.print(", lastName: " + lastName);
            System.out.print(", physicalAddress: " + physicalAddress);

            Student st = new Student(userName, password, emailAddress, firstName, lastName, physicalAddress);
            list.add(st);
        }
        rs.close();
        return list;

    }
//--------------------------------------------------------------------------------------------------------------------
    public int addLoan(int customerNumber, Date dateIssued, double balance, double intrest) throws SQLException {

        String theQuery = "insert into loan(customerNumber,dateIssued,balance,intrest) values(?,?,?,?)";

        pstmt = conn.prepareStatement(theQuery);
        pstmt.setInt(1, customerNumber);
        pstmt.setDate(2, dateIssued); // set input parameter 1
        pstmt.setDouble(3, balance); // set input parameter 2
        pstmt.setDouble(4, intrest); // set input parameter 3


        int status = pstmt.executeUpdate(); // execute insert statement

        if (status > 0)
            System.out.println("record inserted");
        else
            System.out.println("Insert failed");
        return status;


    }
//------------------------------------------------------------------------------------------------------------------
    public ArrayList<Loan> listLoans() throws SQLException {
        stmt = conn.createStatement();

        String sql = "SELECT customerNumber,dateIssued,balance,intrest FROM loan";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Loan> list = new ArrayList<>();
        while (rs.next()) {
            //Retrieve by column name
            int customerNumber = rs.getInt("customerNumber");
            Date dateIssued = rs.getDate("dateIssued");
            double balance = rs.getDouble("balance");
            double intrest = rs.getDouble("intrest");


            //Display values
            System.out.print("CustomerNumber: " + customerNumber);
            System.out.print(", dateIssued: " + dateIssued);
            System.out.print(", Balance: " + balance);
            System.out.println(", intrest: " + intrest);

            Loan ln = new Loan(customerNumber, dateIssued, balance, intrest);
            list.add(ln);
        }
        rs.close();
        return list;

    }
    //------------------------------------------------------------------------------------------------------------------------
    public ArrayList<Loan> listBalance() throws SQLException {
        stmt = conn.createStatement();

        String sql = "SELECT balance FROM loan";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Loan> list = new ArrayList<>();
        while (rs.next()) {
            //Retrieve by column name
            int customerNumber = rs.getInt("customerNumber");
            Date dateIssued = rs.getDate("dateIssued");
            double balance = rs.getDouble("balance");
            double intrest = rs.getDouble("intrest");


            //Display values

            System.out.print(", Balance: " + balance);


            Loan ln = new Loan(customerNumber, dateIssued, balance, intrest);
            list.add(ln);
        }
        rs.close();
        return list;

    }


//-----------------------------------------------------------------------------------------------------------------
    public static void main(String args[]) throws SQLException {

        Scanner sc = new Scanner(System.in);
        int option;
       // Model db = new Model();


            Model db = new Model();
            db.showLogInMenu();
            System.out.println("enter your choice");
            option = sc.nextInt();

            if (option == 1) {

                logAdmin( "username",  "password");



            } else if (option == 2) {
              logAgent("userName","password");



            } else if (option == 3) {
                logStudent("userName","password");


            } else if (option == 4) {

                // listStudents();
            }


    }
    //-----------------------------------------------------------------------------------------------------------------------
    public int updateBalance(double balance,int customerNumber)throws SQLException{

        PreparedStatement pst = conn.prepareStatement("update student set balance=? where customerNumber ='"+customerNumber+"'");

        // pst.setString(1, first);
        // pst.setString(2, last);
        // pst.setString(3, email);
        pst.setDouble(1, balance);


        int upd = pst.executeUpdate();

        if(upd >0)
            System.out.println("Number of updated records: " + upd);
        else
            System.out.println("update failed");
        return upd;

    }
}


