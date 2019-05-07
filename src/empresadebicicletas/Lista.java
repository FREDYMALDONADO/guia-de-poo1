/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadebicicletas;

/**
 *
 * @author Fredys
 */
public class Lista {// se crea la clase lista y objetos//

   
    static String ConexionDeRed;
    static Object Servicios;
    
   
    
    public static void Imprimir(Lista p){ // se crea el contructor
        System.out.println("");
         System.out.println("Repuestos/Precios ");
        //Declaracion de variables//
        System.out.println("Frenos:" + String.valueOf(p.Frenos));
        System.out.println("Cables:" + String.valueOf(p.Cables));
        System.out.println("Rin:" + String.valueOf(p.Rin));
        System.out.println("Diomaticos:" + String.valueOf(p.Diomaticos));
        System.out.println("Llanta:" + String.valueOf(p.Llanta));
        System.out.println("Pedales:" + String.valueOf(p.Pedales));
        System.out.println("Valeros:" + String.valueOf(p.Valeros));
        System.out.println("Piñones:" + String.valueOf(p.Piñones));
        System.out.println("Cadena:" + String.valueOf(p.Cadena));
        System.out.println("Montura:" + String.valueOf(p.Montura));
        System.out.println("Manejadera:" + String.valueOf(p.Manejadera));
        System.out.println();
        //Servicios de nuestra empresa//
       System.out.println("Nuestros servicios son:");
         System.out.println("Horarios:" + String.valueOf(p.Horarios));
        System.out.println("Pintura:" + String.valueOf(p.Pintura));
        System.out.println("Limpieza:" + String.valueOf(p.Limpieza));
        System.out.println("Mecanica:" + String.valueOf(p.Mecanica));
        System.out.println();
        System.out.println("Salir:");

   
    }
   public Lista(){
      Frenos ="";
     Cables ="";
     Rin ="";
     Diomaticos ="";
     Llanta ="";
     Pedales = 0.0;
     Valeros = 0.0;
     Piñones = 0.0;
     Cadena = 0.0;
     Montura = 0.0;
     Manejadera ="";
     Horarios =" De Lunes a Viernes de 7:00/am a 3:00/pm";
    Pintura =" Pintamos su Bicicleta como le gusto"; 
    Limpieza = " Limpiamos y engrazamos su bicicleta";
     Mecanica =" Armamos su bicicleta al instante";
   
       
    }
   
    
  //Productos//  
  public String Frenos;
  public String Cables;
  public String Rin;
  public String Diomaticos;
  public String Llanta;
  public double Pedales;
  public double Valeros;
  public double Piñones;
  public double Cadena;
  public double Montura;
  public String Manejadera;
 //Servicios de nuestra empresa//
  public String Horarios;
  public String Pintura; 
   public String Limpieza;
    public String Mecanica;
}


