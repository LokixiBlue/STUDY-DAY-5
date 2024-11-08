package classtrain;

import java.util.Scanner;

public class test4 {
        public static void main(String[] args) {

            int a;
            //慢速版本
            System.out.println("输入一个分数，判断分数区间 决定等地");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            if(a>=90&&a<=100)
            {
                System.out.println("A");
            }
            else
            {
                if(a>=80&&a<=89)
                {
                    System.out.println("B");
                }
                else
                {
                    if(a>=70&&a<=69)
                    {
                        System.out.println("C");
                }
                    else
                    {
                        if(a>=60&&a<=59)
                        {
                            System.out.println("D");
                        }
                        else
                        {
                            System.out.println("E");
                        }
                    }
            }
        }
    }
}
