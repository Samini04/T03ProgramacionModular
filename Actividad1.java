import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    // Tabla de multiplicar
                    tablaMultiplicar(dameNumero());
                    break;
                case 2:
                    // Saludar
                    saluda(dameTexto(), dameNumero());
                    break;
                case 3:
                    // Números primos
                    NumeroPrimos(dameNumero());
                    break;
                case 4:
                    // Sumar n enteros
                    sumaNenteros(dameNumero());
                    break;
                case 5:
                    // Multiplicar n enteros
                    multiNenteros(dameNumero());
                    break;
                case 6:
                    // Potencia
                    Potencia(dameNumero(), dameNumero());
                    break;
                case 7:
                    // Pirámide
                    Piramide(dameTexto(), dameNumero());
                    break;
                case 8:
                    // Fibonacci
                    Fibonacci(dameNumero());
                    break;
                case 9:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 9);
    }

    /**
     * Muestra un menú con opciones y devuelve la opción elegida por el usuario.
     * @return int con la opción elegida
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
            \n1. Tabla de multiplicar:
            2. Saluda:
            3. Números primos:
            4. Sumar n enteros:
            5. Multiplicar n enteros:
            6. Potencia:
            7. Pirámide:
            8. Fibonacci:
            9. Salir:
            """ );

            System.out.println("\nSeleccione una opción:");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 9);
        return opcion;
    }

    /**
     * Solicita un número entero al usuario y lo devuelve.
     * @return el número entero ingresado por el usuario
     */
    public static int dameNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número entero: ");
        } while (!scanner.hasNextInt());
        numero = scanner.nextInt();
        return numero;
    }

    /**
     * Muestra la tabla de multiplicar del número pasado como parámetro.
     * @param numero el número para el cual se mostrará la tabla de multiplicar
     */
    public static void tablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Solicita un texto al usuario y lo devuelve.
     * @return el texto ingresado por el usuario
     */
    public static String dameTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        return scanner.nextLine();
    }

    /**
     * Muestra un saludo personalizado el número de veces indicado.
     * @param texto el nombre o mensaje a mostrar
     * @param veces el número de veces que se repetirá el saludo
     */
    public static void saluda(String texto, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Hola " + texto);
        }
    }

    /**
     * Calcula la potencia de un número base elevado a un exponente.
     * @param base el número base
     * @param exponente el exponente al que se eleva la base
     */
    public static void Potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println("El resultado es: " + resultado);
    }

    /**
     * Imprime una pirámide de texto repetido en diferentes líneas.
     * @param texto el texto a repetir en la pirámide
     * @param veces el número de líneas de la pirámide
     */
    public static void Piramide(String texto, int veces) {
        for (int i = 1; i <= veces; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(texto);
            }
            System.out.println();
        }
    }

    /**
     * Imprime los primeros números primos hasta alcanzar el límite especificado.
     * @param limite el número límite de primos a mostrar
     */
    public static void NumeroPrimos(int limite) {
        int count = 0;
        int num = 2;
        while (count < limite) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    /**
     * Verifica si un número es primo.
     * @param n el número a verificar
     * @return true si el número es primo, false en caso contrario
     */
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    /**
     * Calcula y muestra la suma de los primeros n enteros.
     * @param num el límite de enteros a sumar
     */
    public static void sumaNenteros(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma Total: " + suma);
    }

    /**
     * Calcula y muestra el producto de los primeros n enteros.
     * @param num el límite de enteros a multiplicar
     */
    public static void multiNenteros(int num) {
        int multi = 1;
        for (int i = 1; i <= num; i++) {
            multi *= i;
        }
        System.out.println("La multiplicación total es: " + multi);
    }

    /**
     * Genera y muestra los primeros números de la secuencia de Fibonacci hasta el límite especificado.
     * @param numero el número de elementos de la secuencia a generar
     */
    public static void Fibonacci(int numero) {
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i < numero; i++) {
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
            System.out.print(siguiente + " ");
        }
        System.out.println();
    }
}
