/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

/**
 *
 * @author crist
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fehca_mensaje;
    
    
    public Mensajes() {

    }
    
    public Mensajes(String mensaje, String autor_mensaje, String fehca_mensaje) {       
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fehca_mensaje = fehca_mensaje;
    }  
    
    public int getId_mensaje() {
        return id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public String getFehca_mensaje() {
        return fehca_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public void setFehca_mensaje(String fehca_mensaje) {
        this.fehca_mensaje = fehca_mensaje;
    }
    
}
