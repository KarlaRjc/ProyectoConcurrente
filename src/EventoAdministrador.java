/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cr270
 */
public class EventoAdministrador extends Evento {
   private float precio;
   private String artista;
   public EventoAdministrador (String nombreEvento, String ubicacionEvento, int capacidadEspacio, float precio, String artista){
        super(nombreEvento, ubicacionEvento,capacidadEspacio);
        this.precio = precio;
        this.artista = artista;
   }
   public EventoAdministrador(){
        
   }
   
}
