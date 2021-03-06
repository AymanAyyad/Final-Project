/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Products.Cake;
import Products.Drink;
import Products.Product;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayman A Ayyad
 */
public class UpdataProduct extends javax.swing.JPanel {

    /**
     * Creates new form UpdataProduct
     */
    int id ;
    boolean  isSelected = false ;
    public UpdataProduct() throws Exception {
        initComponents();
        fillTable();
    }
    String type ;
    DefaultTableModel model ;
     public void fillTable() throws Exception{
        JTable aJTable = this.jTable1;
        
         model = (DefaultTableModel)aJTable.getModel();
         
         for (int i = 0; i < model.getRowCount()-1; i++) {
            model.removeRow(i);
        }
         
         model = new DefaultTableModel(new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type"
            });
         aJTable.setModel(model);
         List <Products.Product> aProduct =  DataBase.DBFacade.getProductsDBOperation().getProduct(null);
         for(Product product :aProduct){
         Object[] row = { product.getId(),  product.getName(),(product.equals("Drink"))? "Drink" : "Cake" };
          model.addRow(row);
         }
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Product Name");

        jLabel2.setText("ExpDate");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("ProDate");

        jLabel5.setText("Quantity");

        jLabel4.setText("Price OF Carton");

        jLabel6.setText("Flavor");

        jButton1.setText("Update Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Made From");

        jLabel8.setText("Whight");

        jLabel9.setText("Diet");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, 131, Short.MAX_VALUE)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(isSelected){
         Drink aDrink = null;
         Cake aCake = null;
        if(type .equalsIgnoreCase("Drink")){
            
         aDrink = (Drink)Products.ProductFactory.getProduct(type);
        aDrink.setId(id);
          aDrink.setName(jTextField1.getText());  
         aDrink.setExpdate(jTextField2.getText()); 
         aDrink.setProdate(jTextField3.getText()); 
          aDrink.setQuantity(Integer.parseInt(jTextField4.getText())); 
         aDrink.setPriceOfcarton(Integer.parseInt(jTextField5.getText()));  
          aDrink.setFlavor(jTextField6.getText()); 
          aDrink.setMadeFrom(jTextField7.getText());
          aDrink.setDiet((jComboBox2.getSelectedItem().equals("NO"))? false : true); 
                 type = "Drink";
           jTextField8.setEnabled(true);
           jComboBox2.setEnabled(true);
        
        }else {
            aCake = (Cake)Products.ProductFactory.getProduct(type);
            aCake.setId(id);
          aCake.setName(jTextField1.getText());  
         aCake.setExpdate(jTextField2.getText()); 
         aCake.setProdate(jTextField3.getText()); 
          aCake.setQuantity(Integer.parseInt(jTextField4.getText())); 
         aCake.setPriceOfcarton(Integer.parseInt(jTextField5.getText()));  
          aCake.setFlavor(jTextField6.getText()); 
          aCake.setWhight(Float.parseFloat(jTextField8.getText()) );
          
                 type = "Cake";
           jTextField8.setEnabled(true);
           jComboBox2.setEnabled(true);
            
        }
        
        try {
            DataBase.ProductsDBOperation.getIstance().updateProduct(aDrink, aCake, type);
            JOptionPane.showMessageDialog(this, "Done !");
            jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jTextField7.setText("");
           jTextField8.setText("");
        } catch (Exception ex) {
            Logger.getLogger(UpdataProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "no Selected product ot update it");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row =  jTable1.getSelectedRow();
        if(row >= 0){
            isSelected = true ;
            System.out.println("row >= 0");
        id =  (int) model.getValueAt(row, 0);
        HashMap <String ,String> Data = new HashMap<>() ;
        Data.put("ID", id+"");
        
        try {
            System.out.println( (DataBase.ProductsDBOperation.getIstance().getProduct(Data).get(0) instanceof Drink )? "Drink" :"Cake" );
            if(DataBase.ProductsDBOperation.getIstance().getProduct(Data).get(0) instanceof Drink ){
         Drink aProduct =   (Drink) DataBase.ProductsDBOperation.getIstance().getProduct(Data).get(0);
           jTextField1.setText(aProduct.getName());
           jTextField2.setText(aProduct.getExpdate());
           jTextField3.setText(aProduct.getProdate());
           jTextField4.setText(aProduct.getQuantity()+"");
           jTextField5.setText(aProduct.getPriceOfcarton()+"");
           jTextField6.setText(aProduct.getFlavor());
           jTextField7.setText(aProduct.getMadeFrom());
           jComboBox2.setSelectedItem((aProduct.isDiet())? "Yes" :"No");
                 type = "Drink";
           jTextField8.setEnabled(false);
           jComboBox2.setEnabled(true);
            } else {
                Cake aProduct =   (Cake) DataBase.ProductsDBOperation.getIstance().getProduct(Data).get(0);
           jTextField1.setText(aProduct.getName());
           jTextField2.setText(aProduct.getExpdate());
           jTextField3.setText(aProduct.getProdate());
           jTextField4.setText(aProduct.getQuantity()+"");
           jTextField5.setText(aProduct.getPriceOfcarton()+"");
           jTextField6.setText(aProduct.getFlavor());
           jTextField8.setText(aProduct.getWhight()+"");
           type = "Cake";
           jComboBox2.setEnabled(false);
           jTextField8.setEnabled(true);
           
                
                
                
            }
           
           
        } catch (Exception ex) {
            Logger.getLogger(UpdataProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        }
        else {
            JOptionPane.showMessageDialog(this, "Select the product");
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
