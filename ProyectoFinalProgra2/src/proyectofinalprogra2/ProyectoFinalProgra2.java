/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalprogra2;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author luiss
 */
public class ProyectoFinalProgra2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Anadir las canciones a Datos Globales
        Canciones();
        
        MenuPrincipal holainge= new MenuPrincipal();
        holainge.setVisible(true);
        holainge.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public  static void Canciones()
    {
        Cancion cancion1= new Cancion("Unsainted","Slipknot","We Are Not Your Kind",2019,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Unsainted.wav","src/AlbumCovers/SlipknotAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\Unsainted.txt","Metal",true);
        DatosGlobales.addCancion(cancion1);
        Cancion cancion2= new Cancion("m.A.A.d city","Kendrick Lamar","Good Kid",2012,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/madcity.wav","src/AlbumCovers/KendrickAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\madcity.txt","Hip-Hop",true);
        DatosGlobales.addCancion(cancion2);
        Cancion cancion3= new Cancion("Summertime Sadness","Lana Del Rey","Born To Die",2012,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/SummerSad.wav","src/AlbumCovers/LanaReyAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\SummerSad.txt","Trip-Hop",true);
        DatosGlobales.addCancion(cancion3);
        Cancion cancion4= new Cancion("Estilazo","Marshmello ft. Tokischa","Sencillo",2022,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Estilazo.wav","src/AlbumCovers/EstilazoAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\Estilazo.txt","Urbano Latino",true);
        DatosGlobales.addCancion(cancion4);
        
        //Otra 6 jijiji
        Cancion cancion5= new Cancion("Agora Hills","Doja Cat","Scarlet",2023,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Agora.wav","src/AlbumCovers/AgoraAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\Agora.txt","Hip-Hop y rap",true);
        DatosGlobales.addCancion(cancion5);
        Cancion cancion6= new Cancion("OTRA NOCHE EN MIAMI","Bad Bunny","X100PRE",2018,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Miami.wav","src/AlbumCovers/BadBunnyAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\miami.txt","Urbano Latino",true);
        DatosGlobales.addCancion(cancion6);
        Cancion cancion7= new Cancion("Welcome to the Family","Avenged Sevenfold","Nightmare",2010,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Welcome.wav","src/AlbumCovers/AvengedAlbum.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\Welcome.txt","Heavy metal y Rock",true);
        DatosGlobales.addCancion(cancion7);
        
        Cancion cancion8= new Cancion("Silence Between Songs","Madison Beer","Silence",2023,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Silence.wav","src/AlbumCovers/Madison.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\Silence.txt","Pop y Rock psicodelico",true);
        DatosGlobales.addCancion(cancion8);
        Cancion cancion9= new Cancion("Style","Taylor Swift","1989",2014,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/Styles.wav","src/AlbumCovers/Taylor.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\Styles.txt","Pop y Synth pop",true);
        DatosGlobales.addCancion(cancion9);
        Cancion cancion10= new Cancion("Tummy Hurts","Reneé Rapp","Snow Angel",2023,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/TummyHurts.wav","src/AlbumCovers/Renne.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\TummyHurts.txt","Pop",true);
        DatosGlobales.addCancion(cancion10);
        
        //Una mas c:
        Cancion cancion11= new Cancion("Ni**as in Paris","Ye ft. Jay Z","Watch The Throne",2011,"file:/D:/Universidad/Segundo Semestre/Progra II/Tercera Unidad/CancionesWAV/InParis.wav","src/AlbumCovers/Kanye.jpg","D:\\Universidad\\Segundo Semestre\\Progra II\\Tercera Unidad\\LetraCancionesWAV\\InParis.txt","Hip-Hop Industrial",true);
        DatosGlobales.addCancion(cancion11);
        
        DatosGlobales.addReciente(cancion7);
        DatosGlobales.addReciente(cancion9);
        DatosGlobales.addReciente(cancion8);
        DatosGlobales.addReciente(cancion11);
    }
    
}
