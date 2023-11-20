/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalprogra2;

import java.util.ArrayList;

/**
 *
 * @author luiss
 */
public class DatosGlobales {
    
    private static Cancion CancionSeleccionada;
    private static ArrayList<Cancion> dbCanciones = new ArrayList();
    private static ArrayList<Cancion> dbRecientes= new ArrayList();
    
    
    //Funciones de Cancion Seleccionada
    public static Cancion getCancionSeleccionada() {
        return CancionSeleccionada;
    }
    
    public static void setCancionSeleccionada(Cancion CancionSelected) {
        DatosGlobales.CancionSeleccionada = CancionSelected;
    }
    
    //Funciones de Array dbCanciones

    public static ArrayList<Cancion> getdbCanciones() {
        return dbCanciones;
    }
    
    public static void addCancion(Cancion nuevaCancion) {
        DatosGlobales.dbCanciones.add(nuevaCancion);
    }
    
    //Funciones de Array dbRecientes
    
    public static ArrayList<Cancion> getdbRecientes() {
        return dbRecientes;
    }
    
    public static void setdbRecientes(ArrayList<Cancion> ArrayLast)
    {
        DatosGlobales.dbRecientes= ArrayLast;
    }
    
    public static void addReciente(Cancion CancionReciente) {
        DatosGlobales.dbRecientes.add(CancionReciente);
    }

    

    
    
}
