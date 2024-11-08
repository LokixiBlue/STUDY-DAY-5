package classtrain;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        int a;
        System.out.println("输入一个分数，判断优秀，及格，不及格");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a>=90)
        {
            System.out.println("优秀");
        }
        else
        {
            if(a>=60)
            {
                System.out.println("及格");
            }
            else
            {
                System.out.println("不及格");
            }
        }
    }
}
