import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] b=new int[scanner.nextInt()];
        int[] c=new int[scanner.nextInt()];
        System.out.println(strangeArrays(b, c));
        System.out.println(intersection(b, c));
    }

    public static  boolean strangeArrays(int[] b, int[] c){
        boolean diff = false;
        for (int i=0; i< b.length; i++){
            for (int k=0; k< c.length; k++){
                if (b[i]!=c[k]){
                    diff = true;
                }
                else {
                    diff = true;
                    break;
                }
            }
        }
        return diff;
    }
    public static int[] intersection(int[] b, int[] c){
        int count1=1;
        int count2=1;
        int[] a1= new int[count1];
        int[] a2= new int[count2];
        int[] a= new int[count1 + count2];
            for (int m=0; m< b.length; m++){
                for(int n=0; n< c.length; n++){
                    if(b[m]==c[n]){
                        a1[count1-1]=b[m];
                        count1++;
                    }
                    else{
                        a2[count2-1]=b[m];
                        count2++;
                    }
                }
            }
            for (int l=0; l< count1; l++){
                a[l]=a1[l];
            }
            for (int q=0; q< count2; q++){
                a[count1+q]=a2[q];
            }
        return a;
    }
}
