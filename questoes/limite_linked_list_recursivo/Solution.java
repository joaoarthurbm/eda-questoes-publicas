import java.util.Scanner;

class Solution {

    static class Node {
        int value;
        Node next;
    
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    public static int findIndex(Node head, int limit, int index, int cumulativeSum) {
        if (head == null) {
            return -1; // final da lista sem ultrapassar o limite
        }
    
        cumulativeSum += head.value; // adicionando o valor atual à soma cumulativa
    
        if (cumulativeSum > limit) {
            return index; // índice que faz a soma ultrapassar o limite
        }
    
        return findIndex(head.next, limit, index + 1, cumulativeSum);
    }

    public static Node createLinkedListFromString(String input) {
        String[] values = input.split(" ");
        if (values.length == 0) {
            return null;
        }

        Node head = new Node(Integer.parseInt(values[0]));
        Node currentNode = head;

        for (int i = 1; i < values.length; i++) {
            currentNode.next = new Node(Integer.parseInt(values[i]));
            currentNode = currentNode.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Node head = createLinkedListFromString(input);

        int limit = scanner.nextInt();

        int index = findIndex(head, limit, 0, 0);
        System.out.println(index);
    }
}