public class VariablesPractica {

    /*
    Muestra en consola la salida siguiente:
    Un texto en mayusculas con el título de la actividad : PRÁCTICA DE VARIABLES
    Un texto en minúsculas con la descripción de la actividad : declarar variables primitivas
    declara precio 9.95, unidades 25 y descuento 0.05 = calcula el total y lo muestras por consola
    muestra la fecha actual pero en formato dd/MM/yyyy
     */
    public static void main(String[] args) {
        String titulo = "Práctica de variables";
        String subtitulo = "Declarar variables primitivas";
        System.out.println(titulo.toUpperCase());
        System.out.println(subtitulo);
        double precio = 9.95;
        float precioFloat = 9.95f;
        int unidades = 25;
        double descuento = 0.05;
        float descuentoFloat = 0.05f;
        double total = precio * unidades * (1 - descuento);
        float totalFloat = precioFloat * unidades * (1 - descuentoFloat);
        System.out.println("El total es: " + total);
        System.out.println("El totalFloat es: " + totalFloat);
        System.out.println("Fecha actual: " + java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }//cierra de metodo main

}//cierra clase
