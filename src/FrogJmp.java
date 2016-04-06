/**
 * Created by Marcin on 2016-04-06.
 */
public class FrogJmp {

    public static void main(String[] args) {

        System.out.println(solution(30, 120, 6));
        System.out.println(solution(20, 50, 40));
        System.out.println(solution(0, 150, 7));

    }

    private static int solution(int X, int Y, int D) {

        return ((Y - X) % D != 0) ? (((Y - X) / D) + 1) : ((Y - X) / D);

    }

}
