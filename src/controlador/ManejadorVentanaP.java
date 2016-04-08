/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Main;

/**
 *
 * @author tati
 */
public class ManejadorVentanaP implements ActionListener {

//    private VentanaPrincipal ventanaP = new VentanaPrincipal();
    @Override
    public void actionPerformed(ActionEvent e) {
        String etiqueta = e.getActionCommand();
        switch (etiqueta) {
            case "itemRegistro":
                Main.v.llamarVentana(1);
                break;
            case "itemModificar":
                Main.v.llamarVentana(2);
                break;
            case "itemEliminar":
                Main.v.llamarVentana(3);
                break;
            case "itemAsignar":
                Main.v.llamarVentana(4);
                break;
            case "itemConsultar":
                Main.v.llamarVentana(5);
                break;
            default:
        }
    }

}
