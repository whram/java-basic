import java.util.Scanner;
import java.util.TreeSet;

public class RandomNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            TreeSet<Integer> ts = new TreeSet();
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                ts.add(sc.nextInt());
            }
            for (Integer t : ts) {
                System.out.println(t);
            }
        }
    }

}
