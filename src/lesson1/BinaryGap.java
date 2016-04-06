package lesson1;

/**
 * Created by Marcin on 2016-04-06.
 */
public class BinaryGap {

    public static void main(String[] args) {

        System.out.println(solution(1041));
        System.out.println(solution(256 + 64));
        System.out.println(solution(1));
        System.out.println(solution(0));
        System.out.println(solution(2));

    }


    public static int solution(int N) {

        int tmp = N;
        int result = 0;
        int binaryGap = 0;
        boolean began = false;

        while ( tmp > 0 ) {

            if ( tmp % 2 == 1 ) {

                if ( began ) {

                    if ( result < binaryGap ) result = binaryGap;

                } else {

                    began = true;

                }

                binaryGap = 0;

            } else {

                binaryGap++;

            }

            tmp /= 2;

        }

        return result;

    }
}
