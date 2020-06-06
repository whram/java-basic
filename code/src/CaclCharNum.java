import java.util.Scanner;

public class CaclCharNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char s = scanner.next().toLowerCase().charAt(0);
        int count = 0;
        char[] chars = str.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c == s){
                count++;
            }
        }
        System.out.println(count);

    }

}
