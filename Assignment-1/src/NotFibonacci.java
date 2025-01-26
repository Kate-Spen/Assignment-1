import java.util.*;
public class NotFibonacci {
    public static long[] notFibonacci(int n){
        long[] sequence = new long[n];
        // Base cases
        sequence[0] = 0;
        if (n > 1) {
            sequence[1] = 1;
        }
        for (int i=2; i < n; i++){
            long first= sequence[i -1];
            long sec= sequence[i-2];
            long curr= (3*first)+(2*sec);
            sequence[i] = curr;
        }
        return sequence;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int n = scanner.nextInt();
        long[] sequence = notFibonacci(n);
        System.out.println("Sequence: ");
        for (long num : sequence){
            System.out.print(num+ " ");
        }
    }
}
