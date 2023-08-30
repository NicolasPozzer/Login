
package com.mycompany.login.logica;

import com.mycompany.login.persistence.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }
    
    

    public String validarUsuario(String usuario, String contrasenia) {
        String mensaje = "";
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    mensaje = "Usuario y contrasenia correctos. Bienvenido!";
                    return mensaje;
                }
                else{
                    mensaje = "Contrasenia Incorrecta";
                    return mensaje;
                }
            }
            else{
                mensaje = "Usuario no encontrado";
            }
        }
        
        return mensaje;
        
    }
    
    
}
