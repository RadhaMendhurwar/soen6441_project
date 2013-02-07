/*
 * TEAM C in SOEN6441/WW
 */
package kingdom;

import java.util.Scanner;
import javax.swing.SwingUtilities;
import kingdom.ui.MainWindow;
import kingdom.ui.StartWizard;

/**
 * Main class to start application
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int mode;
        Scanner modeScan = new Scanner(System.in);
        System.out.println("This is the start point of Application\n");
        System.out.println("Select 1.GUI mode \n 2.Text Mode");
        mode = modeScan.nextInt();
        Main mainobj = new Main();
        switch(mode)
        {
            
            case 1:
               mainobj.GUI();
            break;
        
            case 2:
               mainobj.textMode();
             break;
       }
        
        
    
        
    }
    /**
 * Method to invoke GUI mode of the game
 */
    public void GUI()
    {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                MainWindow mWindow = new MainWindow();
                mWindow.setVisible(true);
                    }
                });
    }
        /**
 * Method to invoke Text mode of the game
 */
    
    public void textMode()
    {
        System.out.println("Welcome to Kingdoms - Text Mode");
    }
    
}
