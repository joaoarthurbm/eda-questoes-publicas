import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] inputArray = inputLine.split(" ");

        int[] idades = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            idades[i] = Integer.parseInt(inputArray[i]);
        }

        int[] cumulativa = calculaCumulativa(idades);

        System.out.print(Arrays.toString(cumulativa));

    }

    public static int[] calculaCumulativa(int[] idades) {
        int maxIdade = 130;
        int[] frequencias = new int[maxIdade + 1];
        int[] cumulativa = new int[maxIdade + 1];

        for (int idade : idades) {
            frequencias[idade]++;
        }

        cumulativa[0] = frequencias[0];
        for (int i = 1; i <= maxIdade; i++) {
            cumulativa[i] = cumulativa[i - 1] + frequencias[i];
        }

        return cumulativa;
    }
}