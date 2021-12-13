import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNum = scanner.nextLine();
        Phone(phoneNum);
    }
    public static void Phone(String phoneNum) {
        if (phoneNum.length()==11  && phoneNum.charAt(0)=='0' && phoneNum.charAt(1)=='5' && phoneNum.charAt(2)=='0' && phoneNum.charAt(3)=='-'){
            System.out.println(phoneNum);
        }
        if(phoneNum.length()==10){
            if ((phoneNum.charAt(0)=='0' && phoneNum.charAt(1)=='5' && phoneNum.charAt(2)=='0') || (phoneNum.charAt(0)=='9' && phoneNum.charAt(1)=='7' && phoneNum.charAt(2)=='2')){
                System.out.println("050-");
                for (int i=3; i< phoneNum.length(); i++){
                    System.out.println(phoneNum.charAt(i));
                }
            }
        }
    }
}
