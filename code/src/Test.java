import java.util.*;

public class Test{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (!map.containsKey(key)){
                    map.put(key,0);
                }
                map.put(key,map.get(key)+value);
            }
            for (Integer integer : map.keySet()) {
                System.out.println(integer + " " + map.get(integer));
            }
        }

    }
}
