/**
 * Created by Yang Xiufan on 16/11/1.
 */
public class NarrowConversion {
    public static void main(String[] args) {
        int iValue = 233;
        //将int值强制转换为byte值
        byte bValue = (byte) iValue;
        //输出转换后bValue值
        System.out.println(bValue);
        double dValue = 3.98;
        //将double值强制转换为int值
        int tol = (int) dValue;
        System.out.println(dValue);
    }
}
