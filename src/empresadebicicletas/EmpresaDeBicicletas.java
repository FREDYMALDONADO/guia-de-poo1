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
public class EmpresaDeBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Lista de los precios de los productos // 
        
     Lista Precios = new Lista();
       Precios.Frenos ="2.50";
       Precios.Cables = "1.75";
       Precios.Rin= "7.00";
       Precios.Diomaticos = "3.50";
       Precios.Llanta="5.00"; 
       Precios.Pedales = 8.00;
       Precios.Valeros = 1.00;
       Precios.Piñones= 5.00;
       Precios.Cadena = 6.00;
       Precios.Montura = 5.50;
       Precios.Manejadera= "8.00"; 
       Lista.ConexionDeRed = "repuestos";
        Lista.Imprimir(Precios);
           
      Lista Servicios= new Lista();
         Servicios.Horarios =" De Lunes a Viernes de 7:00/am a 3:00/pm";
   Servicios.Pintura =" Pintamos su Bicicleta como le gusto"; 
    Servicios.Limpieza = " Limpiamos y engrazamos su bicicleta";
     Servicios.Mecanica =" Armamos su bicicleta al instante";
        
        
        
    }
    
}
