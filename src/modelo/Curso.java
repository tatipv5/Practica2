/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excepciones.GeneralException;
import java.util.ArrayList;

/**
 *
 * @author tati
 */
public class Curso {

    private String siglas, nombre;
    private int creditos;
    private static final int CANT = 25;
    private ArrayList<String> arrayE;

    public Curso(String siglas, String nombre, int creditos) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.creditos = creditos;
        arrayE = new ArrayList<>(CANT);
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int sizeE() {
        return arrayE.size();
    }

    public String getEstudiante(int i) {
        return arrayE.get(i);
    }

    @Override
    public String toString() {
        return "Curso: "+nombre + "\nSiglas:" + siglas + "\nCreditos:" + creditos + "\nEstudiantes:\n" + splitE() + "\n";
    }

    public boolean verificarExistencia(String carnet) {
        for (int i = 0; i < arrayE.size(); i++) {
            if (arrayE.get(i) != null && arrayE.get(i).equals(carnet)) {
                return false;
            }
        }
        return true;
    }

    public void agregarEstudiante(String carne) throws GeneralException {
        if (carne.equals("")) {
            throw new GeneralException("El estudiante no tiene datos");
        } else if (arrayE.size() <= CANT && verificarExistencia(carne) == true) {
            arrayE.add(carne);
        } else {
            throw new GeneralException("El estudiante no existe o el curso esta lleno.");
        }
    }

    public String splitE(){
        String text = "";
        for (int i = 0; i < arrayE.size(); i++) {
            if(arrayE.get(i) != null) {
            text += arrayE.get(i).toString() + "...";
            }
        }
        return text;
    }
    
    public String getRegisterEst(){
       String est="";
        for (int i = 0; i < arrayE.size(); i++) {
            if(arrayE.get(i)!=null){
                est+= arrayE.get(i)+" ";
            }
        }
        return est;
    }
    
    public String getRegister(){
        return nombre+" "+siglas+" "+creditos+" "+getRegisterEst()+"\n";
    }
}
