package br.com.cursojava.javacore.Gassociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public Professor() {
    }

    public void print() {
        System.out.println("---------- RELATORIO DE PROFESSOR -----------");

        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminario != null && seminario.length != 0) {
            System.out.print("Seminarios participantes: ");
            for (Seminario sem : seminario) {
                System.out.print(sem.getTitulo() + ", ");
            }
        } else {
            System.out.println("Professor nao vinculado em nenhum seminario");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}