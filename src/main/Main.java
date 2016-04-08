package main;

import Files.Read;
import Files.Write;
import excepciones.GeneralException;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.ManejadorArrayC;
import vista.VentanaPrincipal;
import vista.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tati
 */
public class Main {

    public static final ManejadorArrayC arrayC = new ManejadorArrayC();
    public static final VentanaRegistrar ventanaR = new VentanaRegistrar();
    public static final VentanaAsignar ventanaA = new VentanaAsignar();
    public static final VentanaConsultar ventanaC = new VentanaConsultar();
    public static final VentanaEliminar ventanaE = new VentanaEliminar();
    public static final VentanaModificar ventanaM = new VentanaModificar();
    public static VentanaPrincipal v;

    public static void main(String[] args) {
        Read read = new Read();
       
        try {
            read.open("arch\\Practice2.txt");
            read.reed();
        } catch (IOException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (GeneralException g) {
         JOptionPane.showMessageDialog(null, g.getMessage());
        }
        v = new VentanaPrincipal();
        v.setVisible(true);

       
    }

}
