/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.JLabel;

/**
 *
 * @author 01699728
 */
public class HexLabel extends JLabel implements ColorListener {

    
        public HexLabel() {
        super();
        setText("Hex: #000000 ");
    }
    
    @Override
    public void changeColor(ColorEvent ce) {
   
int r = ce.getColor().getRed();
int g = ce.getColor().getGreen();
int b = ce.getColor().getBlue();


String hex = String.format("#%02x%02x%02x", r, g, b); //i found this here



        setText("hex: " + hex);
    }

 
}
