/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos.tarea;

import dao.DAOVecinoCola;
import dao.DAOVecinoLista;
import dao.DAOVecinoPila;
import entity.Vecino;

/**
 *
 * @author benja
 */
public class EstructuraDeDatosTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // pruebaPrincipal();
        
       // vecinoPila();
        vecinoCola();
    }
    
    
    public static void pruebaPrincipal()
    {
        DAOVecinoLista.agregar(new Vecino(1, "Los Crisantemos", 327, 19055338, '8' , "Benjamin", "Elias", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(2, "Los Crisantemos", 321, 19055337, '8' , "Mario", "Elias", "Torres", "Sanchez"));
        DAOVecinoLista.agregar(new Vecino(3, "Los Olivos", 123, 20055338, '8' , "Maria", "Teresa", "Caviedes", "Sanfuente"));
        DAOVecinoLista.agregar(new Vecino(4, "Los Almendros", 326, 18055338, '8' , "Esteban", "Elias", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(5, "Los Almendros", 333, 19000000, '8' , "Cristian", "", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(6, "Los Cipreces", 291, 19055331, '8' , "Marcelo", "Elias", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(7, "Los Cipreces", 300, 19055338, '8' , "Estefan", "Elias", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(8, "Los Ciruelos", 100, 17052338, '8' , "Joseph", "Elias", "Torres", "Seplulveda"));
        DAOVecinoLista.agregar(new Vecino(9, "Los Crisantemos", 239, 9055338, '8' , "Riquelme", "Elias", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(10, "Los Olivos", 432, 6055338, '8' , "Oscar", "Elias", "Mora", "Torres"));
        DAOVecinoLista.agregar(new Vecino(11, "Los Gladiolos", 123, 10055338, '8' , "Mario", "", "Torres", ""));
        DAOVecinoLista.imprimirV();
        
        System.out.println("************Eliminar************************");
        System.out.println( "Eliminado " + DAOVecinoLista.eliminar(19055331));
        System.out.println("************************************");
        DAOVecinoLista.imprimirV();
        System.out.println( "***********AGREGAR******************* ");
        DAOVecinoLista.agregar(new Vecino(33, "Los Gladiolos", 123, 10055338, '8' , "Mario", "", "Torres", ""));
        DAOVecinoLista.imprimirV();
        System.out.println("**************ordenar por apellido**********************");
        DAOVecinoLista.ordernarAlfa();
        DAOVecinoLista.imprimirV();
    }
    
    public static void vecinoPila(){
        System.out.println("************PILA************************");
        DAOVecinoPila.agregar(new Vecino(7, "Los Crisantemos", 327, 19055338, '8' , "Benjamin", "Elias", "Mora", "Torres"));
        DAOVecinoPila.agregar(new Vecino(4, "Los Crisantemos", 321, 19055337, '8' , "Mario", "Elias", "Torres", "Sanchez"));
        DAOVecinoPila.agregar(new Vecino(3, "Los Olivos", 123, 20055338, '8' , "Maria", "Teresa", "Caviedes", "Sanfuente"));
        DAOVecinoPila.imprimirV();
        
        System.out.println("************Agregar************************" + DAOVecinoPila.agregar(new Vecino(1, "Los Olivos", 23, 10055338, '8' , "Maria", "Teresa", "Caviedes", "Sanfuente")));
        
        DAOVecinoPila.imprimirV();
        
        System.out.println("************Eliminar************************");
        System.out.println( "Eliminado " + DAOVecinoPila.sacar());
        DAOVecinoPila.imprimirV();
        
        System.out.println("************ORDENAR RUT************************");
        DAOVecinoPila.ordenarAscendRut();
        DAOVecinoPila.imprimirV();
        
        System.out.println("************ORDENAR ID************************");
        DAOVecinoPila.ordenarAscendId();
        DAOVecinoPila.imprimirV();  
    }
    
     public static void vecinoCola(){
         System.out.println("************ COLA ************************");
        DAOVecinoCola.agregar(new Vecino(7, "Los Crisantemos", 327, 19055338, '8' , "Benjamin", "Elias", "Mora", "Torres"));
        DAOVecinoCola.agregar(new Vecino(4, "Los Crisantemos", 321, 19055337, '8' , "Mario", "Elias", "Torres", "Sanchez"));
        DAOVecinoCola.agregar(new Vecino(3, "Los Olivos", 123, 20055338, '8' , "Maria", "Teresa", "Caviedes", "Sanfuente"));
        DAOVecinoCola.imprimirV();
        
        System.out.println("************Agregar************************" + DAOVecinoCola.agregar(new Vecino(1, "Los Olivos", 23, 10055338, '8' , "Maria", "Teresa", "Caviedes", "Sanfuente")));
        
        DAOVecinoCola.imprimirV();
        
        System.out.println("************Eliminar************************");
        System.out.println( "Eliminado " + DAOVecinoCola.sacar());
        System.out.println("");
        DAOVecinoCola.imprimirV();
        
        System.out.println("************ORDENAR RUT************************");
        DAOVecinoCola.ordenarAscendRut();
        DAOVecinoCola.imprimirV();
        
        System.out.println("************ORDENAR ID************************");
        DAOVecinoCola.ordenarAscendId();
        DAOVecinoCola.imprimirV();  
    
    
    
    
    
    
    }
}
