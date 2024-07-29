import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        //Aritméticos + - * / %
        int a = 5;
        float b = 2;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b)); //resto de la división

        //operadores de asignación = += -= *= /= %=
        int c = 5;
        c += 3; //c = c + 3
        System.out.println("c: " + c);

        //operadores relacionales == != > < >= <=
        int d = 5;
        int e = 3;
        if(d == e){
            System.out.println("d es igual a e");
        }//cierra if
        else{
            System.out.println("d es diferente a  e");
        }//cierra else

        //operadores lógicos && || !
        int f = 5;
        int g = 4;
        if(f == 5 && g == 4){
            System.out.println("f es igual a 5 y g es igual a 3");
        }//cierra if
        else{
            System.out.println("f es diferente a 5 y g es diferente a 3");
        }//cierra else

        //preguntar un dato a la consola y guardarlo en una variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        //preguntar un número
        System.out.println("Ingresa tu edad: ");
        Scanner scanner2 = new Scanner(System.in);
        int edad = scanner2.nextInt();
        System.out.println("Tu edad es: " + edad);

    }//cierra main
}//cierra clase
