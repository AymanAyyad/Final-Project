/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import ProductsManager.Manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Ayman A Ayyad
 */
public class DbConnection {
    
    
    private static DbConnection Instance =null;
    
    
    private String aNameOfDataBase = "factorymanagementsys";
     private String aPasswordOfDataBase = "";
      private String aServerNameOfDataBase = "root";
    private static DbConnection aDbConnection = null;
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public Connection getConnect() {
        return connect;
    }

    public Statement getStatement() {
        return statement;
    }
    
    
    
    private DbConnection() throws Exception {
        try {
            /*
             String url = "jdbc:mysql://localhost:3306/university";
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/university?"
                            + "user=root&password=");
            */
            System.out.println("1");
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/factorymanagementsys";
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/factorymanagementsys?"
                            + "user="+aServerNameOfDataBase+"&password="+aPasswordOfDataBase);
            System.out.println("2");
            this.statement = (Statement) this.connect.createStatement();
            System.out.println("3");
        } catch (SQLException e) {
            System.out.println("Exception in constructor");
        }

    }

    public static DbConnection getInstance() throws Exception {
        if (Instance == null)
            Instance = new DbConnection();      
        return Instance;
    }
    /*
    
   
    public List<Manager> getManager() throws SQLException{
        preparedStatement = connect.prepareStatement("SELECT * FROM `productsmanger`");
        List<Manager> aManagers = new ArrayList<>();
        
         while (resultSet.next()) {

            int mid = resultSet.getInt("mid");
            String mname = resultSet.getString("mname");
            String mdate_of_barth = resultSet.getString("mdate_of_barth");
            String mphone_number = resultSet.getString("mphone_number");
            String memail = resultSet.getString("memail");
            String muser_name = resultSet.getString("muser_name");
            String mpassword = resultSet.getString("mpassword");

            Manager aManager;
            aManager = new Manager.Bielder()
                    .setId(mid)
                    .setEmail(memail)
                    .setDOB(mdate_of_barth)
                    .setName(mname)
                    .setPassword(mpassword)
                    .setPhoneNumber(mphone_number)
                    .setUserName(muser_name)
                    .Bield();
            aManagers.add(aManager);

        }
       
        
        
        return aManagers;
        
    }
     */
    /*
    preparedStatement = connect.prepareStatement("SELECT * FROM `students`");
        resultSet = preparedStatement.executeQuery();
        List<Students> students = new ArrayList<>();
        while (resultSet.next()) {

            int Student_id = resultSet.getInt("Student_id");
            String Student_First_Name = resultSet.getString("Student_First_Name");
            String Student_Last_Name = resultSet.getString("Student_Last_Name");
            String Student_Email = resultSet.getString("Student_Email");
            String Student_City = resultSet.getString("Student_City");
            String Student_Contry = resultSet.getString("Student_Contry");

            Students aStudents;
            aStudents = new Students.Bielder()
                    .setStudent_id(Student_id)
                    .setStudent_City(Student_City)
                    .setStudent_Contry(Student_Contry)
                    .setStudent_Email(Student_Email)
                    .setStudent_First_Name(Student_First_Name)
                    .setStudent_Last_Name(Student_Last_Name)
                    .Bieled();
            students.add(aStudents);

        }
        return students;
    */
    
}
