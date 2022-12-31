package br.com.cursojava.javacore.Eblocodeinicializacao.teste;

import br.com.cursojava.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        System.out.println("Exibindo a quantidade de parcelas possiveis ");
        Cliente c = new Cliente();
        System.out.println(c.getParcelas());

    }
}
