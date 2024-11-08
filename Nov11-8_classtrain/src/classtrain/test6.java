package classtrain;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        float jiage;
        int count;
        float zhekou,money;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入图书定价");
        jiage = sc.nextFloat();
        System.out.println("输入图书数量");
        count = sc.nextInt();
        if(count>=100)
        {
            zhekou=0.8f;
        }
        else if(count>=10)
        {
            zhekou=0.85f;

        }
        else
        {
            zhekou=0.9f;
        }
        money=jiage*zhekou*count;
        System.out.println("总金额"+money);
        sc.close();

    }
}
