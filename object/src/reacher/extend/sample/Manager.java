package reacher.extend.sample;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {

    public Manager() {
    }

    public Manager(int money) {
        super(money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> list = new ArrayList();

        //判断使用金额是否超出总金额
        if(totalMoney > super.getMoney()){
            return list;
        }
        super.setMoney(super.getMoney()-totalMoney);

        //随机分配每个红包金额所占的比例
        int sum = 0;
        for (int i = 0; i < count; i++) {
            list.add(new Random().nextInt(10)+1);
            sum += list.get(i);
        }

        //计算每个红包的金额
        int listSum = 0;
        for (int i = 0; i < count; i++) {
            double d = (double)list.get(i) / sum;
            list.set(i, (int) Math.floor(d*totalMoney));
            listSum += list.get(i);
        }

        //将剩余金额加到第一个红包里
        list.set(0, list.get(0)+totalMoney-listSum);
        return list;
    }

}
