package TouTiao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Amie on 2018/3/24.
 */
public class TouTiao_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] num = new int[n];
        int[] flag = new int[n];
        int count = 0;
        for (int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }
        for (int i=0;i<n-1;i++){
            if (num[i]==num[i+1])
                flag[i+1] = 1;
        }
        flag[1]=0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++)
            {
                if (Math.abs(num[i]-num[j])==k && flag[j]!=1)
                   count++;
            }
        }
        System.out.println(count);
    }
}
