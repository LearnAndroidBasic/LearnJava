/**
 * Created by Yang Xiufan on 16/11/1.
 */
public class RandomStr {
    public static void main(String[] args) {
        //定义一个空字符串
        String result = "";
        for (int i = 0; i < 6; i++) {
            //生成一个97~122之间的int类型数据
            int intVal = (int) (Math.random() * 26 + 97);
            //将intVal值强制转换为char类型后连接到result后面
            result = result + (char) intVal;
        }
        //输出随机字符串
        System.out.println(result);

        Integer a = 5;
        Integer b = 4;
        Integer c = ((a++) - (((--b) * (++a)) / (b--))) >> (2 % (a--));
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(-1 >> 2);
    }
}
