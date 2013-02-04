/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.config;

/**
 *
 * @author andriy
 */
public class StartWizardConfig {
    
    /* first page parameters */
    private boolean loadSelected = false;
    private int selectedNumberOfUser = 3; 

    /* second page parametters */
    private String usename0 = "";
    private String usename1 = "";
    private String usename2 = "";
    private String usename3 = "";

    public boolean isLoadSelected() {
        return loadSelected;
    }

    public void setLoadSelected(boolean loadSelected) {
        this.loadSelected = loadSelected;
    }

    public int getSelectedNumberOfUser() {
        return selectedNumberOfUser;
    }

    public void setSelectedNumberOfUser(int selectedNumberOfUser) {
        this.selectedNumberOfUser = selectedNumberOfUser;
    }

    public String getUsename0() {
        return usename0;
    }

    public void setUsename0(String usename0) {
        this.usename0 = usename0;
    }

    public String getUsename1() {
        return usename1;
    }

    public void setUsename1(String usename1) {
        this.usename1 = usename1;
    }

    public String getUsename2() {
        return usename2;
    }

    public void setUsename2(String usename2) {
        this.usename2 = usename2;
    }

    public String getUsename3() {
        return usename3;
    }

    public void setUsename3(String usename3) {
        this.usename3 = usename3;
    }
    
    
}
