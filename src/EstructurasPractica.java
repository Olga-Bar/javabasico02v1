import java.util.Scanner;

public class EstructurasPractica {

    /* Actividad 1
    En consola preguntas por la capital de italia. si la aciertas, sumas un punto.
    Luego preguntas por la capita lde portugal. si la aciertas, sumas un punto.
    Si fallas, no restas por ahora.
    Al final, muestras el total de puntos.
    A las 18.00 lo hago yo.

     */
    public static void main(String[] args) {
        //estructura de control condicionales if else switch
        System.out.println("dime la capital de Italia");
        Scanner sc = new Scanner(System.in);
        String ciudad = sc.nextLine();
        int puntos = 0; //totalizador
        if (ciudad.equalsIgnoreCase("Roma")) {
            System.out.println("La ciudad es Roma");
            puntos++;
        }//cierra if
        else{
            System.out.println("La ciudad no es Roma");
        }
        System.out.println("dime la capital de Portugal");
        String ciudad2 = sc.nextLine();
        if (ciudad2.equalsIgnoreCase("Lisboa")) {
            System.out.println("La ciudad es Lisboa");
            puntos++;
        }
        else{
            System.out.println("La ciudad no es Lisboa");

        }
        System.out.println("Tienes " + puntos + " puntos");
    }//cierra main
}//cierra clase
