package 백준.조합;

import java.util.Arrays;
import java.util.Scanner;

public class B_11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] dp = new int[N + 1][N + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;
            dp[i][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
            }
        }

//        System.out.println(Arrays.deepToString(dp));

        System.out.println(dp[N][K]);
    }
}
