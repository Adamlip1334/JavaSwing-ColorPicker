/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import java.util.*;
import java.awt.Color;
/**
 *
 * @author 01699728
 */
public class ColorEvent extends EventObject {
    private Color color;

    public Color getColor() {
        return color;
    }
    
    public ColorEvent(Object source, Color color){
        super(source);
        this.color = color;
    }
}
