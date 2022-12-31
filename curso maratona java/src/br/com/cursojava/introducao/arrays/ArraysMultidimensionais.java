package br.com.cursojava.introducao.arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3},   //ou int[][] nums = new int[3][3];
                {3, 4, 5},
                {6, 7, 8}};

        for (int x = 0; x < 3; x++) {  //percorre a dimensao e as posicoes do primeiro array
            for (int j = 0; j < 3; j++) { //percorre a dimensao e as posicoes do segundo array
                System.out.println(nums[x][j]);
            }
        }
    }
}
/**
 * 1) x = 0
 *
 *       y = 0
 *       y = 1
 *       y = 2
 * 2) x = 1
 *       y = 0
 *       y = 1
 *       y = 2
 * 3) x = 2
 *       y = 0
 *       y = 1
 *       y = 2
 *
 *
 *
 *
 */





