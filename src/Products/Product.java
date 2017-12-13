/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

import java.sql.Date;

/**
 *
 * @author Ayman A Ayyad
 */
public abstract class Product {
    private int id ;
    private String Name;
    private int quantity;
    private int priceOfcarton;
    private String Expdate;
    private String Prodate;
    private String flavor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceOfcarton() {
        return priceOfcarton;
    }

    public void setPriceOfcarton(int priceOfcarton) {
        this.priceOfcarton = priceOfcarton;
    }

    public String getExpdate() {
        return Expdate;
    }

    public void setExpdate(String Expdate) {
        this.Expdate = Expdate;
    }

    public String getProdate() {
        return Prodate;
    }

    public void setProdate(String Prodate) {
        this.Prodate = Prodate;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    
    
    
}
