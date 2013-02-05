/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.config;

import kingdom.gameitems.Const.UserColor;

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
    // user colors
    private UserColor userColor0 = null;
    private UserColor userColor1 = null;
    private UserColor userColor2 = null;
    private UserColor userColor3 = null;

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

    public UserColor getUserColor0() {
        return userColor0;
    }

    public void setUserColor0(UserColor userColor0) {
        this.userColor0 = userColor0;
    }

    public UserColor getUserColor1() {
        return userColor1;
    }

    public void setUserColor1(UserColor userColor1) {
        this.userColor1 = userColor1;
    }

    public UserColor getUserColor2() {
        return userColor2;
    }

    public void setUserColor2(UserColor userColor2) {
        this.userColor2 = userColor2;
    }

    public UserColor getUserColor3() {
        return userColor3;
    }

    public void setUserColor3(UserColor userColor3) {
        this.userColor3 = userColor3;
    }
    
    
    
}
