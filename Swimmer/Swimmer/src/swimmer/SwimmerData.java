/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimmer;

/**
 *
 * @author SomeBody
 */
public abstract class SwimmerData implements Cloneable {
    public Object cloneMe() throws CloneNotSupportedException{
        return super.clone();
    }

    Object getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
