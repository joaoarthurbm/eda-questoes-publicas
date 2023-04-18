import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] notasStr = scanner.nextLine().split(" ");
        int[] notas = Arrays.stream(notasStr).mapToInt(Integer::parseInt).toArray();

        int notaProcurada = 700;
        int index = buscaBinariaRecursiva(notas, notaProcurada, 0, notas.length - 1, 0);
    }

    public static int buscaBinariaRecursiva(int[] notas, int notaProcurada, int left, int right, int level) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        printArvoreRecursao(level, middle, notas[middle]);

        if (notas[middle] == notaProcurada) {
            if (middle == 0 || notas[middle - 1] != notaProcurada) {
                return middle;
            } else {
                return buscaBinariaRecursiva(notas, notaProcurada, left, middle - 1, level + 1);
            }
        } else if (notas[middle] < notaProcurada) {
            return buscaBinariaRecursiva(notas, notaProcurada, middle + 1, right, level + 1);
        } else {
            return buscaBinariaRecursiva(notas, notaProcurada, left, middle - 1, level + 1);
        }
    }

    public static void printArvoreRecursao(int level, int index, int value) {
        System.out.println("Nivel " + level + ": indice " + index + ", valor " + value);
    }
}