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
public class ManejadorEliminar implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String s=Main.ventanaE.devolverSigla();
            Main.arrayC.eliminar(s);
            System.out.println("eliminado");
            Main.ventanaE.mensajeEliminado(s);
        }catch(GeneralException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }

}
