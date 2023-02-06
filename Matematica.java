public class Matematica {
    public static void main(String[] args){
        System.out.println("MATEMÁTICA NO JAVA !!\n");

        System.out.println(Math.min(5,10));//retorna o menor valor
        System.out.println(Math.max(5,10));//retorna o maior valor

        System.out.println(Math.sqrt(49));//retorna a raiz quadrada
        System.out.println(Math.abs(-5.1));//retorna o número inteiro

        System.out.println(Math.random());//retorna um número com ponto flutuante ente 0 e 1.
        int num1 = (int) (Math.random() * 4); //faz uma conversão (casting) para int, depois multiplica o numero aleatório por 4, sorteia de 0 a 3 pois o útimo é excluído
        System.out.println(num1);


    }
}
