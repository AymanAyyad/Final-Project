/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoymanagmentsys;

import DataBase.MangersDBOpration;
import GUI.LoginScreen;
import GUI.MainScreen;
import java.util.HashMap;

/**
 *
 * @author Ayman A Ayyad
 */
public class FactoyManagmentSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LoginScreen().setVisible(true);
        try{
            HashMap<String,String> aa = new HashMap<String,String>();
            aa.put("ID", "aaaaaaaaaaaaa") ;
            aa.put("Name", "Name");
       MangersDBOpration.getIstance().getManager(aa);
        }catch(Exception e){
            
        }
        
    }
    
}
