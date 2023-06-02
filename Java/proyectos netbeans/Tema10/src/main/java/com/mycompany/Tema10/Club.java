/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Tema10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="club")
@XmlType(propOrder = {"nombreClub","listaSocios"})
@XmlAccessorType(XmlAccessType.FIELD)
class Club
{
    @XmlElement (name = "nombre")
    String nombreClub;
    @XmlElementWrapper (name = "socios")
            @XmlElement (name = "socio")
            private Socio[] listaSocios;
    @XmlTransient
    private String nif;
    
    
    public Club()
    {}
    
    public Club(String nombreClub, String nif)
    {
        this.nombreClub = nombreClub;
        this.listaSocios = new Socio[0];
        this.nif = nif;
    }
    
    public void nuevoSocio(Socio nuevoSocio)
    {
        listaSocios = Arrays.copyOf(listaSocios, listaSocios.length+1);
        listaSocios[listaSocios.length-1] = nuevoSocio;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
}