public class Matrizes_Multidimensional {
    public static void main(String[] args){
        System.out.println("MATRIZES MULTIDIMENSIONAL");

        String[][] nomes = {{"Ruan", "carlos"}, {"tavares", "reis"}};
        nomes[0][1] = "asdf";
        System.out.println(nomes[0][1]);


        int[][] numeros = {{1,2,3,4}, {5,6,7,8}};

        for (int x = 0; x < numeros.length; x++){
            for(int y=0; y < numeros[x].length; y++){
                System.out.println(numeros[x][y]);
            }
        }

        System.out.println(0.0 / 0.0);

    }
}
