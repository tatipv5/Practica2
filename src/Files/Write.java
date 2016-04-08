/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import main.Main;
import modelo.Curso;

/**
 *
 * @author tati
 */
public class Write {

    private FileWriter file;
    private BufferedWriter buffer;

    public void open(String url) throws IOException {
        file = new FileWriter(url);
        buffer = new BufferedWriter(file);
    }

    public void close() throws IOException {
        buffer.flush();
        buffer.close();
    }

    public void writeCurso(Curso curso) throws IOException {
        buffer.write(curso.getRegister());
    }

    public void write() throws IOException {
        Curso c;
        for (int i = 0; i < Main.arrayC.size(); i++) {
            if ((c = Main.arrayC.devolverXIndice(i)) != null) {
                writeCurso(c);
            }
        }
    }
}//fin clase


