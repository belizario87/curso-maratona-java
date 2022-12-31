package br.com.cursojava.javacore.Aintroducaoclasses.test;

import br.com.cursojava.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "Lfv5487";
        carro.modelo = "NewCivic";
        carro.ano = 87;
        carro.velocidadeMaxima = 150;
        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
        System.out.println(carro.ano);

    }



}
