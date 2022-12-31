package br.com.cursojava.javacore.Fmodificadorestatico.test;

import br.com.cursojava.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo a quantidade de parcelas possiveis ");
//        for(int i : Cliente.getParcelas()){
//            System.out.print(i + " ");
//        }
        System.out.println("Tamanho = " + c.getParcelas().length);
        System.out.println("Tamanho = " + c1.getParcelas().length);
        System.out.println("Tamanho = " + c2.getParcelas().length);



    }
}
