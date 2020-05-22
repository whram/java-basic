package reacher.list.linkedList;

/*
* LinkedList接口 implement List接口
*
* 底层是链表结构
*
* public void addFirst(E e) :将指定元素插入此列表的开头。
* public void addLast(E e) :将指定元素添加到此列表的结尾。
*
* public E getFirst() :返回此列表的第一个元素。
* public E getLast() :返回此列表的最后一个元素。
*
* public E removeFirst() :移除并返回此列表的第一个元素。
* public E removeLast() :移除并返回此列表的最后一个元素。
*
* public E pop() :从此列表所表示的堆栈处弹出一个元素。
* public void push(E e) :将元素推入此列表所表示的堆栈。
*
* public boolean isEmpty() ：如果列表不包含元素，则返回true。
* */

import java.util.LinkedList;

public class Demo01 {

    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList();

        lList.add("a");
        lList.add("b");
        lList.add("c");

        //System.out.println(lList.pop());
        lList.push("x");

        System.out.println(lList);

        for (String l : lList) {
            System.out.println(l);
        }
    }

}
