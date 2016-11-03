/**
 * Created by Yang Xiufan on 16/11/3.
 */
public class IfTest {
    public static void main(String[] args) {
        int age = 30;
        if (age > 20)
        //当age>20时，下面花括号括起来的代码才会执行
        {
            System.out.println("年级已经大于20岁了");
            System.out.println("20岁以上的人应该学会承担责任");
        }

        int a = 5;
        if (a > 4) {
            System.out.println("a大于4");
        } else {
            System.out.println("a不大于4");
        }

        //测试if else ，else的隐含条件是对前面的条件取反
        //下面代码实际执行错误
        int age1 = 65;
       /* if (age1 > 20) {
            System.out.println("青年人");
        } else if (age1 > 60) {
            System.out.println("中年人");
        } else if (age1 > 80) {
            System.out.println("老年人");
        }*/
        //修改代码如下
        if (age1 > 80) {
            System.out.println("老年人");
        } else if (age1 > 60) {
            System.out.println("中年人");
        } else if (age1 > 20) {
            System.out.println("青年人");
        }

    }
}
