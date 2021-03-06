/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Patient.VitalSign;
import Business.QuickAssist;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.QuickAssistDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.skype.Chat;
import com.skype.Call;
import com.skype.Chat;
import com.skype.ContactList;
import com.skype.Friend;
import com.skype.Skype;
import com.skype.SkypeException;
import com.skype.Skype;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sanka_001
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    DoctorOrganization doctorOrganization;
    PatientDoctorWorkRequest request1;
    Enterprise enterprise;
    QuickAssist system;
    ChartPanel CP;

    /**
     * Creates new form DoctorDroneJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, QuickAssist system) {
        initComponents();
        this.setBackground(Color.white);
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        setStatus();

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof DoctorOrganization) {
                doctorOrganization = (DoctorOrganization) org;
            }
        }

        populateTable();

    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblWorkRequest.getModel();

        dtm.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            request1 = (PatientDoctorWorkRequest) request;
            if(!request1.getStatus().equals("Task completed")){
            Object[] row = new Object[3];
            row[0] = request1;
            row[1] = request1.getAssignedPatient();
            row[2] = request1.getStatus();
            dtm.addRow(row);
            lbl1.setText("Welcome "+ request1.getAssignedDoctor().getFirstName());
            
            }
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

        txtPatientAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDroneLocation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTakeOff = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblEta = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        pnlVitalSign = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        txtPatientAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Patient Address:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Drone Location:");

        txtDroneLocation.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tblWorkRequest.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Patient Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);
        if (tblWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Release Drone");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtMessage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMessage.setText(" ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Doctor's initial comments:");

        btnTakeOff.setText("Take Off");
        btnTakeOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeOffActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("ETA:");

        lblEta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEta.setText("                    ");

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl1.setText("Welcome ");

        jButton2.setText("See VitalSigns");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTakeOff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEta, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtDroneLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(txtPatientAddress))
                                .addGap(156, 156, 156)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel5))
                        .addContainerGap(97, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnTakeOff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlVitalSign, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDroneLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEta))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setStatus() {
        for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
            if (emp.getUserAccount().equals(account)) {
                emp.setStatus(true);
            }

        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        request1.setMessage(txtMessage.getText());
        request1.setStatus("Task completed");
        request1.getAssignedDrone().setAvailability(true);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void startSkypeChat(String skypeID)  throws SkypeException{

        try {
            Chat myChat = Skype.chat(skypeID);
            myChat.send("I am having a health attack. Please send help");
        } catch (Exception e) {
            System.out.println("Some error sending message on skype");
        }
    }

    private void btnTakeOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeOffActionPerformed
        int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select desired patient!");
        } else {
            request1.setStatus("Drone reaching the patient");
            txtPatientAddress.setText(request1.getAssignedPatient().getAddress());
            txtDroneLocation.setText(request1.getAssignedDrone().getAddress());
            lblEta.setText(String.valueOf(request1.getEta()));
        populateTable();
        }        
    }//GEN-LAST:event_btnTakeOffActionPerformed
    public void populateChart(VitalSign vitalSign){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.setValue(vitalSign.getsBloodPressure(), "Status", "Systolic Blood Pressure");
        dataSet.setValue(vitalSign.getdBloodPressure(), "Status", "Diabolic Blood Pressure");
        dataSet.setValue(vitalSign.getHeartRate(), "Status", "Heart Rate");
        dataSet.setValue(vitalSign.getWeight(), "Status", "Weight");
        dataSet.setValue(vitalSign.getTemperature(), "Status", "Temperature");

        JFreeChart chart = ChartFactory.createBarChart(request1.getAssignedPatient().getFirstName() + "'s Vital Sign Record", "Vital Signs", "Report Status", dataSet, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.white);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ((BarRenderer) p.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) chart.getCategoryPlot().getRenderer();
        CP = new ChartPanel(chart);
        pnlVitalSign.add(CP, BorderLayout.CENTER);
        pnlVitalSign.validate();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int size = request1.getAssignedPatient().getVitalSignDirectory().getVitalSignList().size();
        VitalSign vitalSign = request1.getAssignedPatient().getVitalSignDirectory().getVitalSignList().get(size - 1);
        
        if (CP != null) {
            pnlVitalSign.removeAll();
        }
        populateChart(vitalSign);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTakeOff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblEta;
    private javax.swing.JPanel pnlVitalSign;
    private javax.swing.JTable tblWorkRequest;
    private javax.swing.JTextField txtDroneLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPatientAddress;
    // End of variables declaration//GEN-END:variables
}
