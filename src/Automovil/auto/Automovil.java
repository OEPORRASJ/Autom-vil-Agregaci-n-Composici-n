package Automovil.auto;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import Automovil.partes.Llanta;
import Automovil.partes.Motor;
import Automovil.partes.Puerta;
public class Automovil {
    
    //Atributos propios
    private String marca;
    private int annio;
    private String modelo;
    
    
    //Atributos dados por la relación Agregación o Composición
    private Llanta[] llantas;
    private Puerta[] puertas;
    private Motor[] motor;
    
    
    
    
    
    public Automovil(){
        this.llantas = new Llanta[4];
        this.puertas = new Puerta[4];
        this.motor = new Motor[1];
        
    }
    
    //Metodos de relación Agregación
    //Motor
    public Motor[] getMotor(){
        return this.motor;
    }
    
    public void replaceMotor(Motor motor){
        
    }
    
    
    //Llantas
    public Llanta[] getLlanta(){
        return this.llantas;
    }
    
    public Llanta[] setLlantas()
    
    
    
    public boolean addLlanta(Llanta llanta){
        return false;
    }
    
    public boolean removeLlanta(Llanta llanta){
        return false;
    }
    
    //Puertas
    public Puerta[] getPuerta(){
        return this.puertas;
    }
    
    public boolean addPuerta(Puerta puerta){
        return false;
    }
    
    public boolean removePuerta(Puerta puerta){
        return false;
    }
    
    
    
    //Getters and Setters of Automovil

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
    
    
    
}
