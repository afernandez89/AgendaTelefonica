
package com.afernandez.agendatel.logica;

import com.afernandez.agendatel.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlP = new ControladoraPersistencia();
    
    public void anadirContacto(String nombre, int telefono, String email) {
        
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        contacto.setTelefono(telefono);
        contacto.setEmail(email);
        
        controlP.anadirContacto (contacto);

    }

    public List<Contacto> traerContacto() {
        return controlP.traerContacto();
        
    }

    public void borrarContacto(int idContacto) {
        controlP.borrarContacto(idContacto);
    }

    public Contacto traerContacto(int idContacto) {
        return controlP.traerContacto(idContacto);
    }

    public void modificarContacto(Contacto contacto, String nombre, int telefono, String email) {
        //le asigno los nuevos valores modificados en la variable contacto
        contacto.setNombre(nombre);
        contacto.setTelefono(telefono);
        contacto.setEmail(email);
        
        //les pasa los nuevos datos a la persistencia
        controlP.modificarContacto(contacto);
    }
   
}
