
package com.mycompany.login.persistence;

import com.mycompany.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        //Traemos todos los usuarios
        return usuJpa.findUsuarioEntities();
    }
    
    
    
}
