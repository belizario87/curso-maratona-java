package br.com.cursojava.introducao.estruturascondicionais;

public class EstruturasCondicionaisTernario {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        status = idade > 18 ? "E um adulto" : "Nao e um adulto";
        System.out.println(status);

    }
}
/***
 * variavel = condicao true ou false ? primeira condicao(if) : segunda condicao (else)
 *
 */