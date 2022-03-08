/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.FileDto;
import models.SignatureRequestDto;
import models.SignatureRequestUserDto;
import models.UserDto;
import services.impl.ApiService;
import services.impl.UserServiceImpl;
import utils.ComboItem;

/**
 *
 * @author USUARIO
 */
public class AsignatureRequestForm extends javax.swing.JFrame {

    private List<UserDto> users;
    private List<ComboItem> usersRecipients = new ArrayList<>();
    private File document = null;
    
    private ApiService apiService = new ApiService();
    
    /**
     * Creates new form AsignatureRequestForm
     */
    public AsignatureRequestForm() {
        initComponents();
        try {
            this.users = apiService.getUserService().getUser();
            for (UserDto user : users) {
                comboUsers.addItem(new ComboItem(user.getId(), user.getFull_name()));
            }
        } catch (Exception ex) {
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

        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNameFile = new javax.swing.JTextField();
        btnSearchFile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAddUsers = new javax.swing.JButton();
        comboUsers = new javax.swing.JComboBox<>();
        lblCount = new javax.swing.JLabel();
        btlClearUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textListUsers = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Signature Request");

        jLabel2.setText("Subject");

        jLabel3.setText("Document");

        txtNameFile.setEditable(false);

        btnSearchFile.setText("Search");
        btnSearchFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFileActionPerformed(evt);
            }
        });

        jLabel4.setText("Users");

        btnAddUsers.setText("Add User");
        btnAddUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUsersActionPerformed(evt);
            }
        });

        lblCount.setText("Count: 0");

        btlClearUser.setText("Clear");
        btlClearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlClearUserActionPerformed(evt);
            }
        });

        textListUsers.setEditable(false);
        textListUsers.setColumns(20);
        textListUsers.setRows(5);
        jScrollPane2.setViewportView(textListUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchFile, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(63, 63, 63)))
                        .addGap(87, 87, 87)
                        .addComponent(btnClose)
                        .addGap(71, 71, 71))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSubject, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboUsers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btlClearUser)
                        .addGap(37, 37, 37)
                        .addComponent(lblCount)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUsers)
                    .addComponent(comboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCount)
                    .addComponent(btlClearUser))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.pdf", "pdf"));

        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            this.document = fileChooser.getSelectedFile();
            txtNameFile.setText(fileChooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_btnSearchFileActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsersActionPerformed
        ComboItem item = (ComboItem) comboUsers.getSelectedItem();
        if (!usersRecipients.contains(item)) {
            usersRecipients.add(item);
            updateForm();
        }
    }//GEN-LAST:event_btnAddUsersActionPerformed

    private void btlClearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlClearUserActionPerformed
        usersRecipients.clear();  
        updateForm();
    }//GEN-LAST:event_btlClearUserActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if (this.usersRecipients.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty users", "Form Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (this.document == null) {
            JOptionPane.showMessageDialog(this, "Empty document", "Form Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (this.txtSubject.getText() == null || this.txtSubject.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Subject document", "Form Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            FileDto file = apiService.getFileService().saveFile(this.document.getName(), this.document);
            
            SignatureRequestDto signature = new SignatureRequestDto();
            signature.setDocument(file.getId());
            signature.setSubject(txtSubject.getText());
            signature.setUser(2);
            
            signature = apiService.getSignatureRequestService().saveRequest(signature);
            SignatureRequestUserDto signatureUser; 
            for (ComboItem usersRecipient : usersRecipients) {
                signatureUser = new SignatureRequestUserDto();
                signatureUser.setRequest(signature.getId());
                signatureUser.setUser(usersRecipient.getKey());
                
                apiService.getSignatureRequestUser().saveRequest(signatureUser);
            }
            JOptionPane.showMessageDialog(this, "Subject document", "Form Send", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Form Error", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    
    void updateForm() {
        String textUsers = "";
        textUsers = usersRecipients.stream().map((usersRecipient) -> usersRecipient.toString() + "\n").reduce(textUsers, String::concat);
        this.textListUsers.setText(textUsers);
        this.lblCount.setText("Count: "+ usersRecipients.size());
    }
    
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
            java.util.logging.Logger.getLogger(AsignatureRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignatureRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignatureRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignatureRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignatureRequestForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlClearUser;
    private javax.swing.JButton btnAddUsers;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchFile;
    private javax.swing.JComboBox<ComboItem> comboUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCount;
    private javax.swing.JTextArea textListUsers;
    private javax.swing.JTextField txtNameFile;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
