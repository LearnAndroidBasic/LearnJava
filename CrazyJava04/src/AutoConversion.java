/**
 * Created by Yang Xiufan on 16/11/1.
 */
public class AutoConversion {
    public static void main(String[] args) {
        //自动类型转换，int类型可以自动转换为float类型
        int a = 6;
        float f = a;
        //下面输出6.0
        System.out.println(f);
        //定义一个byte类型的整数变量
        byte b = 9;
        //char c=b;
        //代码编译错误，byte不能自动转换为char类型
        double d = b;
        //下面输出9.0
        System.out.println(d);
        /*自动类型转换图
           byte > short >
                          int > long > float > double
                   char >
         */

        int sum = (int) (0.5 + 10);
        int add = 10;
        // int e = add++ + 6;
        int e = ++add + 6;
        System.out.println(e);

        AddString add1 = new AddString();
        AddString add2 = new AddString();
        AddString add3 = add1;
        System.out.println(add1 == add3);

        System.out.println("a的值是：" + a + ",b的值是：" + b);


    }
}
