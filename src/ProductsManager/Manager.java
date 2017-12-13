/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductsManager;

import java.sql.Date;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author Ayman A Ayyad
 */
public class Manager extends Parson  {

    private String UserName;
    private String password;

    public Manager(Bielder aBielder) {
        this.UserName = aBielder.UserName;
        this.password = aBielder.password;
        this.DOB = aBielder.DOB;
        this.Name = aBielder.Name;
        this.Email = aBielder.Email;
        this.id = aBielder.id;
        this.PhoneNumber = aBielder.PhoneNumber;
        
        
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class Bielder {

        private String Name;
        private String PhoneNumber;
        private int id;
        private String DOB;
        private String Email;
        private String UserName;
        private String password;
       // private Manager aManager ;

        public Bielder() {
          
        }
        

        public Bielder setName(String Name) {
            this.Name = Name;
            return this ;
        }

        public Bielder setPhoneNumber(String PhoneNumber) {
            this.PhoneNumber = PhoneNumber;
            return this ;
        }

        public Bielder setId(int id) {
            this.id = id;
            return this ;
        }

        public Bielder setDOB(String DOB) {
            this.DOB = DOB;
            return this ;
        }

        public Bielder setEmail(String Email) {
            this.Email = Email;
            return this ;
        }

        public Bielder setUserName(String UserName) {
            this.UserName = UserName;
            return this ;
        }

        public Bielder setPassword(String password) {
            this.password = password;
            return this ;
        }
        public Manager Bield(){
            return new Manager(this) ;
        }
        
        
        
        
        

    }
}
