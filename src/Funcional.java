import java.util.stream.Stream;

public class Funcional {
    public static void main(String[] args){
        //hacer un bucle que muestre los números del 1 al 10
        //for(int i=1;i<=10;i++)
        //con programción funcional
        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);
    }
}
