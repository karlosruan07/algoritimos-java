public class Variables {
    public static void main(String[] args){
        System.out.println("Variáveis no Java !!");
        System.out.println("");

        String nome = "Ruan";
        System.out.println(nome);

        int idade = 23;
        System.out.println(idade);

        float peso = 70.5f;
        System.out.println(peso);

        char PrimeiraLetra = 'R';
        System.out.println(PrimeiraLetra);

        boolean casado = false;
        System.out.println(casado);

        byte mynum1 = 100;
        System.out.println(mynum1);

        short mynum2 = 5000;
        System.out.println(mynum2);

        long mynum3 = 1500000000000L;//é usado quando o int não suportar mais valores, tem que colocar o L maiúculo no final
        System.out.println(mynum3);

        double mynum4 = 19.99d;
        System.out.println(mynum4);

        //Para definir uma variável contante usase a palavra chave "final"

        final String MeuComputador = "Samsung";
        System.out.println(MeuComputador);


        int x = 100, y = 200, z = 300;
        System.out.println(x+y+z);
        
        

    }
}
