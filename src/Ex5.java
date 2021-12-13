import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a= new int[scanner.nextInt()];
        System.out.println(mountView(a));
    }
    public  static int mountView(int[] a){
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int min=0;
        int num;
        int index1=scanner.nextInt();
        for (int i=0; i< a.length; i++){
            if(max > a[i]){
                max=a[i];
            }
        }
        for (int k=index1; k< a.length; k++){
            if (min < a[k]){
                min=a[k];
            }
        }
        if(max==a[index1] && min==a.length-1){
            num=index1;
        }
        else
            num=-1;
        return num;
    }
}
