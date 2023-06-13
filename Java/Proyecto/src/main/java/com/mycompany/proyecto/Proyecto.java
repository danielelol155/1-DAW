/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author usuario
 */
public class Proyecto {

    public static void main(String[] args) {

        try {
            String rutaArchivo = "src\\main\\java\\com\\mycompany\\proyecto\\config.ini"; // Ruta del archivo que deseas comprobar

            File archivo = new File(rutaArchivo);

            if (archivo.exists()) {
                partidos m = new partidos();
                m.setVisible(true);
            } else {
                Formulario f = new Formulario();
                f.setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
