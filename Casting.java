public class Casting {
    public static void main(String[] args){

        int MinhaIdadeInt = 23;

        //Fazendo a conversão de tipo de dados;
        double MinhaIdadeDouble = MinhaIdadeInt;

        System.out.println(MinhaIdadeInt);
        System.out.println(MinhaIdadeDouble);

        System.out.println("");
        System.out.println("========= CASTING DE REDUÇÃO ! ========= ");
    
        double mydouble = 100.12;
        int myint = (int) mydouble;

        System.out.println(mydouble);
        System.out.println(myint);

    }
}
