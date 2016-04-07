package lesson5;

/**
 * Created by Marcin on 2016-04-07.
 */
public class CountDiv {

    public static void main(String[] args) {

        System.out.println(solution(6, 11, 2));
        System.out.println(solution(6, 12, 2));
        System.out.println(solution(5, 11, 2));
        System.out.println(solution(1, 2, 3));
        System.out.println(solution(1, 3, 3));


    }

    private static int solution(int A, int B, int K) {

        return ( A % K == 0 ) ? (B / K) - (A / K) + 1 : (B / K) - (A / K);

    }

}
