import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    // Dame último dígito
                    DameUltimo(DameNúmero());
                    break;
                case 2:
                    // Quita último dígito
                    QuitaUltimo(DameNúmero());
                    break;
                case 3:
                    // Voltea el número
                    VolteaNumero(DameNúmero());
                    break;
                case 4:
                    // Verifica si el número es capicúa
                    esCapicua(DameNúmero());
                    break;
                case 5:
                    // Muestra los capicúas (sin implementar)
                    break;
                case 6:
                    // Quita dígito por detrás
                    QuitaPorDetras(DameNúmero());
                    break;
                case 7:
                    // Convierte binario a decimal
                    BinarioToDecimal(Binarios());
                    break;
                case 8:
                    // Convierte binario a octal
                    BinarioToOctal(Binarios());
                    break;
                case 9:
                    // Convierte binario a hexadecimal
                    BinarioToHexa(Binarios());
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 10);
    }

    /**
     * Muestra un menú de opciones y devuelve la opción seleccionada por el usuario.
     * @return la opción elegida por el usuario
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                    \n1. Dame último:
                    2. Quita último:
                    3. Voltea número:
                    4. Es capicúa:
                    5. Muestra los capicúas:
                    6. Quita por detrás:
                    7. De binario a decimal:
                    8. De binario a octal:
                    9. De binario a hexadecimal:
                    10. Salir:
                    """);
            System.out.println("\nSeleccione una opción:");
            opcion = scanner.nextInt();
            return opcion;
        } while (opcion < 1 || opcion > 10);

    }

    /**
     * Solicita un número al usuario y lo devuelve.
     * @return el número entero ingresado por el usuario
     */
    public static int DameNúmero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduzca un número :");
        } while (!scanner.hasNextInt());
        numero = scanner.nextInt();
        return numero;
    }

    /**
     * Muestra el último dígito de un número.
     * @param num el número del cual se obtendrá el último dígito
     */
    public static void DameUltimo(int num) {
        int ultimo = num % 10;
        System.out.println("El último dígito es: " + ultimo);
    }

    /**
     * Muestra el número resultante al quitar el último dígito de un número.
     * @param num el número al que se le quitará el último dígito
     */
    public static void QuitaUltimo(int num) {
        int quita = num / 10;
        System.out.println("Al quitarle el último queda así: " + quita);
    }

    /**
     * Muestra el número invertido.
     * @param num el número que se invertirá
     */
    public static void VolteaNumero(int num) {
        int numeroReves = 0;
        while (num != 0) {
            numeroReves = numeroReves * 10 + num % 10;
            num /= 10;
        }
        System.out.println("El número al revés es: " + numeroReves);
    }

    /**
     * Verifica si un número es capicúa.
     * @param numero el número a verificar
     */
    public static void esCapicua(int numero) {
        int original = numero;
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        if (original == invertido) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    /**
     * Elimina el primer dígito de un número y muestra el resultado.
     * @param num el número al que se le quitará el primer dígito
     */
    public static void QuitaPorDetras(int num) {
        String numStr = String.valueOf(num);
        if (numStr.length() > 1) {
            int nuevoNumero = Integer.parseInt(numStr.substring(1));
            System.out.println("El número sin el primer dígito es: " + nuevoNumero);
        } else {
            System.out.println("El número tiene solo un dígito, no se puede quitar.");
        }
    }

    /**
     * Solicita un número binario al usuario y lo devuelve.
     * @return el número binario ingresado por el usuario
     */
    public static int Binarios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número binario:");
        int numero = scanner.nextInt();
        return numero;
    }

    /**
     * Convierte un número binario a decimal y muestra el resultado.
     * @param num el número binario que se convertirá a decimal
     */
    public static void BinarioToDecimal(int num) {
        int resultado = Integer.parseInt(String.valueOf(num), 2);
        System.out.println("El código " + num + " en decimal es: " + resultado);
    }

    /**
     * Convierte un número binario a octal y muestra el resultado.
     * @param num el número binario que se convertirá a octal
     */
    public static void BinarioToOctal(int num) {
        int decimal = Integer.parseInt(String.valueOf(num), 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("El código " + num + " en octal es: " + octal);
    }

    /**
     * Convierte un número binario a hexadecimal y muestra el resultado.
     * @param num el número binario que se convertirá a hexadecimal
     */
    public static void BinarioToHexa(int num) {
        int decimal = Integer.parseInt(String.valueOf(num), 2);
        String hexa = Integer.toHexString(decimal);
        System.out.println("El código " + num + " en hexadecimal es: " + hexa);
    }
}
