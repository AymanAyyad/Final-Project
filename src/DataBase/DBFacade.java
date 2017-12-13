/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author Ayman A Ayyad
 */
public class DBFacade {
    private static DBFacade Instance ;
    private static MangersDBOpration aMangersDBOpration;
    private static ProductsDBOperation aProductsDBOperation ;
    
    

    public  DBFacade() throws Exception {
        Instance = new DBFacade();
        aMangersDBOpration = MangersDBOpration.getIstance();
        aProductsDBOperation = ProductsDBOperation.getIstance();
    }
    
    public static DBFacade getInstance() throws Exception{
        if(Instance == null)
            Instance = new DBFacade();
        return Instance;
    }
    public static MangersDBOpration getMangersDBOpration() throws Exception{
         aMangersDBOpration = MangersDBOpration.getIstance();
        return aMangersDBOpration;
    }
    public static ProductsDBOperation getProductsDBOperation() throws Exception{
        aProductsDBOperation = ProductsDBOperation.getIstance();
        return aProductsDBOperation;
    }
    
    
    
    
    
}
