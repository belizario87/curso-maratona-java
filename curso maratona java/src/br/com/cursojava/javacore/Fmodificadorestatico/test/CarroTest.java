package br.com.cursojava.javacore.Fmodificadorestatico.test;
import br.com.cursojava.javacore.Fmodificadorestatico.classes.Carro;
public class CarroTest {

    public static void main(String[] args) {


        Carro car = new Carro("BMW",320);
        Carro car1 = new Carro("Mercedes", 300);
        Carro car2 = new Carro("Corsa", 170);


        car.imprimeCarrro();

        car1.imprimeCarrro();

        car2.imprimeCarrro();


        System.out.println("###################################");





    }
}
