/**
 * Created by Yang Xiufan on 16/11/3.
 */
public class SwitchTest {
    public static void main(String[] args) {
        char score = 'C';
        switch (score) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("中");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("不及格");
                break;
            default:
                System.out.println("成绩输入错误");
        }
    }
}
