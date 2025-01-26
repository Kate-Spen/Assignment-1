import java.util.*;
public class NotFibonacci {
    public static ArrayList<Long> notFibonacci(int n){
        ArrayList<Long> sequence = new ArrayList<>();
        sequence.add(0L);
        if (n>1){
            sequence.add(1L);
        }
        for (int i=2; i < n; i++){
            long first= sequence.get(i -1);
            long sec= sequence.get(i-2);
            long curr= (3*first)+(2*sec);
            sequence.add(curr);
        }
        return sequence;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int n = scanner.nextInt();
        ArrayList<Long> sequence = notFibonacci(n);
        System.out.println("Sequence: ");
        for (long num : sequence){
            System.out.print(num+ " ");
        }
    }
}
