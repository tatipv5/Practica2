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
public class ManejadorArrayC {

    private ArrayList<Curso> arrayC;

    public ManejadorArrayC() {
        arrayC = new ArrayList<>();
    }

    public int buscar(String s) {
        for (int i = 0; i < arrayC.size(); i++) {
            if (arrayC.get(i) != null && arrayC.get(i).getSiglas().equals(s)) {
                return i;
            }
        }
        return -1;
        // throw new GeneralException("El curso no existe o la sigla es incorrecta.");
    }

    public boolean agregar(Curso curso) throws GeneralException {
        if (curso == null) {
            throw new GeneralException("Los datoa ingresados son incorrectos");
        } else {
            int i = buscar(curso.getSiglas());
            if (i >= 0) {
                throw new GeneralException("Las siglas digitadas ya existen.");
            } else {
                for (int j = 0; j < arrayC.size(); j++) {
                    if (arrayC.get(j).getNombre().equals(curso.getNombre())) {
                        throw new GeneralException("El nombre digitado ya existe.");
                    }
                }
                arrayC.add(curso);
                System.out.println("guardado");
                return true;
            }

        }
    }

    public void modificar(String sigla, String nombreC, int creditos) {
        int i = buscar(sigla);
        if (i >= 0) {
            arrayC.get(i).setNombre(nombreC);
            arrayC.get(i).setCreditos(creditos);
        }
    }

    public void eliminar(String sigla) throws GeneralException {
        int i = buscar(sigla);
        if (i < 0) {
            throw new GeneralException("El curso no existe o la sigla es incorrecta.");

        } else {
            arrayC.remove(i);

        }
    }

    public void asignarEstudiante(String sigla, String carne) throws GeneralException {
        int i = buscar(sigla);
        if (i >= 0) {
            arrayC.get(i).agregarEstudiante(carne);
        } else {
            throw new GeneralException("No se puede encontrar el curso");

        }
    }

    public String consultar(String sigla) throws GeneralException {
        int i = buscar(sigla);
        if (i >= 0) {
            return arrayC.get(i).toString();
        } else {
            throw new GeneralException("La sigla no existe o es incorrecta");
        }
    }

    public Curso devolverCurso(String sig) {
        int i = buscar(sig);
        if (i >= 0) {
            return arrayC.get(i);
        } else {
            return null;
        }
    }

    public int size() {
       return arrayC.size();
    }

    public Curso devolverXIndice(int i){
        if(arrayC.get(i)!=null){
            return arrayC.get(i);
        }
        return null;
    }
    
}//fin
