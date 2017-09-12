/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Vecino;

/**
 *
 * @author benja
 */
public class DAOVecinoLista {
    private static Vecino raiz;
     
    public static boolean agregar(Vecino vec){
                   
        if (raiz==null) {
            raiz = vec;
            return true;
        }
         
        Vecino aux = raiz;
         
        while(aux.nSig != null)
        {
            aux = aux.nSig;
        }
        aux.nSig = vec;
         
        return true;
    }
    
    public static void imprimirV()
    {
        Vecino aux = raiz;
        
        while(aux !=null)
        {
            aux.imprimir();
            aux = aux.nSig;
        }
    }
    
    public static boolean eliminar(int rut){
        Vecino aux = raiz;
        
        if (raiz.getRut() ==  rut) {
            raiz = null;
            return true;
        }
        while(aux !=null)
        {
            if (aux.nSig.getRut() == rut) {
                aux.nSig = aux.nSig.nSig;
                return true;
            }
            aux = aux.nSig;
        }     
        return false;
    }
    
    public static boolean modificar(Vecino vec)
    {
        Vecino aux = raiz;
        
        if (raiz.getRut() == vec.getRut()) {
            raiz = vec;
            return true;
        }
        
        while(aux!=null)
        {
            if(aux.nSig.getRut() == vec.getRut())
            {
                aux.nSig.setNombrePasaje(vec.getNombrePasaje());
                aux.nSig.setNumeroCasa(vec.getNumeroCasa());
                aux.nSig.setPrimerNombre(vec.getPrimerNombre());
                aux.nSig.setSegundoNombre(vec.getSegundoNombre());
                aux.nSig.setApPaterno(vec.getApPaterno());
                aux.nSig.setApMaterno(vec.getApMaterno());
                return true;
            }
            aux = aux.nSig;
            
        }
        return true;    
    }
    
    public static Vecino buscar(int rut){
        Vecino aux = raiz;
        if (raiz.getRut() == rut) {
            return raiz;
        }
        while(aux !=null){
            if (aux.nSig.getRut() == rut) {
                return aux.nSig;
            }
            aux = aux.nSig;
        }
        return null;
    }
    
    //vaciar los elementos
    public static void vaciar(){
        raiz = null;
    }
    
    //agregar Inicio
    public static void agregarInicio(Vecino vec){
       Vecino aux = raiz;
       raiz = vec;
       raiz.nSig = aux;
    }
    
    public static Vecino sacarInicio(){
        Vecino aux = raiz;
        raiz = raiz.nSig;
        aux.nSig = null;
        return  aux;
    }
    
    public  static Vecino sacarFinal(){
        if (raiz == null) {
            raiz = null;
            return null;
        }
        if (raiz.nSig == null) {
            Vecino aux3 = raiz;
            raiz = null;
            return aux3;
        }
        
        Vecino aux = raiz;
        while(aux.nSig.nSig != null){
            aux = aux.nSig;
        }
        
        Vecino aux2 = aux.nSig;
        aux.nSig = null;
        return aux2;
    }
    
    
    public static int contador(){
        int x=0;
        Vecino aux = raiz;
        while(aux !=null){
            x++;
            aux = aux.nSig;
        }
        return x;
    }
    
    
    //Odenar de forma Ascendente
    public static void ordenarAscend(){
        int n = contador();
        boolean cambio = true;
        
        while(cambio){
            cambio = false;
            for (int i = 1; i < n; i++) {
                if (getPosicion(i).getRut() > getPosicion(i+1).getRut()) {
                    intercambiar(i);
                    cambio = true;
                }
            }
        
        }
        
    }
    
    public static Vecino getPosicion(int x){
        Vecino aux = raiz;
        int cont = 1;
        
        while(aux !=null){
            if (cont == x) {
                return aux;
            }
            aux = aux.nSig;
            cont++;
        }
        return null;
    }
    
    public static void intercambiar(int y){
        // x, [y] , [z] , w
        // x , [z] , [y], w
        if (y!=1 && getPosicion(y) !=null && getPosicion(y+1) !=null) {
            Vecino posX = getPosicion(y-1);
            Vecino posY = getPosicion(y);
            Vecino posZ = getPosicion(y+1);
            Vecino posW = getPosicion(y+2);
            
            posX.nSig = posZ;
            posY.nSig = posW;
            posX.nSig.nSig= posY; 
        }
        if (y==1 && getPosicion(y)!=null && getPosicion(y+1) != null ) {
            Vecino posX = raiz;
            Vecino posY = getPosicion(y+1);
            Vecino posZ = getPosicion(y+2);
            
            posX.nSig = posZ;
            raiz = posY;
            posY.nSig = posX;
        }        
    }
    
    /// ordenar por letra
    public static void ordernarAlfa(){
        int n = contador();
        
        boolean cambio = true;
        
        while(cambio){
            cambio = false;
            for (int i = 1; i < n; i++) {
                if (getPosicion(i).getApPaterno().compareTo(getPosicion(i+1).getApPaterno())>0) {
                    intercambiar(i);
                    cambio = true;
                }
            }
        }
        
    }
}
