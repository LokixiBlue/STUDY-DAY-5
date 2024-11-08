package classtrain;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
//优化版本
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数得到等地");
        a = sc.nextInt();
        if(a>=90)
        {
            System.out.println("A");

        }
        else if(a>=80)
        {
            System.out.println("B");

        }
        else if(a>=70)
        {
            System.out.println("C");

        }
        else if(a>=60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("E");
        }
    }
}
