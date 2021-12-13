import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(conStr(str1,str2));
    }
    public static boolean conStr(String str1, String str2){
        boolean cont = false;
        if(str1.length()==str2.length()){
            for (int i=0; i<str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i)==str2.charAt(j)){
                        cont=true;
                    }
                    else {
                        cont = false;
                        break;
                    }
                }
            }
        }
        return cont;
    }
}
