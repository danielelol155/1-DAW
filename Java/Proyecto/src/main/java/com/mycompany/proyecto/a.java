/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author usuario
 */
public class a {

    public static void main(String[] args) {
        String t1 = "97/98";
        String t2 = "99/00";

        String temp[];

        temp = t1.split("/");
        int inicio = Integer.parseInt(temp[0]) % 100;

        temp = t2.split("/");
        int fin = (Integer.parseInt(temp[0]) + 1) % 100;

        String sqlIn = "in ('";

        int anyoInicioTemporada = inicio;

        while (anyoInicioTemporada != fin) {
            int anyoFinTemporada = (inicio + 1) % 100;

            String cadena[] = new String[2];

            cadena[0] = "" + anyoInicioTemporada;
            if (anyoInicioTemporada < 9) {
                cadena[0] = "0" + cadena[0];
            }

            cadena[1] = "" + anyoFinTemporada;
            if (anyoFinTemporada < 9) {
                cadena[1] = "0" + cadena[1];
            }

            sqlIn = sqlIn + "" + cadena[0] + "/" + cadena[1] + "','";

            inicio++;
            anyoInicioTemporada = inicio % 100;
        }

        sqlIn = sqlIn.substring(0, sqlIn.length() - 2);

        sqlIn = sqlIn + ")";
        System.out.println(sqlIn);

    }
}
