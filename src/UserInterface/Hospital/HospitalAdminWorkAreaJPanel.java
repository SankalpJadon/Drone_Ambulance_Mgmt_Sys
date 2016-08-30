/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.QuickAssist;
import UserInterface.SystemAdmin.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author sanka_001
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    QuickAssist system;
    Enterprise enterprise;
    HospitalOrganization hospitalOrganization;
    Network network;
    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, QuickAssist system, Enterprise enterprise, Organization organization,Network network) {
        initComponents();
        this.setBackground(Color.white);
        this.userProcessContainer=userProcessContainer;
        this.system= system;
        this.enterprise=enterprise;
        this.network=network;
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateOrg = new javax.swing.JButton();
        btnSeeRequests = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        btnCreateOrg.setText("Create new Organization");
        btnCreateOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrgActionPerformed(evt);
            }
        });

        btnSeeRequests.setText("See requests");
        btnSeeRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeRequestsActionPerformed(evt);
            }
        });

        jButton1.setText("Add Hospitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 784, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnCreateOrg)
                .addGap(18, 18, 18)
                .addComponent(btnSeeRequests)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(422, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrgActionPerformed
        AddOrganizationJPanel aojp = new AddOrganizationJPanel(userProcessContainer,system,enterprise,network);
        userProcessContainer.add("AddOrganization", aojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateOrgActionPerformed

    private void btnSeeRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeRequestsActionPerformed
        HospitalAdminJPanel hajp = new HospitalAdminJPanel(userProcessContainer,system,enterprise,network);
        userProcessContainer.add("manageNetworkJPanel", hajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeRequestsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AddHospitals ahjp = new AddHospitals(userProcessContainer,system,enterprise,network);
        userProcessContainer.add("AddHospitals", ahjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateOrg;
    private javax.swing.JButton btnSeeRequests;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
