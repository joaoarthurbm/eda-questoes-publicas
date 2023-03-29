import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int num = sc.nextInt();
        
        int index = contemRecursivo(num,array, 0);

        System.out.println(index);
        
    }
    
    public static int contemRecursivo(int num, String[] array, int index){
        // caso base 
        if(index >= array.length){
            return -1;
        }
        else if(Integer.parseInt(array[index]) == num){
            return index;
        }
        return contemRecursivo(num, array, index + 1);
    }
}

