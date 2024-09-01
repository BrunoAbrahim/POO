package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluido;

    public Tarefa(String nome, String date){
        this.nome = nome;
        this.prazo = date;
        this.concluido = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluido;
    }
    public void concluirTarefa(){
        this.concluido = true;
    }

    public void alterarPrazo(String date){
        this.prazo = date;
    }
}
