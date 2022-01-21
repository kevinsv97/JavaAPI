/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.ResultSet;
//import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class MensajesDAO {
    static Connection cnx;
    
//    public MensajesDAO(){
//        conectar();
//    }
    
    public static void conectar(){
        
        Conexion conexion = new Conexion();        
        try{ 
            cnx = conexion.get_conection();
        } catch (Exception ex) {
            System.out.println(ex);
        }        
    }
    
    public static void crearMensajeDB(Mensajes mensaje){
        conectar();
        PreparedStatement ps;
        try{
            String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
            ps = cnx.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutor_mensaje());
            ps.executeUpdate();
            System.out.println("----- Mensaje Creado ------");
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
    }
    
    public static void leerMensajesDB(){
        conectar();
        PreparedStatement ps;
        ResultSet rs;
        try{
            String query = "Select * from mensajes";
            ps = cnx.prepareStatement(query);
            rs =  ps.executeQuery();       
            System.out.println("\n");
            while (rs.next()){
                System.out.println(" Id: "+ rs.getInt("id_mensaje"));
                System.out.println(" Mensaje: "+ rs.getString("mensaje"));
                System.out.println(" Autor mensaje: "+ rs.getString("autor_mensaje"));
                System.out.println(" Fecha: "+ rs.getDate("fecha_mensaje")+"\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
    }
    
    public static void borrarMensajeDB(int id){
        conectar();
        PreparedStatement ps;
        try{
            String query = "Delete from mensajes where id_mensaje = ?";
            ps = cnx.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("El mensaje con id " + id + " ha sido borrado");        
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
    }
    
    public static void actualizarMensajeBD(Mensajes mensaje){
        conectar();
        PreparedStatement ps;
        try{
            String query = "Update mensajes set mensaje = ? where id_mensaje = ?";
            ps = cnx.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setInt(2, mensaje.getId_mensaje());
            ps.executeUpdate();
            System.out.println("El mensaje con id " + mensaje.getId_mensaje() + " ha sido actualizado");        
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
    }
}
