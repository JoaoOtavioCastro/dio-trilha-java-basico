package com.aparelhotelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " pelo telefone comum");
    }

    @Override
    public void atender(boolean atender) {
        if (atender) {
            System.out.println("Atendendo a ligação pelo telefone comum");
        } else {
            System.out.println("Desligando a ligação pelo telefone comum");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo telefone comum");
    }

    @Override
    public void enviaMensagemDeTexto(String numero, String mensagem) {
        System.out.println("Enviando mensagem '" + mensagem + "' de texto para " + numero + " pelo telefone comum");
    }

}
