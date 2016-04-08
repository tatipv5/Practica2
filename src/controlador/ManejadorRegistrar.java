/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import excepciones.GeneralException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import main.Main;

/**
 *
 * @author tati
 */
public class ManejadorRegistrar implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            boolean g = Main.arrayC.agregar(Main.ventanaR.devolverText());
            Main.ventanaR.mensajeGuardado(g);
        } catch (GeneralException gE) {
            JOptionPane.showMessageDialog(null, gE.getMessage());
        }
    }

}//fin clase
