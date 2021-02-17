package util;

import pojo.A;

public class AUtil {

    public static void print(int num) {
        A a = new A();
        a.setNum(num);
        System.out.println(a.getNum());
    }
}
