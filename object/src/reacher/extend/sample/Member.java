package reacher.extend.sample;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(int money) {
        super(money);
    }

    public void receive(ArrayList<Integer> list) {
        int m = list.remove(new Random().nextInt(list.size()));
        super.setMoney(super.getMoney()+m);
    }

}
