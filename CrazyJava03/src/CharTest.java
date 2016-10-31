/**
 * @author Created by Yang Xiufan on 16/10/31.
 */
public class CharTest {
    public static void main(String[] args) {
        //直接指定单个字符作为字符值
        char aChar = 'a';
        //使用转义字符来作为字符值
        char enterChar = '\r';
        //使用Unicode 编码值来指定字符值
        char ch = '\u9998';
        //将输出一个'香'字符
        System.out.println(ch);
        //定义一个'疯'字符值
        char zhong = '疯';
        //直接将一个char变量当成int类型变量使用
        int zhongvalue = zhong;
        System.out.println(zhongvalue);
        //直接把一个0~65536范围内的int整数赋给一个char变量
        char c = 97;
        System.out.println(c);
        //定义一个数组,java一般格式
        int[] a = {0, 1, 2};
        //定义另外一个数组，不常用格式
        int b[] = {2, 4, 6};

    }

    /**
     * 用于计算两个整形数的和
     *
     * @param a 参数a
     * @param b 参数b
     * @return 返回a+b的值
     */
    public int add(int a, int b) {
        return a + b;
    }

}
