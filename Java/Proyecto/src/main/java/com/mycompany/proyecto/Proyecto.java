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
            partidos m = new partidos();
            m.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
