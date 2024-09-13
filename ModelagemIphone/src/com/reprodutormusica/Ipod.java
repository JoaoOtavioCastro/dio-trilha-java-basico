package com.reprodutormusica;

public class Ipod implements ReprodutorMusica{

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + " no iPod");
    }

    @Override
    public void selecionarAlbum(String album) {
        System.out.println("Selecionando álbum " + album + " no iPod");
    }

}
