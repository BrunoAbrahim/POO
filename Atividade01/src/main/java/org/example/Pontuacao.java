package org.example;

public class Pontuacao {
    private int pontos;

    public int getPontuacao() {
        return pontos;
    }
    public int adicionarPontos(int pontos) {
        this.pontos += pontos;
        return pontos;
    }
    public void removerPontos(int pontos) {
        if (pontos > 0 && this.pontos >= pontos) {
            this.pontos -= pontos;
        }
    }
}
