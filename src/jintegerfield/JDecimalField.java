/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jintegerfield;

/**
 *
 * @author 00220682
 */
public class JDecimalField extends JRegExpField {
    public JDecimalField(){
        super();
        //setExp("-?\\d*.?\\d*");
        //setExp("-?[0-9]*[.]?[0-9]*");
        setExp("[-]?\\d*\\.?\\d*");
        //setText("0");
    }
    
    public double getValue() throws NumberFormatException{
        return Double.parseDouble(getText());
    }
}
