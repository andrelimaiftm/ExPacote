package br.edu.iftm.expacotes.controlesremoto;

import br.edu.iftm.expacotes.interfaces.Controlador;

public class ControleLg implements Controlador{

    @Override
    public void ligar() {
        System.out.println("LG: TV esta ON");
        
    }
    
}
