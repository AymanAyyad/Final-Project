/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

/**
 *
 * @author Ayman A Ayyad
 */
public class Drink extends Product{
    private String madeFrom ;
    private boolean Diet ;

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public boolean isDiet() {
        return Diet;
    }

    public void setDiet(boolean Diet) {
        this.Diet = Diet;
    }

    public Object getDeit() {
       return Diet;
    }
    
    
    
}
