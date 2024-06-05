import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.");
        // readline() 사용해서 스캔받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 아래처럼 사용하면 무조건 try-catch 사용
//        String s = reader.readLine();
//        int i=Integer.parseInt(reader.readLine());

        //try catch 사용한 경우
//        try {
//            String s = reader.readLine();
//            int i = Integer.parseInt(reader.readLine());
//            for (int j = 0; j < i; j++) {
//                System.out.println(s);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //
//        String s = reader.readLine();
//        int i = Integer.parseInt(reader.readLine());
//        System.out.println(s);
//        System.out.println(i);
//
//        /* read한 데이터는 line 단위로만 나눠지기에 공백 단위로 데이터를 가공하렴녀 따로 작업을 해주어야하는데
//           1. StringTokenizer에 nextToken() 함수를 쓰면 readLine() 을 통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출가능
//           2. String.split() 함수 사용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용하는 방식
//        */
//        // StringTokenizer
//        StringTokenizer st = new StringTokenizer(s); // 입력값이 12면
//        int a = Integer.parseInt(st.nextToken()); // 출력 1
//        int b = Integer.parseInt(st.nextToken()); // 출력 2
//        System.out.println(a);
//        System.out.println(b);
//
//        // split() 사용
//        String str= reader.readLine();
//        String arr[] = str.split(",");
//        for(int j=0;j<arr.length;j++){
//            System.out.println(arr[j]);
//        }

        // BufferedWriter
        // 이 경우에는 buffer를 잡아두었기 대문에 반드시!! flush() close()를 반드시 호출해 뒤처리 해야함
        // bw.write()에는 sout과 같이 자동개행기능이 없기 때문에 필요한 경우 반드시 \n을 통해 처리해야함
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s3 = "abcdefg";   //출력할 문자열
        bw.write(s3+"\n");   //버퍼에 있는 값 전부 출력
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음

        // 참고: https://m.blog.naver.com/ka28/221850826909
    }
}