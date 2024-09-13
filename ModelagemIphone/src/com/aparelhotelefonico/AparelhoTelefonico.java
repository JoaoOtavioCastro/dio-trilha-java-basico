package com.aparelhotelefonico;

public interface AparelhoTelefonico {
    public void ligar(String numero);
    public void atender(boolean atender);
    public void iniciarCorreioVoz();
    public void enviaMensagemDeTexto(String numero, String mensagem);
}
