package com.navegadorinternet;

public class Laptop implements NavegadorInternet {

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página " + url + " no laptop");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no laptop");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no laptop");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba no laptop");
    }

}
