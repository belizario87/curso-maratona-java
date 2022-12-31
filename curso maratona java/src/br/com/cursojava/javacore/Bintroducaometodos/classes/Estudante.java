package br.com.cursojava.javacore.Bintroducaometodos.classes;

// Crie uma classe estudante com os seguintes atributos
// Nome, Idade, Notas (3 notas)
// Crie um metodo para imprimir os dados e tirar a media desse aluno
// caso a media seja maior que 6 imprimir: aprovado, senao reprovado.
public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprimirDados() {
        if (nome == null)
            System.out.println("Voce deve colocar um nome");

        else {
            System.out.println("Nome: " + this.nome);
        }
        if (idade < 0) {
            System.out.println("Voce nao pode colocar uma idade menor do que zero(0)");
            return;
        } else {
            System.out.println("Idade: " + this.idade);
        }
        if (this.notas != null)
            for (double i : this.notas) {
                System.out.print(i + " ");
            }
    }

    public void imprimirMedia() {
        double media = 0;
        this.aprovado = true;
        if (this.notas == null) {
            System.out.println("O aluno nao possui notas suficiente");
            return;
        }
        for (double i : this.notas) {
            media += i;
        }
        media = media / this.notas.length;
        if (media > 6 && this.aprovado) {
            System.out.println("\nA media foi: " + media + " situacao: Aprovado");
        } else {
            this.aprovado = false;
            System.out.println("\nA media foi: " + media + " situacao: Reprovado");
        }
    }


    //getters and setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

}




