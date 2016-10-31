/**
 * Created by Yang Xiufan on 16/10/26.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");

        HelloWorld.helloworld();

        HelloWorld person1; //声明一个对象，叫person1;
        person1 = new HelloWorld();//创建出来person1;
        person1.commonhelloworld(); //调用person1的打招呼
        person1.helloworld();//  调用helloworld方法

        HelloWorld person2 = new HelloWorld();
        person2.commonhelloworld();

    }

    public static void helloworld() {
        System.out.println(1 + 1);
    }

    public void commonhelloworld() {
        System.out.println(1 * 3);
    }
}
