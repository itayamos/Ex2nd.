import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        int[] arr = new int[15];
        System.out.println(Arrays.toString(greaterThanAvg(arr)));
    }
    public static int[] greaterThanAvg(int[] arr){
        int sum = 0;
        int avg;
        int count = 1;
        int num = 0;
        int[] a = new int[count];
        for (int i=0; i< arr.length; i++) {
            sum = arr[i] + sum;
        }
        avg = sum/ arr.length;
        for (int k=0; k< arr.length; k++){
            if (arr[k]>avg) {
                num = arr[k];
                System.out.println(arr[k]);
                count++;
                }
            for (int j=0; j < count-1; j++){
                a[j]=num;
            }
        }
        return a;
    }
}
