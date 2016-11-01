/**
 * Created by Yang Xiufan on 16/11/1.
 */
public class AddString {
    public static void main(String[] args) {
        //下面代码错误，5为整数，不能直接赋值给一个字符串
        //String str1 =5;
        //一个基本类型的值和字符串进行连接运算时，基本类型的值自动转换为字符串
        String str2 = 3.5f + "";
        System.out.println(str2);
        //下面代码从左向右先执行3+4运算为7，再进行7+"Hello！"，此时7会自动为转换为字符串进行连接
        System.out.println(3 + 4 + "Hello!");
        //下面代码从左向右先执行"Hello！"+3，此时3自动转换为字符串进行连接，再同样与4进行连接
        System.out.println("Hello!" + 4 + 3);
    }
}
