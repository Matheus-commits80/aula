public class Main {
    public static void main(String[] arg){

        int[][] numeros = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        // System.out.println(numeros[2][2]);
        
        // for(int i = 0; i < 4; i++){
        //     for(int j = 0; j < 4; j++){
        //         System.out.println(numeros[i][j]);
        //     }
        // }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                numeros [i][j] = 67;
                System.out.println(numeros[i][j]);
            }
        }
    }
}