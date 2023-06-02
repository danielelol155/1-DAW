/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author isaye
 */
public class MiRenderer extends DefaultTableCellRenderer {

    //Atributos
    Color colorPar;
    Color colorImpar;

    MiRenderer(Color colorPar, Color colorImpar) {
        this.colorPar = colorPar;
        this.colorImpar = colorImpar;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        //Color azulClaro=new Color(224,215,218);
        //Color azulOsc = new Color (133,64,245);
        if (row % 2 == 0) {
            this.setOpaque(true);
            this.setBackground(this.colorPar);
            this.setForeground(Color.black);

        } else {
            this.setBackground(this.colorImpar);
            // Restaurar los valores por defecto
        }

        return this;
    }

}
