/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class MensajesService {
    
    public static void crearMensaje(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Escribe el autor");
        String autor = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);
        
        MensajesDAO.crearMensajeDB(registro);    
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();    
    }
    
    public static void borrarMensaje(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe el id_mensaje a eliminar");
        int id_mensaje = sc.nextInt();
        
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    
    public static void editarMensaje(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Escribe el id a actualizar");
       int id_mensaje = sc.nextInt();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setId_mensaje(id_mensaje);
        
        MensajesDAO.actualizarMensajeBD(registro);
    }
    
}
