/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyber_counter;

import javax.swing.UIManager;

/**
 *
 * @author sd-hck
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                }
            } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
            }
         counter_UI saisiDialog=new counter_UI(new javax.swing.JFrame(), true);
        saisiDialog.setVisible(true);
    }
    
}
