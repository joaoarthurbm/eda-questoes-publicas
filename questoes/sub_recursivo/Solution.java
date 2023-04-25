import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listaNumeros = sc.nextLine().split(" ");
        int[] numeros = Arrays.stream(listaNumeros).mapToInt(Integer::parseInt).toArray();
        System.out.println(subtract(numeros[0], numeros[1]));
    }

    public static int subtract(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return subtract(a - 1, b - 1);
        }
    }
}
