package racingcar;
//아래 4줄 readline 쓰기 위함, try-catch 쓸때 사용
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

// throw 사용시

import camp.nextstep.edu.missionutils.Randoms;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Application {
    public static void main(String[] args) throws IOException {
        // TODO: 프로그램 구현
        // 경주할 자동차 이름 , 기준으로 입력받기
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String car[] = name.split(",", 5);

        // 게임 횟수 입력받기
        System.out.println("시도할 회수는 몇회인가요?");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int game = 0;
        try {
            game = Integer.parseInt(br2.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String drive[] = new String[car.length]; // 차의 주행 정보를 저장할 배열
        for (int i = 0; i < drive.length; i++) {
            drive[i] = "";
        }


        System.out.println("실행 결과");
        for (int i = 0; i < game; i++) { // 입력받은 횟수만큼 게임을 진행
            drive(car, drive);
            System.out.println();
        }

        // 제일 긴 주행거리 구하기
        int temp = 0;
        for (int i = 0; i < drive.length; i++) {
            if (drive[i].length() > temp) {
                temp = drive[i].length();
            }
        }

        // 가장 긴 주행거리 갖고 있는 차 출력
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < drive.length; i++) {
            if (drive[i].length() == temp) {
                System.out.print(car[i] + " ");
            }
        }
    }

    public static void drive(String[] car, String[] drive){
        for (int j = 0; j < drive.length; j++) {
            // 난수 발생시켜서 car[] length 만큼 크기를 지정하고, 그 배열에 stirng - 발생시켜서 저장하도록 하기
            int random = Randoms.pickNumberInRange(1, 9); // 난수를 매번 발생시킴
            if (random >= 4) {
                drive[j] += "-";
            }
            System.out.println(car[j] + " : " + drive[j]);
        }
    }
}
