package br.edu.iftm.expacotes.testes;

import br.edu.iftm.expacotes.controlesremoto.*;

public class Principal {
    public static void main(String[] args) {
        ControleSansumg controleSansumg = new ControleSansumg();
        ControleLg controleLg = new ControleLg();
        controleLg.ligar();
        controleSansumg.ligar();
    }
}
