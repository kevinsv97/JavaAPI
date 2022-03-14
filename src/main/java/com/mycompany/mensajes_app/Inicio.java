package com.mycompany.mensajes_app;

import java.util.Scanner;

public class Inicio {
        
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
           
            System.out.println("-----------------------");
            System.out.println(" Aplicación de Mensajes ");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes viendo que haces");
            System.out.println(" 3. Editar un mensaje hola mas");
            System.out.println(" 4. Eliminar un mensaje");
            System.out.println(" 5. Salir");
            // se lee la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1 -> MensajesService.crearMensaje();
                case 2 -> MensajesService.listarMensajes();
                case 3 -> MensajesService.editarMensaje();
                case 4 -> MensajesService.borrarMensaje();
                default -> {
                }
            }
        }
        while(opcion!=5);        

    }
}
