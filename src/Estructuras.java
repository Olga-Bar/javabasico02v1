public class Estructuras {
public static void main(String[] args) {
    //estructura de control condicionales if else switch
    String ciudad="Córdoba";
    if(ciudad.equals("Sevilla"))
        System.out.println("La ciudad es Sevilla");

    String autor="Cervantes";
    if(autor.equals("Cervantes"))
        System.out.println("El autor es Cervantes");
    else
        System.out.println("El autor no es Cervantes");

    String producto="libro";
    if(producto.equals("libro"))
        System.out.println("El producto es un libro");
    else if(producto.equals("dvd"))
        System.out.println("El producto es un dvd");
    else
        System.out.println("El producto no es ni un libro ni un dvd");

    int dia=1;
    switch(dia){
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Día no válido");
    }
    // *** Con programación funcional podemos trabajar con condicionales "diferente" pero más eficiente.


    //estructuras de bucle for while do while
    //for si conoces cuántas veces se va a repetir el bucle
    for(int i=0;i<5;i++){
        System.out.println("i vale " + i);
    }
    System.out.println("Fin del bucle for");
    //while cuando No conoces cuántas veces se va a repetir el bucle porque depende de una condición
    int j=5;
    System.out.println(Math.round(Math.random()*10));
    while(j!=Math.round(Math.random()*10)){
        System.out.println("No has acertado el número");

    }
    System.out.println("Fin del bucle while");
    //do while se ejecuta al menos una vez, y luego comprueba la condición

//for recorre un número de items conocido
//while recorre un número de items desconocido hasta que se cumpla una condición
//do while recorre un número de items desconocido al menos una vez, y luego comprueba la condición

    //estructuras de control de salto break continue
for(int x=0;x<10;x++) {
    if (x == 5)
        //break;//sale del bucle
        continue;//salta la iteración actual pero continua con el bucle
    System.out.println("x vale " + x);
}//cierra for

}//cierra main


}//cierra clase
