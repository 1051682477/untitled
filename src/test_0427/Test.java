package test_0427;

import java.awt.*;

public class Test {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }
    public void pupSex(){
        char sex = '男';
        System.out.println("同学的性别是：" + sex);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
        test.pupSex();
    }
}
