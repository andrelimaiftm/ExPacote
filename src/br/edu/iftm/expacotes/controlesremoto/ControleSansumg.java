package br.edu.iftm.expacotes.controlesremoto;

import br.edu.iftm.expacotes.interfaces.Controlador;

public class ControleSansumg implements Controlador{

    @Override
    public void ligar() {
        System.out.println("Sansumg: ligou a TV");        
    }
    
}
