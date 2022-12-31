package br.com.cursojava.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Luffy";
        nomes[3] = "Kurama";


        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
/***
 * #REGRA DE INICIALIZACAO DE ARRAYS
 *
 * byte, short, long, int, double, float = 0 (inicializam com 0)
 * char = 'u\0000' ( representa unicode com espaco vazio)
 * boolean = false
 * reference = null (objetos)
 */