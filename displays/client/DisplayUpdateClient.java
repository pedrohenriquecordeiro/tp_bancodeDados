/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displays.client;

import displays.client.DisplayInsertClient;
import DAO.ClientDAO;
import DAO.TattooArtistDAO;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.TattooArtist;

/**
 *
 * @author pedro
 */
public class DisplayUpdateClient extends javax.swing.JFrame {

    Client client = null;
    public DisplayUpdateClient(Client client) {
        initComponents();
        fillJComboBox();
        this.client = client;
        jTextFieldUpdateName.setText(this.client.getName());
        jTextFieldUpdateTel.setText(this.client.getTel());
        jTextFieldUpdateAge.setText(Integer.toString(this.client.getAge()));
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatador.parse(this.client.getNext_session());
            jDateChooserNextSession.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(DisplayUpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextFieldLocalPicture.setText(this.client.getLocal_picture());
        
        
        for( int i = 0 ; i <= jComboBoxTattooArtists.getComponentCount(); i++){
            TattooArtist artist = jComboBoxTattooArtists.getItemAt(i);
            if(artist.getId() == client.getTattoo_artist()){
                jComboBoxTattooArtists.setSelectedIndex(i);
                break;
            }
        }
        
        
    }
    
    public DisplayUpdateClient() {
        initComponents();
    }
    
    public void fillJComboBox(){
        ArrayList<TattooArtist> artist;
        try {
            artist = TattooArtistDAO.consultAll();
            jComboBoxTattooArtists.setModel(new DefaultComboBoxModel(artist.toArray()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayUpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DisplayUpdateClient.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextFieldUpdateTel = new javax.swing.JTextField();
        jTextFieldUpdateAge = new javax.swing.JTextField();
        jTextFieldLocalPicture = new javax.swing.JTextField();
        jDateChooserNextSession = new com.toedter.calendar.JDateChooser();
        jButtonLocalImage = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTattooArtists = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUpdateName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonLocalImage.setText("...");
        jButtonLocalImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalImageActionPerformed(evt);
            }
        });

        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButtonUpdate.setToolTipText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel6.setText("*Tattoo Artist");

        jLabel1.setText("*Name:");

        jComboBoxTattooArtists.setModel(new javax.swing.DefaultComboBoxModel<>(new TattooArtist[] {}));

        jLabel2.setText("Tel:");

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButtonCancel.setToolTipText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("* Required fields.");

        jLabel4.setText("*Session Date");

        jLabel5.setText("Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jButtonUpdate)
                            .addComponent(jLabel6))
                        .addGap(51, 51, 51)
                        .addComponent(jButtonLocalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButtonCancel))
                            .addComponent(jTextFieldUpdateAge, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserNextSession, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLocalPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUpdateTel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTattooArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel7)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldUpdateTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldUpdateAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserNextSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jButtonLocalImage))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLocalPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTattooArtists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(102, 102, 102))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLocalImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalImageActionPerformed
        try {
            JFileChooser busca_arquivo = new JFileChooser();
            busca_arquivo.setCurrentDirectory(new File("/"));
            busca_arquivo.setDialogTitle("File location");
            busca_arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
            busca_arquivo.showOpenDialog(null);
            String arquivo = "" + busca_arquivo.getSelectedFile().getAbsolutePath();
            jTextFieldLocalPicture.setText(arquivo.replace("\\", "/"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "File Location Selection Error " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonLocalImageActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
 
        String nm = jTextFieldUpdateName.getText();
        String tel = jTextFieldUpdateTel.getText();
        Integer age = Integer.parseInt(jTextFieldUpdateAge.getText());
        String local_picture = jTextFieldLocalPicture.getText();
        //String tattoo_artist = jComboBoxTattooArtists.
        TattooArtist artist = (TattooArtist) jComboBoxTattooArtists.getSelectedItem();
        int id_artist = artist.getId();

        java.util.Date data = jDateChooserNextSession.getDate();
        String next_session = null;
        if (data != null) {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            next_session = formatador.format(data);
        } else {
            next_session = "Sem data";
        }

        if (!nm.equals("") && !next_session.equals("")) {
            Client client = new Client(this.client.getIduser(),nm, tel, age, next_session, local_picture, id_artist);
            try {
                if (ClientDAO.update(client)) {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Sucess", "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Error on update", "", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DisplayInsertClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DisplayInsertClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayUpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayUpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayUpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayUpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayUpdateClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLocalImage;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<TattooArtist> jComboBoxTattooArtists;
    private com.toedter.calendar.JDateChooser jDateChooserNextSession;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldLocalPicture;
    private javax.swing.JTextField jTextFieldUpdateAge;
    private javax.swing.JTextField jTextFieldUpdateName;
    private javax.swing.JTextField jTextFieldUpdateTel;
    // End of variables declaration//GEN-END:variables
}
