/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalprogra2;

/**
 *
 * @author luiss
 */
public class Cancion {
    
    private String nombre;
    private String artista;
    private String album;
    private int anio;
    private String CancionRoot;
    private String ImageRoot;
    private String LetraRoot;
    private String genero;
    //Tipo: Cancion=true, Podcast=false.
    private boolean Tipo;
    private int IDcancion;
    private static int contador;

    public Cancion(String nombre, String artista, String album, int anio, String CancionRoot, String ImageRoot,String LetraRoot, String genero, boolean Tipo) {
        setNoCancion();
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.CancionRoot = CancionRoot;
        this.ImageRoot = ImageRoot;
        this.LetraRoot= LetraRoot;
        this.genero = genero;
        this.Tipo = Tipo;
        this.IDcancion= Cancion.contador;
    }
    
    public Cancion()
    {
        //setNoCancion();
        this.nombre = "NADA";
        this.artista = "NADA";
        this.album = "NADA";
        this.anio = 0000;
        this.CancionRoot = "NADA";
        this.ImageRoot = "NADA";
        this.LetraRoot= "Nada";
        this.genero = "NADA";
        this.Tipo = true;
        //this.IDcancion= Cancion.contador;
    }

    //contador
    public static void setNoCancion(){
        Cancion.contador= Cancion.contador+1;
    }
    
    //contador canciones get
    public static int getNoCanciones()
    {
        return Cancion.contador;
    }
    
    //getters
    
    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getAnio() {
        return anio;
    }

    public String getCancionRoot() {
        return CancionRoot;
    }

    public String getImageRoot() {
        return ImageRoot;
    }

    public String getGenero() {
        return genero;
    }

    public boolean getTipo() {
        return Tipo;
    }

    public int getIDcancion() {
        return IDcancion;
    }

    public String getLetraRoot() {
        return LetraRoot;
    }
    
    
    
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCancionRoot(String CancionRoot) {
        this.CancionRoot = CancionRoot;
    }

    public void setImageRoot(String ImageRoot) {
        this.ImageRoot = ImageRoot;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setIDcancion(int IDcancion) {
        this.IDcancion = IDcancion;
    }

    public void setLetraRoot(String LetraRoot) {
        this.LetraRoot = LetraRoot;
    }
    
    
    
}
