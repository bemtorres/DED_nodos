/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author benja
 */
public class Vecino {

    private int id;
    
    private String nombrePasaje;
    private int numeroCasa;
    
    private int rut;
    private char dv;
    private String primerNombre;
    private String segundoNombre;
    private String apPaterno;
    private String apMaterno;
    
    public Vecino nSig;
    
    public Vecino() {
    }
    
    public Vecino( int id, String nombrePasaje, int numeroCasa, int rut, char dv, String primerNombre, String segundoNombre, String apPaterno, String apMaterno) {
        this.id = id;
        this.nombrePasaje = nombrePasaje;
        this.numeroCasa = numeroCasa;
        this.rut = rut;
        this.dv = dv;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePasaje() {
        return nombrePasaje;
    }

    public void setNombrePasaje(String nombrePasaje) {
        this.nombrePasaje = nombrePasaje;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", nombrePasaje=" + nombrePasaje + ", numeroCasa=" + numeroCasa + ", rut=" + rut + ", dv=" + dv + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + '}';
    }
 
   
    public void imprimir()
    {
        System.out.println(this.toString());
    }

  
    
    
}
