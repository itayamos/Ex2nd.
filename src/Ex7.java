import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ttt=new char[9];
        for (int i=0; i< ttt.length; i++){
            ttt[i]=scanner.nextLine().charAt(0);
        }
        int clear= scanner.nextInt();
        int pos=scanner.nextInt();
        int placement=scanner.nextInt();
        char ch1=scanner.next().charAt(0);
        char symbol=scanner.next().charAt(0);
        System.out.println(isAvailable(ttt));
        System.out.println(getPositionFromUser(ch1,pos,ttt));
        System.out.println(checkWinner(ttt));
        System.out.println(placeSymbolOnBoard(symbol, placement, ttt));
        printBoard(ttt);
        isAvailable(ttt);
        getPositionFromUser(ch1,pos,ttt);
        checkWinner(ttt);
        placeSymbolOnBoard(symbol, placement, ttt);
    }

    public static void printBoard(char[] ttt) {
        int counter=0;
        while (counter<9){
            System.out.println(ttt[counter]+" "+ttt[counter+1]+" "+ttt[counter+2]);
            counter= counter+3;
        }

    }

    public static boolean isAvailable(char[] ttt) {
        Scanner scanner = new Scanner(System.in);
        int clear=scanner.nextInt();
        boolean isIt=true;
        if(clear >= 0 && clear < 9){
            if (ttt[clear]=='x' || ttt[clear]=='o'){
                isIt = false;
            }
            else if(ttt[clear]==' '){
                isIt=true;
            }
        }
        return isIt;
    }

    public static char getPositionFromUser(char ch1, int pos, char[] ttt) {
        Scanner scanner = new Scanner(System.in);
        int q=1;
        ch1=scanner.next().charAt(0);
        pos=scanner.nextInt();
        while (pos>=0 && pos<9 && q!=0){
            while(ttt[pos]=='x' || ttt[pos]=='o'){
                System.out.println("try again");
            }
            if (ttt[pos]==' ') {
                ttt[pos] = ch1;
            }
            q--;
        }
        return ttt[pos];
    }

    public static char checkWinner(char[] ttt) {
        char winner;
        if ((ttt[3]==ttt[4] && ttt[4]==ttt[5]) || (ttt[0]==ttt[4] && ttt[4]==ttt[8]) || (ttt[2]==ttt[4] && ttt[4]==ttt[6]) || (ttt[1]==ttt[4] && ttt[4]==ttt[7])){
            winner=ttt[4];
        }
        else if((ttt[0]==ttt[1] && ttt[1]==ttt[2]) || (ttt[0]==ttt[3] && ttt[3]==ttt[6])){
            winner=ttt[0];
        }
        else if((ttt[6]==ttt[7] && ttt[7]==ttt[8]) || (ttt[2]==ttt[5] && ttt[5]==ttt[8])){
            winner=ttt[8];
        }
        else {
            winner = '-';
        }
        return winner;
    }
    public static boolean placeSymbolOnBoard(char symbol, int placement, char[] ttt){
        Scanner scanner = new Scanner(System.in);
        placement=scanner.nextInt();
        boolean flag=false;
        symbol=scanner.next().charAt(0);
        getPositionFromUser(symbol,placement,ttt);
        if (checkWinner(ttt)=='x' || checkWinner(ttt)=='o'){
            flag=true;
        }
        else if (checkWinner(ttt)=='-'){
            flag=false;
        }
        return flag;
    }


}
