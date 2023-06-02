/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cosicas;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
/**
 *
 * @author usuario
 */
public class Cosicas {

    public static void main(String[] args) throws JAXBException {
        System.out.println("Hello World!");
        
        try
        {
            
            JAXBContext contexto = JAXBContext.newInstance(Socio.class);
            
            Socio s1 = new Socio(1, "Pepe", "C/Pez","01/09/1990");
            
            Marshaller m = contexto.createMarshaller();
            
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(s1, new File("c:\\usuarios\\socio1.xml"));
            
            /*
            Unmarshaller um = contexto.createUnmarshaller();
            
            Socio s = (Socio) um.unmarshal(new FileReader("socio.xml"));
            */
        }
        catch(JAXBException e)
                {
                    System.out.println(e.getMessage());
                }
        //FramePrincipal fp = new FramePrincipal();
        
        //fp.setVisible(true);
    }
}
