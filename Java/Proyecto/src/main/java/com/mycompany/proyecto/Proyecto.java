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
            String filepath = "src\\main\\java\\com\\mycompany\\proyecto\\config.ini";
            File file = new File(filepath);
            
            boolean exists= file.exists();
            if (exists) {
                partidos m = new partidos();
                m.setVisible(true);
            } else {
                Formulario formulario = new Formulario();
                formulario.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static boolean isFileExists(File file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
