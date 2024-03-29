package Code.Variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner man = new Scanner(System.in);
        // Declare variables of different types
        // Declarar una variable String y mostrarla en pantalla
        String cavi = "Hello, world!";
        System.out.println(cavi);
        // Declarar dos variables de tipo String y concatenarlas
        String alex = "hola";
        String leon = "chao";
        System.out.println(alex + " " + leon + 3);
        // Sumar tres numeros y luego multiplicarlo por la suma de los mismos
        int num1 = 5;
        int num2 = 8;
        int num3 = 6;
        int num4 = (num1 + num2 + num3);
        System.out.println(Math.pow(num4, 2));
        // Otra forma de realizarlo, es tener en cuenta que al sumar los numeros y
        // multiplicarlos por su resultado, es como tener la suma al cuadrado.
        // Resta
        int num5 = (num1 - num2 - num3);
        System.out.println(Math.pow(num5, 2));
        // multiplicacion
        int num6 = (num1 * num2 * num3);
        System.out.println(Math.pow(num6, 2));
        // Variable Booleana
        // boolean name= true;
        // boolean no= false;
        // Leer un nombre por teclado y decir "Bienvenido *nombre*"
        System.out.println("Escribe por favor tu nombre");
        String nom = man.nextLine();
        System.out.println("Bienvenido " + nom);
        // Con NextInt
        System.out.println("Escribe un numero");
        int nom1 = man.nextInt();
        System.out.println("Escribe un segundo numero");
        int nom2 = man.nextInt();
        man.nextLine();
        System.out.println("La suma de tus numeros es " + (nom1 + nom2));
    }
}
