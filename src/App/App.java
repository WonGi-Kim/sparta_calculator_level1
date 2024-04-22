/**
 * 스파르타내일배움캠프 개인과제 level - 1 계산기
 * Won Gi - Kim
 * -------------------------------
 * 개발하기 전 고려해야할 점?
 * 정수형이기 때문에 Int -> 실수형으로 계산하기 위해 캐스팅 필요
 * 만약에 실수형이 들어 오게 되면? String으로 받고 계산시에 Double, Float로 형변환?
 */

package App;
import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        /** 과제 요구사항 .2
         * Scanner를 사용하여 사용하여 사칙연산 기호를 전달받는다.
         * 사칙연산 기호를 적합한 타입으로 선언된 변수에 저장한다. (charAt(0))
         */

        Scanner in = new Scanner(System.in);

        int a; // 첫 번째 숫자
        int b; // 두 번째 숫자
        char operand;

        System.out.println("첫 번째 숫자를 입력하세요: ");
        a = in.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        operand = in.next().charAt(0);

        System.out.println("두 번째 숫자를 입력하세요: ");
        b = in.nextInt();

        System.out.println("\n");
        System.out.println("첫 번째 숫자 : " + a);
        System.out.println("사칙연산 기호 : " + operand);
        System.out.println("두 번째 숫자 : " + b + " \n");

    }
}

/**
 * 과제 요구사항 1.
 * Scanner를 사용하여 양의 정수 2개를 전달 받을 때
 * 양의 정수는 각각 하나씩 전달 받는다.
 * 양의 정수는 적합한 타입으로 선언한 변수에 저장한다.
 * Scanner in = new Scanner(System.in);
 * int a; // 첫 번째 숫자
 * int b; // 두 번째 숫자
 * System.out.println("첫 번째 숫자를 입력하세요: ");
 * a = in.nextInt();
 * System.out.println("두 번째 숫자를 입력하세요: ");
 * *b = in.nextInt();
 * *System.out.println("\n");
 * *System.out.println("첫 번째 숫자 : " + a);
 * *System.out.println("두 번째 숫자 : " + b + " \n");
 */