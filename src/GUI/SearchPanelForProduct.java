/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Products.Cake;
import Products.Drink;
import Products.Product;
import ProductsManager.Manager;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ayman A Ayyad
 */
public class SearchPanelForProduct extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanelForProduct
     */
    int id;
    DefaultTableModel model;

    public void fillTable(HashMap<String, String> Data) throws Exception {
        JTable aJTable = this.jTable1;

        model = new DefaultTableModel( new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "price of carton", "Prodate", "Expdate", "Flavor", "Type", "Made From", "Whight", "Diet"
            });
        aJTable.setModel(model);
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
        }

//         jTable1.addRowSelectionInterval(WIDTH, WIDTH);
        List<Products.Product> aProduct = DataBase.ProductsDBOperation.getIstance().getProduct(Data);

        for (Product product : aProduct) {
            if (product instanceof Drink) {
                Drink aDrink = (Drink) product;
                Object[] row = {aDrink.getId(), aDrink.getName(), aDrink.getQuantity(), aDrink.getPriceOfcarton(),
                     aDrink.getProdate(), aDrink.getExpdate(), aDrink.getFlavor(), "Drink", aDrink.getMadeFrom(), "", aDrink.isDiet() + ""};
                model.addRow(row);
            } else {
                Cake aCake = (Cake) product;
                Object[] row = {aCake.getId(), aCake.getName(), aCake.getQuantity(), aCake.getPriceOfcarton(),
                     aCake.getProdate(), aCake.getExpdate(), aCake.getFlavor(), "Cake", "", aCake.getWhight(), ""};
                model.addRow(row);
            }

        }

    }

    public SearchPanelForProduct() throws Exception {
        initComponents();
        fillTable(null);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Search By ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ExpDate", "ProDate", "Type" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Value");

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "price of carton", "Prodate", "Expdate", "Flavor", "Type", "Made From", "Whight", "Diet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        HashMap<String, String> Data = new HashMap<>();
        Data.put((String) jComboBox1.getSelectedItem(), jTextField1.getText());
        try {
            Product aProduct ;
           List< Product > aProducts = DataBase.DBFacade.getProductsDBOperation().getProduct(Data);
            if( aProducts.size() != 0)
            aProduct =  aProducts.get(0);
            fillTable(Data);
        } catch (Exception ex) {
            Logger.getLogger(SearchPanelForProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

        } catch (Exception ex) {
            Logger.getLogger(SearchPanelForProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
