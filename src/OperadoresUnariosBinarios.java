public class OperadoresUnariosBinarios {

public static void main(String[] args){
    //operadores unarios ++ --
    int i = 1;

    System.out.println(i++);//imprime 1 y luego incrementa
    System.out.println(i);//imprime 2

    i = 1;
    System.out.println(++i);//incrementa y luego imprime 2

    //operadores de bit a bit ~ & | ^ --- bitwise
    byte b1 = 5; //convierte a vinario 101
    byte b2 = 3; //convierte a binario 011
    System.out.println(b1 & b2);//imprime 1
    //aplicas & en binario 101 & 011 = 001 =001

    byte b3=15; //convierte a binario 1111
    byte b4=10; //convierte a binario 1010
    System.out.println(b3 &  b4);
    //aplicas & en binario 1111 & 1010 = 1010 = 10

}//cierra main

}//cierra clase
