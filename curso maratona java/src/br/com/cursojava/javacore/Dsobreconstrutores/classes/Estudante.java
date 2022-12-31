package br.com.cursojava.javacore.Dsobreconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double i : notas) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + this.dataMatricula);
    }
    public Estudante(String matricula, String nome, double[] notas) {  //Construtor
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {  //Construtor2 por causa da insercao do atributo datamatricula
        this(matricula,nome,notas);     //chamando o primeiro construtor
        this.dataMatricula = dataMatricula;
    }

    public Estudante (){

    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {      //Getters and Setters
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
