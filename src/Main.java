import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Hola mundo :)" );
        System.out.println("Ingrese el numero de filas de la torre: ");
        int tama= sc.nextInt();

        for (int i = 1; i < tama; i++) {
            for (int e = 1; e <=(tama-i) ; e++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}