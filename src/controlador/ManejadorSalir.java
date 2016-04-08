/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Files.Write;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import main.Main;

/**
 *
 * @author tati
 */
public class ManejadorSalir implements ActionListener
{
     Write write = new Write();

    @Override
    public void actionPerformed(ActionEvent e) {
     try {
            write.open("arch\\Practice2.txt");
            write.write();
            write.close();

        } catch (IOException eo) {
            JOptionPane.showMessageDialog(null, eo.getMessage());
           
        }
     Main.v.salir();
    }
    
}
