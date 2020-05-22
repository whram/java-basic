package samplePoker;

/*
 * 斗地主发牌案例
 * 1 创建牌
 * 2 洗牌
 * 3 发牌
 * */

import java.util.*;

public class Poker {

    public static void main(String[] args) {
        //创建牌
        HashMap<Integer, String> allPoker = createPoker();
        //创建牌的大小索引
        ArrayList<Integer> pokerList = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            pokerList.add(i);
        }

        //洗牌
        Collections.shuffle(pokerList);

        //发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        distribute(pokerList, player01, player02, player03);
        //手牌和底牌排序
        Collections.sort(pokerList);
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);

        //打印底牌和手牌
        printPoker(allPoker, pokerList);
        printPoker(allPoker, player01);
        printPoker(allPoker, player02);
        printPoker(allPoker, player03);
    }

    //创建扑克方法
    public static HashMap<Integer, String> createPoker() {
        //创建花色和数字列表
        HashMap<Integer, String> allPoker = new HashMap<>();
        String[] colors = new String[]{"♠", "♥", "♣", "♦"};
        String[] nums = new String[]{"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //组合花色与数字存入集合
        int i = 0;
        allPoker.put(i++, "大王");
        allPoker.put(i++, "小王");
        for (String num : nums) {
            for (String color : colors) {
                allPoker.put(i++, color+num);
            }
        }
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

    //打印手牌
    public static <E> void printPoker(HashMap<E,String> allPoker, ArrayList<E> pokerLIst) {
        System.out.print("{ ");
        for (E e : pokerLIst) {
            System.out.print(allPoker.get(e) + " ");
        }
        System.out.println("}");
    }
}