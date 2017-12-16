/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Products.Cake;
import Products.Drink;
import ProductsManager.Manager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Ayman A Ayyad
 */
public class MangersDBOpration {

    private DbConnection aDbConnection;
    private static MangersDBOpration instance = null;
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private MangersDBOpration() throws Exception {

        this.aDbConnection = DbConnection.getInstance();
        this.connect = aDbConnection.getConnect();
        this.statement = aDbConnection.getStatement();

    }

    public static MangersDBOpration getIstance() throws Exception {
        if (MangersDBOpration.instance == null) {
            MangersDBOpration.instance = new MangersDBOpration();
        }
        return MangersDBOpration.instance;
    }

    public List<Manager> getManager(HashMap<String, String> Data) throws SQLException {
        System.out.println("getManager :" + (connect != null));
        List<Manager> aManagers = new ArrayList<>();
        if (connect != null) {
            String quiry = "SELECT * FROM `productsmanger`";
            boolean a = false;

            if (Data != null) {
                if (!Data.isEmpty()) {
                    quiry += " where ";
                }
                if (Data.get("ID") != (null)) {
                    quiry += "mid = '" + Data.get("ID") + "'";
                    a = true;
                }
                if (Data.get("Name") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }
                    quiry += " mname = '" + Data.get("Name") + "'";
                }
                if (Data.get("PhoneNumber") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }

                    quiry += " mphone_number = '" + Data.get("PhoneNumber") + "'";
                }
                if (Data.get("Email") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }
                    quiry += " memail = '" + Data.get("Email") + "'";
                }
            }
            quiry += ";";

            System.out.println(quiry);
            preparedStatement = connect.prepareStatement(quiry);
            resultSet = preparedStatement.executeQuery(quiry);

            while (resultSet.next()) {
                System.out.println("while (resultSet.next())");

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
                System.out.println("add manger");
            }
        }
        return aManagers;

    }

    public void insertManager(Manager aManager) throws SQLException {

        if (connect != null) {
            if (aManager != null) {
                preparedStatement = connect.prepareStatement(
                        "INSERT INTO `productsmanger`("
                        + " `mname`,"
                        + " `mdate_of_barth`,"
                        + " `mphone_number`, "
                        + "`memail`, "
                        + "`muser_name`,"
                        + " `mpassword`)"
                        + " VALUES "
                        + "(?,?,?,?,?,?);");
                preparedStatement.setString(1, aManager.getName());
                preparedStatement.setString(2, aManager.getDOB());
                preparedStatement.setString(3, aManager.getPhoneNumber());
                preparedStatement.setString(4, aManager.getEmail());
                preparedStatement.setString(5, aManager.getUserName());
                preparedStatement.setString(6, aManager.getPassword());

                preparedStatement.executeUpdate();
                

            }
        }
    }

    public void updateManager(Manager aManager) throws SQLException {
        /*
        UPDATE `productsmanger` SET `mid`=[value-1],
        `mname`=[value-2],`mdate_of_barth`=[value-3],
        `mphone_number`=[value-4],`memail`=[value-5],`muser_name`=[value-6],`mpassword`=[value-7] WHERE 1
         */
        if (connect != null) {
            if (aManager != null) {
                preparedStatement = connect.prepareStatement(
                        "UPDATE `productsmanger` SET "
                        + "        `mname`=?,`mdate_of_barth`=?,"
                        + "        `mphone_number`=?,`memail`=?,`muser_name`=?,`mpassword`=? WHERE `mid`= " + aManager.getId());
                preparedStatement.setString(1, aManager.getName());
                preparedStatement.setString(2, aManager.getDOB());
                preparedStatement.setString(3, aManager.getPhoneNumber());
                preparedStatement.setString(4, aManager.getEmail());
                preparedStatement.setString(5, aManager.getUserName());
                preparedStatement.setString(6, aManager.getPassword());

                preparedStatement.executeUpdate();

            }
        }
    }

    public void DeleteManager(int id) throws SQLException {
        preparedStatement = connect.prepareStatement("DELETE FROM `productsmanger` WHERE mid = '" + id + "';");
        preparedStatement.executeUpdate();
    }

    public boolean Login(String UserName, String Password) throws SQLException {
        
        List<Manager> aManagers;
        aManagers = this.getManager(null);
        boolean userIsFound = false;
//        System.out.println(aManagers.get(0).getName());
        for (Manager aManager : aManagers) {
            if (aManager.getUserName().equals(UserName)  && aManager.getPassword() .equals(Password) ) {
                userIsFound = true;
            }
            break;
        }

        return userIsFound;

    }
}
