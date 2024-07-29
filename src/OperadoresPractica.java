import java.util.Scanner;

public class OperadoresPractica {

    /*
    Por consola pide la fruta que prefieres
    si es manzana o melón te muestra que no tenemos, agotado. El resto sí
    Me pregunta cuántos kilos quiero
    Me dice el precio total : los kilos por 5.75
    Muestra el total rendodeado a 2 decimales
    A las 17.10 lo hago yo
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué fruta prefieres?");
        String fruta = scanner.nextLine();
        if(fruta.equals("manzana") || fruta.equals("melón")){
            System.out.println("Lo siento, fruta agotada");
        }//cierre if
        else{
            System.out.println("¿Cuántos kilos quieres?");
            float kilos = scanner.nextFloat();
            float total = kilos * 5.72f;
            System.out.println("El precio total es: " + Math.round(total * 100.0) / 100.0);
        }//cierre else
    }//cierre main


}//cierre clase
