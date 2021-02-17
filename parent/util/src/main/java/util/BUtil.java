package util;

import pojo.B;

public class BUtil {
    public static void print(String text) {
        B b = new B();
        b.setText(text);
        System.out.println(b.getText());
    }
}
