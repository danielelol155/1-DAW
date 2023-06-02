package com.mycompany.cosicas;

import javax.xml.bind.annotation.*;

/**
 *
 * @author usuario
 */

@XmlRootElement(name="socio")
@XmlType(propOrder = {"nombreSocio","direccion","fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Socio {

    @XmlAttribute(name = "id", required = true)
    private Integer identificacion;
    @XmlAttribute(name = "nombre")
    private String nombreSocio;
    @XmlAttribute(name = "direccion")
    private String direccion;
    @XmlAttribute(name = "fechaAlta")
    private String fechaAlta;

    public Socio() {
    }
    
    public Socio(Integer identificacion, String nombreSocio, String direccion, String fechaAlta)
    {
        this.identificacion = identificacion;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }
    
    
    /**
     * @return the identificacion
     */
    public Integer getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombreSocio
     */
    public String getNombreSocio() {
        return nombreSocio;
    }

    /**
     * @param nombreSocio the nombreSocio to set
     */
    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechaAlta
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
      
    public String toString()
    {
        return identificacion + " " + nombreSocio + " " + direccion + " " + fechaAlta;
    }
            
            
    
}

