/**
 * 스파르타내일배움캠프 개인과제 level - 1 계산기
 * Won Gi - Kim
 * -------------------------------
 * 개발하기 전 고려해야할 점?
 * 정수형이기 때문에 Int -> 실수형으로 계산하기 위해 캐스팅 필요
 * 만약에 실수형이 들어 오게 되면? String으로 받고 계산시에 Double, Float로 형변환?
 * -> level3에 있었네 ㅎㅎ...
 */

package App;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String finish = new String();

        int a; // 첫 번째 숫자
        int b; // 두 번째 숫자
        char operand; // 연산자
        int result = 0; // switch 문 밖에서 선언하고 초기화

        int[] resultArray = new int[10]; // 연산을 저장할 배열
        int count = 0; // 연산이 저장될 때 마다 count증가

        while (!finish.equals("exit")) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = in.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            operand = in.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            b = in.nextInt();

            switch (operand) {
                case ('+'):
                    result = a + b;
                    System.out.println("결과는 : " + result);
                    break;
                case ('-'):
                    result = a - b;
                    System.out.println("결과는 : " + result);
                    break;
                case ('*'):
                    result = a * b;
                    System.out.println("결과는 : " + result);
                    break;
                case ('/'):
                    if(b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = a / b;
                    int result2 = a % b;
                    System.out.println("결과는 " + "몫 : " + result + " 나머지 : " + result2);
                    break;

                default:
                    System.out.println("잘못된 연산자 입니다.");
                    break;
            }

            if (count > 9) {
                for (int i = 0; i < resultArray.length - 1; i++) {
                    resultArray[i] = resultArray[i + 1];
                }
                count = 9;
            }
            resultArray[count] = result;
            count++;

            System.out.print("더 계산하시겠습니까? ( 계속 계산하시려면 아무키나 입력해주세요. exit 입력 시 종료됩니다. )");
            finish = in.next();
            if(finish.equals("exit")) {
                break;
            } else {
                continue;
            }
        }
        System.out.println(count); // count가 증가하는지
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " "); // 배열에 값이 정상적으로 저장 되었는지
        }
    }
}


/**
 * 강의를 들으면서 while문 안쓰던게 뽀록남....
 * 뭐랄까... 쓸 줄은 아는데 설명은 못하는..?
 *
 * while(조건) 조건을 만족해야 반복
 * for(변수;연산;증감;) 연산이 만족할 때 까지 반복
 *
 * 내가 한 설명 두 개 합친거;;
 */
