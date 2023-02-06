public class If_ternario {
    public static void main(String[] args){
        System.out.println("If Ternário no java !! \n");

        int hora = 10;

        String resul = (hora >= 1 && hora <= 12) ? "Bom dia" : "Boa tarde";

        System.out.println(resul);

        System.out.println(hora >= 1 && hora <= 12 ? "Bom dia !" : "Boa tarde !");
        
    }
}
