package br.com.cursojava.javacore.Fmodificadorestatico.classes;

public class Carro {
    // Velocidade limite deve ser de no maximo 240km/h
    private String nome;          // ATRIBUTOS
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;


    public void imprimeCarrro() {
        System.out.println("-----------------------");
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + this.velocidadeLimite);
        passouAcimaDaVelocidadeLimite();
    }

    public void passouAcimaDaVelocidadeLimite() {

        double acimaOuAbaixoLimite = this.velocidadeMaxima - this.velocidadeLimite;

        if (acimaOuAbaixoLimite > 0) {
            System.out.println("O carro passou do limite em: " + acimaOuAbaixoLimite + "Km");

        }
        else {
            System.out.println("O carro esta dentro do limite de velocidade");
        }


    }
    public Carro(String nome, double velocidadeMaxima) {   //CONSTRUTOR DE OBJETO
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {     // CONSTRUTOR DE OBJETO VAZIO
    }


    public static double getVelocidadeLimite() {

        return Carro.velocidadeLimite;
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
       Carro.velocidadeLimite = velocidadeLimite;
    }


    public String getNome() {   //GETERS AND SETERS
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }




}
