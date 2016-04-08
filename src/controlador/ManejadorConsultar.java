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
public class ManejadorConsultar implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String s=Main.ventanaC.devolverSigla();
          String c= Main.arrayC.consultar(s);
          String[] vectorC = c.split("...");
          Main.ventanaC.pegarDatos(c);
         // Main.ventanaC.run();
        }catch(GeneralException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
        
        
        //Main.ventanaC.salirConsultar();
        
        /////ESTO NO VA AQUI ESTO VA EN EL BOTON DE SALIR QUE DEBE TENER LA VENTANA YA QUE SE CIERRA CUANDO EL USUARIO QUIERE
    
    }

}
