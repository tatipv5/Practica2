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
public class ManejadorAsignar implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String textos = Main.ventanaA.devolverText();
        String vectorA[] = textos.split(",");
        try {
            Main.arrayC.asignarEstudiante(vectorA[1], vectorA[0]);
            Main.ventanaA.mensajeAsignado();
        } catch (GeneralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
