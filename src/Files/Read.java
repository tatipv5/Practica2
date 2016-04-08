/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import excepciones.GeneralException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import main.Main;
import modelo.Curso;

/**
 *
 * @author tati
 */
public class Read {

    private FileReader file;
    private BufferedReader buffer;

    public void open(String url) throws FileNotFoundException {
        file = new FileReader(url);
        buffer = new BufferedReader(file);
    }

    public void close() throws IOException {
        buffer.close();
    }

    public Curso reedCurso() throws IOException, GeneralException {
        String text = buffer.readLine();
        if (text != null) {
            String vector[] = text.split(" ");
            String nom = vector[0];
            String sig=vector[1];
            int cred=Integer.parseInt(vector[2]);
           //porque hay un vector de estudiantes en la clase curso, sino no se hace.
            Curso curso0= new Curso(sig,nom,cred);
            for(int i=3;i<vector.length;i++){
                curso0.agregarEstudiante(vector[i]);
            }
            return curso0;
        } else {
            return null;
        }
    }
    
    public void reed()throws IOException, GeneralException{
        Curso c=reedCurso();
        while(c!=null){
            Main.arrayC.agregar(c);
            c=reedCurso();
        }
    }
    
}//fin clase
