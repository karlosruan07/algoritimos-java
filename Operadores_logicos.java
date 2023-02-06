
public class Operadores_logicos {
    public static void main(String[] args){
        System.out.println("OPERADORES LÓGICOS NO JAVA !! \n");

        double num1 = 10;
        double num2 = 11;
        double num3 = 12;

        System.out.println(num1 < num2 && num2 < num3 );
        System.out.println(num1 > num2 && num2 > num3);

        System.out.println(num1 < num2 || num2 < num1 || num2 > num3 || num1 > num3);
        System.out.println(!(num1 < num2 || num2 < num3));// sinal de ! inverte um valor.

                

    }

}
