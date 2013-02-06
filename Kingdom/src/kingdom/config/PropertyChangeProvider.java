/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.config;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author andriy
 */
public class PropertyChangeProvider {
    
    private final PropertyChangeSupport propSupport = new PropertyChangeSupport(this);
    private boolean fireEnabled = true;
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propSupport.removePropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propSupport.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propSupport.removePropertyChangeListener(propertyName, listener);
    }

    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        if(fireEnabled){
            propSupport.firePropertyChange(propertyName, oldValue, newValue);
        }
    }
    
    /**
     * disable firing of any events. Normally may be used when series of event is happened but UI does need to 
     * be updated for this series of event.
     */
    public synchronized void disableFiring(){
        this.fireEnabled = false;
    }
    
    /**
     * enable firing of any events. Normally may be used when series of event is happened but UI does need to 
     * be updated for this series of event.
     */
    public synchronized void enableFiring(){
        this.fireEnabled = true;
    }
}
