/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.actions;

/**
 *
 * @author andriy
 */
public interface IGameAction {
    
    /**
     * returned status of any action. Has information about result of the action
     */
    enum ActionResult{
        SUCCESS,    // successefully executed action
        ERROR,      // problem during execution of action
        REDO        // request to repeat execution of same action
        //TODO add more types if required
    }
    
    /**
     * implemented method may implement any kind of action. Example: move tile, count score, end game, ...
     * @return ActionResult 
     */
    ActionResult execute();
}
