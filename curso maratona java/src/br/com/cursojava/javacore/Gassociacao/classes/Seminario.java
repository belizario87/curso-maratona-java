package br.com.cursojava.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;

    }

    public Seminario() {
    }

    public void print() {
        System.out.println("\n---------- RELATORIO DE SEMINARIO -----------");
        System.out.println("Titulo: " + this.titulo);
        if (alunos != null && alunos.length != 0) {
            System.out.print("Os alunos participantes: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + ", ");
            }
        } else {
            System.out.println("Nao ha nenhum aluno inscrito no seminario");
        }
        if (this.professor != null) {
            System.out.println("\nProfessor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Nao ha nenhum professor inscrito no seminario");
        }
        if (this.local != null) {
            System.out.println("Local, rua: " + this.local.getRua() + " Bairro: " + this.local.getBairro());

        } else {
            System.out.println("Nao ha nenhum local cadastrado para esse seminario");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}