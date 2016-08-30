/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthAssistantAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorAdminOrganization;
import Business.Organization.DroneAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.SensorAdminOrganization;
import Business.Patient.Patient;
import Business.QuickAssist;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanka_001
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    QuickAssist system;
    Enterprise enterprise;
    int longitude;
    int latitude;
    Patient patient;
    Employee employee;
    SecureRandom randomId;
    Organization organization;

    /**
     * Creates new form ManageUserJPanel
     */
    public ManageUserAccountJPanel(JPanel userProcessContainer, QuickAssist system, Enterprise enterprise, Organization organization) {
        initComponents();
        this.setBackground(Color.white);
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = organization;
        populateOrgCombo();
        populateUserTable();
        cmbEmployee.removeAllItems();
        cmbRole.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbRole = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        cmbOrganization = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteAccount = new javax.swing.JButton();
        lblPasswordStatus = new javax.swing.JLabel();

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "Role", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(0).setResizable(false);
            tblUser.getColumnModel().getColumn(1).setResizable(false);
            tblUser.getColumnModel().getColumn(2).setResizable(false);
            tblUser.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Password");

        jLabel3.setText("Person");

        cmbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Organization");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cmbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        jLabel1.setText("User Name");

        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        lblPasswordStatus.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteAccount))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbOrganization, 0, 319, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbEmployee, 0, 319, Short.MAX_VALUE)
                                    .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPasswordStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreate)
                    .addComponent(btnDeleteAccount))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateOrgCombo() {
//        cmbOrganization.removeAllItems();
//        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

        cmbOrganization.addItem(organization);

    }

    private void populateRoleCombo(Organization organization) {
        cmbRole.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            cmbRole.addItem(role);

        }
    }

    private void populateEmployeeCombo(Organization organization) {

        if (organization instanceof SensorAdminOrganization) {
            for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
                cmbEmployee.addItem(emp);
            }

//        } else if (organization instanceof DroneOrganization) {
//            for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
//                cmbEmployee.addItem(emp);
//            }
//        } else if (organization instanceof DoctorOrganization) {
//            for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
//                cmbEmployee.addItem(emp);
//            }
        } else if (organization instanceof DoctorAdminOrganization) {
            for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
                cmbEmployee.addItem(emp);
            }
        } else if (organization instanceof DroneAdminOrganization) {
            for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
                cmbEmployee.addItem(emp);
            }
//        } else if (organization instanceof PatientOrganization) {
//            for (Patient pat : organization.getPatientDirectory().getPatientList()) {
//                cmbEmployee.addItem(pat);
//            }
        }
    }

    private void populateUserTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblUser.getModel();

        dtm.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (((organization instanceof DoctorAdminOrganization) || (organization instanceof DroneAdminOrganization) || (organization instanceof SensorAdminOrganization))) {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = ua;
                    row[1] = ua.getPassword();
                    row[2] = ua.getRole();
                    row[3] = organization.getName();
                    // row[2]= organization.getName();
                    dtm.addRow(row);
                }
            }
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    private int generateLongitude() {

        Random r = new Random();
        int Low = 1;
        int High = 100;
        int Result = r.nextInt(High - Low) + Low;
        return Result;
    }

    private int generateLatitude() {
        Random r = new Random();
        int Low = 1;
        int High = 100;
        int Result = r.nextInt(High - Low) + Low;
        return Result;
    }

    public String nextSessionId() {
        return new BigInteger(130, randomId).toString(32);
    }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        int count = 0;
        if (txtPassword.getText().trim().isEmpty()) {
            count++;
        }
        if (txtUserName.getText().trim().isEmpty()) {
            count++;
        }
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "Please enter all the details", "Information", JOptionPane.ERROR_MESSAGE);
        }
        
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if (organization instanceof PatientOrganization) {
            patient = (Patient) cmbEmployee.getSelectedItem();
        } else {
            employee = (Employee) cmbEmployee.getSelectedItem();
        }
        Role role = (Role) cmbRole.getSelectedItem();

        UserAccount ua = null;
        if (role instanceof PatientRole) {

            ua = organization.getUserAccountDirectory().createPatientUserAccount(userName, password, patient, role);
            patient.setUserAccount(ua);

        } else {

            ua = organization.getUserAccountDirectory().createEmployeeUserAccount(userName, password, employee, role);
            employee.setUserAccount(ua);
        }

        populateUserTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationActionPerformed
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        if (organization != null) {
            populateEmployeeCombo(organization);
            populateRoleCombo(organization);
        }
    }//GEN-LAST:event_cmbOrganizationActionPerformed

    private void cmbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        if (organization != null) {
            populateRoleCombo(organization);
        }
    }//GEN-LAST:event_cmbEmployeeActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        int selectedRow = tblUser.getSelectedRow();
        if (selectedRow >= 0) {
            Employee emp = (Employee) tblUser.getValueAt(selectedRow, 0);
            UserAccount ua = emp.getUserAccount();
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (org.getEmployeeDirectory().getEmployeeList().contains(emp)){ 
                    org.getUserAccountDirectory().deleteEmployeeUserAccount(ua);
    }//GEN-LAST:event_btnDeleteAccountActionPerformed
            }
        } else{
           JOptionPane.showMessageDialog(null, "Please select a row from the table to be deleted", "Information", JOptionPane.ERROR_MESSAGE);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPasswordStatus;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}