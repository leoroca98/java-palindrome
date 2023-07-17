import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        //chiedere all'utente di inserire la prima parola
        System.out.print("inserisci la prima parola : ");
        String parola = scanner.nextLine();
        char[] parolaArray = parola.toCharArray();
        int l = parolaArray.length;

        if (l % 2 == 0) {

            for (int i = 0; i < (l / 2) - 1; i++) {
                if (parolaArray[i] != parolaArray[l - i - 1]) {
                    flag = false;



                }
            }
        }
    }
}