/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Automovil.partes.Llanta;
import Automovil.partes.Motor;
import Automovil.partes.Puerta;
import Automovil.auto.Automovil;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setNumeroSerie("123");
        //...
        Llanta l1 = new Llanta();
        l1.setModelo("12");
        //...
        Puerta puerta = new Puerta();
        //...
        Automovil auto = new Automovil();
        auto.setMarca("bbb");
        auto.addPuerta(puerta);
        auto.addLlanta(l1);
        auto.replaceMotor(motor);
        
        
    }
    
}
