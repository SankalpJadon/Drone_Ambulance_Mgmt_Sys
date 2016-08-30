/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.QuickAssist;
import Business.UserAccount.UserAccount;
import UserInterface.DroneAdmin.DroneWarehouseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanka_001
 */
public class DroneAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, QuickAssist system,Network network) {
        return new DroneWarehouseWorkAreaJPanel(userProcessContainer, organization, system, enterprise, account);
    }
   
}
