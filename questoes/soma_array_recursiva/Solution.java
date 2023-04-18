import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int result = arraySomaRecursiva(array, 0);
        System.out.println(result);
    }

    public static int arraySomaRecursiva(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + arraySomaRecursiva(array, index + 1);
    }
}