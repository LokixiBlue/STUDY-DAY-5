package classtrain;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("请输入三个数字比大小");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //if语句判断
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
                sc.close();
            }

        }

        if(b>c)
        {
            if(b>a)
            {
                System.out.println(b);
                sc.close();
            }
        }

        if(c>a)
        {
            if(c>b)
            {
                System.out.println(c);
                sc.close();
            }
        }

    }
}
