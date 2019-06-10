/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cr270
 */
public class Evento {
   protected String nombreEvento;
   protected String ubicacionEvento;
   protected int capacidadEspacio;

    public Evento(String nombreEvento, String ubicacionEvento, int capacidadEspacio) {
        this.nombreEvento = nombreEvento;
        this.ubicacionEvento = ubicacionEvento;
        this.capacidadEspacio = capacidadEspacio;
    }
   public Evento(){
   
   }
   
}
