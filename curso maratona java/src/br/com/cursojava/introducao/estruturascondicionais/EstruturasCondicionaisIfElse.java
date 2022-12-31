package br.com.cursojava.introducao.estruturascondicionais;

public class EstruturasCondicionaisIfElse {
    public static void main(String[] args) {
        // Idade <= 15 : esta na categoria infantil
        // Idade > 15 e Idade < 18 : esta na categoria juvenil
        // Idade >= 18 : Esta na categoria adulto
        int idade = 22;
        String categoria;

        if(idade <= 15){
            categoria = "Infantil";
        }
        else if (idade > 15 && idade < 18) {
            categoria = "Juvenil";
        }
        else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}

/***
 * if ( comparacao que retorna um valor boolean true ou false)
 * else if ( comparacao que retorna um valor boolean true ou false)
 * else
 *
 *
 */