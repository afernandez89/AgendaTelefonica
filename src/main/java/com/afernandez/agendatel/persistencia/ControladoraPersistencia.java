
package com.afernandez.agendatel.persistencia;

import com.afernandez.agendatel.logica.Contacto;
import com.afernandez.agendatel.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    ContactoJpaController contactoJpa = new ContactoJpaController();
    
    public void anadirContacto(Contacto contacto) {
        contactoJpa.create(contacto);

    }

    public List<Contacto> traerContacto() {
        return contactoJpa.findContactoEntities();

    }

    public void borrarContacto(int idContacto) {
        try {
            contactoJpa.destroy(idContacto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Contacto traerContacto(int idContacto) {
        return contactoJpa.findContacto(idContacto);
    }

    public void modificarContacto(Contacto contacto) {
        //Edita los datos nuevos en la base de datos
        try {
            contactoJpa.edit(contacto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
