import java.util.Scanner;

class Solution {

    public static int somaRecursiva(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return somaRecursiva(x + 1, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numeros = sc.nextLine().split(" ");
        int soma = somaRecursiva(Integer.parseInt(numeros[0]), Integer.parseInt(numeros[1]));
        System.out.println(soma);
    }
}
