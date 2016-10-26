/**
 * Created by Yang Xiufan on 16/10/26.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        HelloWorld.helloworld();
        HelloWorld person1 = new HelloWorld();
        person1.commonhelloworld();
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
