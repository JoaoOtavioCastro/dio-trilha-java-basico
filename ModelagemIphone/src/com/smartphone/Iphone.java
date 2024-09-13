package com.smartphone;

import com.aparelhotelefonico.AparelhoTelefonico;
import com.navegadorinternet.NavegadorInternet;
import com.reprodutormusica.ReprodutorMusica;

public class Iphone  implements ReprodutorMusica, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " pelo Iphone");
    }

    @Override
    public void atender(boolean atender) {
        if (atender) {
            System.out.println("Atendendo chamada no Iphone");
        } else {
            System.out.println("Desligando chamada no Iphone");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

    @Override
    public void enviaMensagemDeTexto(String numero, String mensagem) {
        System.out.println("Enviando mensagem '"+mensagem+"' para " + numero + " pelo Iphone");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página " + url + " no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba no Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + " no Iphone");
    }

    @Override
    public void selecionarAlbum(String album) {
        System.out.println("Selecionando álbum " + album + " no Iphone");
    }
    
}
