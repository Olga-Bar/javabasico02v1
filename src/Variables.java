import java.time.LocalDate;
import java.time.LocalTime;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Tipos de variables");
        //declarar variables primitivas
        int numeroEntero = 10;
        double numeroDecimal = 10.5;
        float numeroDecimalFloat = 10.5f;
        char letra = 'a';
        boolean verdadero = true;

        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("el total es " + numeroDecimal*numeroDecimalFloat);
        System.out.println("letra = " + letra);
        System.out.println("verdadero = " + verdadero);

        //Boxing : convierte un tipo primitivo a un objeto de su clase envolvente
        Integer numeroEnteroObjeto = Integer.valueOf(numeroEntero);
        System.out.println("numeroEnteroObjeto = " + numeroEnteroObjeto);

        String mensaje= "En un lugar de la mancha"; //objeto de la clase String
        //las clases envolvente pertenecen al paquete java.lang
        System.out.println("mensaje = " + mensaje);
        System.out.println("Mayusculas" + mensaje.toUpperCase());
        System.out.println("letra en posición 10 " + mensaje.charAt(4));

        LocalDate fechaActual= LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        LocalTime horaActual= LocalTime.now();
        System.out.println("horaActual = " + horaActual);

    }//cierra de metodo main
}//cierra clase