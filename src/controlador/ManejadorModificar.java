/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import excepciones.GeneralException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Main;
import modelo.Curso;

/**
 *
 * @author tati
 */
public class ManejadorModificar implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("buscar")) {
            String sigla = Main.ventanaM.devolverSigla();
            Curso curso = Main.arrayC.devolverCurso(sigla);
            
            if (curso != null) {
                Main.ventanaM.asignarTexts(curso);
                Main.ventanaM.editable(false);
            } else {
                Main.ventanaM.error();
            }
        } else {
            Curso curso = Main.ventanaM.devolverTextos();
            String nombre = curso.getNombre();
            String sigla = curso.getSiglas();
            int cred = curso.getCreditos();
            if (nombre.equals("") == false && cred > 0) {
                Main.arrayC.modificar(sigla, nombre, cred);
                System.out.println("modificado");
                Main.ventanaM.mensajeModificado();
            } else {
                Main.ventanaM.error();
            }
            
        }
    }
    
}
