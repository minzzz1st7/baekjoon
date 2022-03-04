package Jansims;

import java.util.Scanner;

public class BK11050_이항계수1{
        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int answer=factorial(n)/(factorial(k)*factorial(n-k));
            System.out.println(answer);
        }
        public static int factorial(int n) {
            int total=1;
            for(int i=1;i<=n;i++) {
                total*=i;
            }
            return total;
        }

}
