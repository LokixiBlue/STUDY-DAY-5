package classtrain;

//隐式转换和强制转换
public class test1 {
    public static void main(String[] args) {
        //隐式转换，把一个取值范围小的数，转换成取值范围大的数
        //byte -> short ->  int -> long ->float ->double

        //byte short char运算时，先转换成int再进行运算
        byte a1 = 10;
        byte a2 = 20;
        System.out.println(a1 + a2);//最终结果类型(int)

        //double最大，所以最后是它的类型
        int i = 10;
        long n = 100L;
        double d = 20.0;
        System.out.println(i + n + d);//最终结果类型(double)

        //byte先转为short，b与s计算出结果后，将结果转为long最后运算
        byte b = 10;
        short s = 20;
        long n1 = 100L;
        System.out.println(b + s + n1);//最终结果类型(long)



        //强制转换，把一个取值范围大的数值，赋值给取值范围小的变量
        //byte -> short ->  int -> long ->float ->double
        //格式：目标数据类型 变量名=（目标数据类型）被强转的数据;

        //要转换的是aa1和aa2的结果，括号优先级最高，所有扩起来
        byte aa1 = 10;
        byte aa2 = 20;
        byte result = (byte) (aa1 + aa2);
        System.out.println(result);

        //如果要转换的数据过大，会导致值错误 如下
       /* byte aaa1 = 100;
        byte aaa2 = 200;
        byte result=(byte)(aaa1+aaa2);
        System.out.println(result);*/




    }
}
