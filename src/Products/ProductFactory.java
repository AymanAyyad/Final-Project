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
public class ProductFactory {
  
    
    public static  Product getProduct(String type){
        
      	
      if(type.equalsIgnoreCase("Drink")){
         return new Drink();
         
      } else if(type.equalsIgnoreCase("Cake")){
         return new Cake();
         
      } 
        return null;
        
        
       
        
    }
    
    
}
