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

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String finish = new String();
        String stopQueue = new String();
        String printQueue = new String(); //요구사항 8 inquiry를 받을 문자열

        int a; // 첫 번째 숫자
        int b; // 두 번째 숫자
        char operand; // 연산자
        int result = 0; // switch 문 밖에서 선언하고 초기화

        // int[] resultArray = new int[10]; // 연산을 저장할 배열
        // int count = 0; // 연산이 저장될 때 마다 count증가 -> 배열을 Queue로 바꾸고 사용 X

        // 요구사항 7번 무한이 저장되는 컬렉션 프레임 사용
        Queue<Integer> resultQueue = new LinkedList<>();

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

            // 요구사항 7 Queue에서 remove를 사용하면 가장 먼저 저장된 결과 삭제
            resultQueue.offer(result);
            if(resultQueue.size() >= 2) { // remove는 큐가 비어있는 경우 예외가 발생하므로 예외 처리를 먼저 해줘야 함
                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                stopQueue = in.next();
                if (stopQueue.equals("remove")) {
                    resultQueue.remove();
                }
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회)");
            printQueue = in.next();
            if (printQueue.equals("inquiry")) {
                for(int value : resultQueue) { // 요구사항 8 향상된 for문을 사용하여 출력
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            System.out.print("더 계산하시겠습니까? (계속 계산하시려면 아무키나 입력해주세요. exit 입력 시 종료됩니다.)");
            finish = in.next();
            if(finish.equals("exit")) {
                break;
            } else {
                continue;
            }
        }
    }
}


/**
 * 요구사항 6번 하면서 이 부분이 제일 힘들었다..
 * 진짜 별거 아니었는데 결과를 저장하는 곳을 변경해야겠다는 생각을 너무 늦게 했다.
 * -> 계속 10번째 입력부터 값이 한 번 더 일찍 밀린 이유 때문에
 if (count > 9) {
 for (int i = 0; i < resultArray.length - 1; i++) {
 resultArray[i] = resultArray[i + 1];
 }
 count = 9;
 }
 resultArray[count] = result;
 count++;
 */
