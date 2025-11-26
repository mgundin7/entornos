//Proyecto java prueba de entornos
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_13_intentar_adivinar_numero_Marcos_Gundin {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        char respuesta;

        int limite_inferior = 100;
        int limite_superior = 1;

        do{
        int ordenador_piensa = rd.nextInt(limite_inferior,limite_superior+1);

        System.out.println("He pensado el " + ordenador_piensa + "he acertado(=,m,y)? ");
        respuesta = sc.next().charAt(0);
        if (respuesta == '=') {
        System.out.println("Has acertado");
        } else if (respuesta == 'm') {
        limite_superior = ordenador_piensa;
        System.out.println("El numero es menor");
        } else {
        limite_inferior = ordenador_piensa;
        System.out.println("El numero es mayor");
        }
    }while(respuesta != '=');

}
}
