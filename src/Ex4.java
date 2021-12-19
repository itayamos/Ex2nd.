import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];
        System.out.println(Arrays.toString(dupNum(a)));
    }
    public static int[] dupNum(int[] a){
        int count = 0;
        int checker;
        int[] b = new int[0];
        for (int i=0; i< a.length; i++) {
            b = new int[a.length-count];
            checker = a[i];
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j + 1]) {
                    count++;
                }
                for (int k = 0; k < a.length-count; k++) {
                    b[k] = checker;
                }

            }

        }
        return b;
    }
}
