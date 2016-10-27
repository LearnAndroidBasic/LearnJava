/**
 * Created by Yang Xiufan on 16/10/27.
 */
public class Test {
    public static void main(String[] args) {
        //测试person
        Person p1 = new Person();
        p1.eat();
        p1.name = "person";
        p1.age = 18;
        System.out.println(p1.name);
        System.out.println(p1.age);

        //测试man
        Man m1 = new Man();
        m1.eat();
        m1.name = "man";
        m1.age = 20;
        m1.nn = "nn";
        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.nn);

        //测试多态
        Person p2;
        Man m2 = new Man();
        p2 = m2;
        p2.eat();
    }
}
