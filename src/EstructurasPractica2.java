import java.util.Random;

public class EstructurasPractica2 {

    /*Activdad
    Tienes que lanzar el dado hasta que saques un 5
    dime cuántas veces has necesitado lanzar el dado
    A las 18.40 lo hago yo.

     */

    public static void main(String[] args) {
        Random r = new Random();
        int tirada = 0;
        int contador = 0;

        do{
            tirada = r.nextInt(6)+1;
            contador++;
            System.out.println("Tirada " + contador + " ha salido " + tirada);
        }
        while(tirada!=5);

        }//cierra main


}//cierra clase
