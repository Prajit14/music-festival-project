/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.FlowLayout;
import javax.swing.*;


/**
 *
 * @author PrajitGyawali
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a panel 
JPanel windowContent= new JPanel(); 
// Set a layout manager for this panel 
FlowLayout fl = new FlowLayout();
windowContent.setLayout(fl); 
// Create controls in memory  s
    JLabel Label1 = new JLabel ("Number 1 ");
    JTextField field1 = new JTextField(10); 
    JLabel Label2 = new JLabel ("Number 2"); 
    JTextField field2 = new JTextField(10); 
    JLabel Label3 = new JLabel ("Sum");
    JTextField result = new JTextField(10);
    JButton go = new JButton("Add");
// Add controls to the panel 
windowContent.add(Label1);
windowContent.add(Label1);
windowContent.add(field1);
windowContent.add(Label3);
windowContent.add(field2);
windowContent.add(Label3);
windowContent.add(result);
//windowContent.add(go);
// Create the frame and add the panel to it 
//JFrame frame = new JFrame(“My First Calculator”);
    JFrame frame = new JFrame("_");
    
// Add the panel to the top-level container 
//frame.setContentPane(windowContent);
// set the size and make the window visible 
frame.setSize(400,100); 
frame.setVisible(true); 
    } 
}
