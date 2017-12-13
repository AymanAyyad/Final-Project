/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Products.Cake;
import Products.Drink;
import Products.Product;
import Products.ProductFactory;
import ProductsManager.Manager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Ayman A Ayyad
 */
public class ProductsDBOperation {

    private DbConnection aDbConnection;
    private static ProductsDBOperation instance;
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private ProductsDBOperation() throws Exception {

        this.aDbConnection = DbConnection.getInstance();
        this.connect = aDbConnection.getConnect();
        this.statement = aDbConnection.getStatement();

    }

    public static ProductsDBOperation getIstance() throws Exception {
        if (instance == null) {
            instance = new ProductsDBOperation();
        }
        return instance;
    }

    public List<Products.Product> getProduct(HashMap<String, String> Data) throws SQLException {
        String quiry = "SELECT * FROM `products`";
        List<Products.Product> aproducts = new ArrayList<>();
        boolean a = false;
        System.out.println(quiry);
        if (connect != null) {
            if (Data != null) {
                if (!Data.isEmpty()) {
                    quiry += " where ";
                }
                if (Data.get("ExpDate") != (null)) {
                    quiry += "pexp_date = '" + Data.get("ExpDate") + "'";
                    a = true;
                }
                if (Data.get("ID") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }
                    quiry += " pid = '" + Data.get("ID") + "'";
                }
                if (Data.get("ProDate") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }
                    quiry += " ppro_date = '" + Data.get("ProDate") + "'";
                }
                if (Data.get("Name") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }

                    quiry += " pname = '" + Data.get("Name") + "'";
                }
                if (Data.get("Type") != (null)) {
                    if (a) {
                        quiry += " and ";
                    } else {
                        a = true;
                    }
                    quiry += " ptype = '" + Data.get("Type") + "'";
                }

               
            }
             quiry += ";";
            System.out.println(quiry);
            preparedStatement = connect.prepareStatement(quiry);
            resultSet = preparedStatement.executeQuery(quiry);
            while (resultSet.next()) {

                int pid = resultSet.getInt("pid");
                String pname = resultSet.getString("pname");

                int pquantity = resultSet.getInt("pquantity");
                int pprice_of_carton = resultSet.getInt("pprice_of_carton");
                String pexp_date = resultSet.getString("pexp_date");
                String ppro_date = resultSet.getString("ppro_date");

                String pfavor = resultSet.getString("pfavor");
                String ptype = resultSet.getString("ptype");
                String pmade_from = "";
                boolean Diet = false;
                if (ptype.equals("Drink")) {
                    pmade_from = resultSet.getString("pmade_from");
                    Diet = resultSet.getBoolean("Diet");
                }
                float pwhight_of_carton = 0;
                if (ptype.equals("Cake")) {
                    pwhight_of_carton = resultSet.getFloat("pmade_from");
                }

                if (ptype.equals("Drink")) {
                    Drink aDrink = (Drink) ProductFactory.getProduct(ptype);

                    aDrink.setId(pid);
                    aDrink.setName(pname);
                    aDrink.setQuantity(pquantity);
                    aDrink.setPriceOfcarton(pprice_of_carton);
                    aDrink.setExpdate(pexp_date);
                    aDrink.setProdate(ppro_date);
                    aDrink.setFlavor(pfavor);
                    aDrink.setDiet(Diet);
                    aDrink.setMadeFrom(pmade_from);
                    aproducts.add(aDrink);

                } else {
                    Cake aCake = (Cake) ProductFactory.getProduct(ptype);
                    aCake.setId(pid);
                    aCake.setName(pname);
                    aCake.setQuantity(pquantity);
                    aCake.setPriceOfcarton(pprice_of_carton);
                    aCake.setExpdate(pexp_date);
                    aCake.setProdate(ppro_date);
                    aCake.setFlavor(pfavor);
                    aCake.setWhight(pwhight_of_carton);
                    aproducts.add(aCake);
                }

            }
        }
        return aproducts;
    }

    public void insertProduct(Drink aDrink, Cake aCake, String type) throws SQLException {
        /*
          
          INSERT INTO `products`(`pid`, `pname`, `pquantity`, `pprice_of_carton`, `pexp_date`, `ppro_date`,
          `pfavor`, `ptype`, `pmade_from`, `Diet`, `pwhight_of_carton`) 
          VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10],[value-11])
          
         */

        if (connect != null) {
            if (aDrink != null) {
                preparedStatement = connect.prepareStatement(
                        "insert into products("
                        + "pname,"
                        + "pquantity,"
                        + "pprice_of_carton,"
                        + "pexp_date,"
                        + "ppro_date,"
                        + "pfavor,"
                        + "ptype,"
                        + "pmade_from,"
                        + "Diet)"
                        + " values ( ?,  ?, ? , ?, ?, ? ,? , ?, ?)");
                preparedStatement.setString(1, aDrink.getName());
                preparedStatement.setInt(2, aDrink.getQuantity());
                preparedStatement.setInt(3, aDrink.getPriceOfcarton());
                preparedStatement.setString(4, aDrink.getExpdate());
                preparedStatement.setString(5, aDrink.getProdate());
                preparedStatement.setString(6, aDrink.getFlavor());
                preparedStatement.setString(7, "Drink");
                preparedStatement.setString(8, aDrink.getMadeFrom());
                preparedStatement.setBoolean(9, aDrink.isDiet());

                preparedStatement.executeUpdate();
            } else if (aCake != null) {
                preparedStatement = connect.prepareStatement(
                        "insert into products("
                        + "pname,"
                        + "pquantity,"
                        + "pprice_of_carton,"
                        + "pexp_date,"
                        + "ppro_date,"
                        + "pfavor,"
                        + "ptype,"
                        + "pwhight_of_carton)"
                        + " values ( ?,  ?, ? , ?, ?, ? ,? , ?)");
                preparedStatement.setString(1, aCake.getName());
                preparedStatement.setInt(2, aCake.getQuantity());
                preparedStatement.setInt(3, aCake.getPriceOfcarton());
                preparedStatement.setString(4, aCake.getExpdate());
                preparedStatement.setString(5, aCake.getProdate());
                preparedStatement.setString(6, aCake.getFlavor());
                preparedStatement.setString(7, "Cake");
                preparedStatement.setFloat(8, aCake.getWhight());
                preparedStatement.setBoolean(9, aDrink.isDiet());

                preparedStatement.executeUpdate();
            }

        }

    }

    public void updateProduct(Drink aDrink, Cake aCake, String type) throws SQLException {
        /*
        UPDATE `products` SET `pid`=[value-1],`pname`=[value-2],`pquantity`=[value-3],
        `pprice_of_carton`=[value-4],`pexp_date`=[value-5],`ppro_date`=[value-6],
        `pfavor`=[value-7],`ptype`=[value-8],`pmade_from`=[value-9]
        ,`Diet`=[value-10],`pwhight_of_carton`=[value-11] WHERE 1
        
        
        
        
       PreparedStatement updateEXP = connect.prepareStatement("update`user` set `exp` = '666'  where `username` = ");
   ResultSet updateEXP_done = updateEXP.executeQuery();
         */
        if (connect != null) {
            if (aDrink != null) {
                preparedStatement = connect.prepareStatement(
                        "UPDATE `products` SET "
                        + "`pname`= ?,"
                        + "`pquantity`=?,"
                        + "`pprice_of_carton`= ?,"
                        + "`pexp_date`= ?,"
                        + "`ppro_date`=?,"
                        + "`pfavor`=?,"
                        + "`ptype`=?"
                        + ",`pmade_from`=?"
                        + ",`Diet`=?"
                        + " WHERE pid = ? ;");
                preparedStatement.setString(1, aDrink.getName());
                preparedStatement.setInt(2, aDrink.getQuantity());
                preparedStatement.setInt(3, aDrink.getPriceOfcarton());
                preparedStatement.setString(4, aDrink.getExpdate());
                preparedStatement.setString(5, aDrink.getProdate());
                preparedStatement.setString(6, aDrink.getFlavor());
                preparedStatement.setString(7, "Drink");
                preparedStatement.setString(8, aDrink.getMadeFrom());
                preparedStatement.setBoolean(9, aDrink.isDiet());
                preparedStatement.setInt(10,  aDrink.getId());
                System.out.println(preparedStatement.toString());
                preparedStatement.executeUpdate();
            } else if (aCake != null) {
                preparedStatement = connect.prepareStatement(
                        "UPDATE `products` SET "
                        + "`pname`= ?,"
                        + "`pquantity`=?,"
                        + "`pprice_of_carton`= ?,"
                        + "`pexp_date`= ?,"
                        + "`ppro_date`=?,"
                        + "`pfavor`=?,"
                        + "`ptype`=?"
                        + ",`pwhight_of_carton`= ? "
                        + " WHERE pid = ? ;" );
                preparedStatement.setString(1, aCake.getName());
                preparedStatement.setInt(2, aCake.getQuantity());
                preparedStatement.setInt(3, aCake.getPriceOfcarton());
                preparedStatement.setString(4, aCake.getExpdate());
                preparedStatement.setString(5, aCake.getProdate());
                preparedStatement.setString(6, aCake.getFlavor());
                preparedStatement.setString(7, "Cake");
                preparedStatement.setFloat(8, aCake.getWhight());
                preparedStatement.setInt(9, aCake.getId());

                preparedStatement.executeUpdate();
            }

        }

    }

    public void DeleteProduct(int id) throws SQLException {
        //DELETE FROM `products` WHERE id = 

        preparedStatement = connect.prepareStatement("DELETE FROM `products` WHERE pid = " + id + ";");
        preparedStatement.executeUpdate();
    }

}
