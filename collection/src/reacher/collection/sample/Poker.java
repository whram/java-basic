package reacher.collection.sample;

/*
* 斗地主发牌案例
* 1 创建牌
* 2 洗牌
* 3 发牌
* */

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

    public static void main(String[] args) {
        //创建牌
        ArrayList<String> allPoker = createPoker();
        //System.out.println(allPoker);

        //洗牌
        Collections.shuffle(allPoker);
        //System.out.println(allPoker);

        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();

        distribute(allPoker, player01, player02, player03);

        System.out.println(allPoker);
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);

    }

    //创建扑克方法
    public static ArrayList<String> createPoker() {
        //创建花色和数字列表
        ArrayList<String> allPoker = new ArrayList<>();
        String[] colors = new String[]{"♠", "♥", "♣", "♦"};
        String[] nums = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //组合花色与数字存入集合
        for (String color : colors) {
            for (String num : nums) {
                allPoker.add(color+num);
            }
        }

        allPoker.add("大王");
        allPoker.add("小王");

        return allPoker;
    }

    //发牌
    public static <E> void distribute(ArrayList<E> allPoker, ArrayList<E> player01, ArrayList<E> player02, ArrayList<E> player03) {
        while (allPoker.size() > 3) {
            player01.add(allPoker.remove(0));
            player02.add(allPoker.remove(0));
            player03.add(allPoker.remove(0));
        }
    }

}
