package chapter02;

import org.junit.jupiter.api.Test;


public class Chapter0202 {
    // 정수 타입
    // byte, char, short, int, long

    // 실수 타입
    // float, double

    // 논리 타입
    // boolean

    @Test
    void c0202_기본타입_int (){
        int var1 = 0b1011; // 2진수
        System.out.println("var1 = " + var1);
        int var2 = 0206; // 8진수
        System.out.println("var2 = " + var2);
        int var3 = 365; // 10진수
        System.out.println("var3 = " + var3);
        int var4 = 0xB3; // 16진수
        System.out.println("var4 = " + var4);
    }

    @Test
    void c0202_기본타입_byte(){
        byte var1 = -128;
        System.out.println("var1 = " + var1);
        byte var2 = -30;
        System.out.println("var2 = " + var2);
        byte var3 = 0;
        System.out.println("var3 = " + var3);
        byte var4 = 30;
        System.out.println("var4 = " + var4);
        byte var5 = 127;
        System.out.println("var5 = " + var5);
        //byte var6 = 128; 범위 초과
    }

    @Test
    void c0202_기본타입_long(){
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 100000000000; L을 안붙이면 integer로 생각한다.
        long var4 = 100000000000L; // 그렇기 때문에 L을 붙여야 더 넓은 범위를 사용할수있다.
    }

    // 유니코드로 변환되어 저장됨
    // 유니코드는 세계 각국의 문자를 2byte로 표현할 수 있는 숫자(0~65535)로 매핑한 국제 표준 규약
    // 자바는 이러한 유니코드를 저장할 수 있도록 2byte 크기인 char 타입을 제공
    @Test
    void c0202_기본타입_char(){
        char c1 = 'A'; //문자를 직접 저장
        System.out.println("c1 = " + c1);
        char c2 = 65; //10진수로 저장
        System.out.println("c2 = " + c2);
        char c3 = '\u0041'; //16진수로 저장
        System.out.println("c3 = " + c3);

        char c4 = '가'; //문자를 직접 저장
        System.out.println("c4 = " + c4);
        char c5 = 44032; //10진수로 저장
        System.out.println("c5 = " + c5);
        char c6 = '\uac00'; //16진수로 저장
        System.out.println("c6 = " + c6);
    }

    @Test
    void c0202_기본타입_String(){
        String name = "홍길동";
        System.out.println("name = " + name);
        String job = "프로그래머";
        System.out.println("job = " + job);
    }

    @Test
    void c0202_기본타입_Escape(){
        System.out.println("번호 \t이름\t 직업");
        System.out.println("행 단위 출력\n");
        System.out.println("행 단위 출력\n");
        System.out.println("dnflsms \"개발자\" 입니다.");
        System.out.println("봄\\여름\\가을\\겨울");
    }

    @Test
    void c0202_기본타입_실수타입(){
        // 실수값 저장
        // float var1 = 3.14; 컴파일 에러 float은 뒤에 f를 붙여줘야한다.
        float var2 = 3.14f;
        System.out.println("var2 = " + var2);
        double var3 = 3.14;
        System.out.println("var3 = " + var3);


        // 정밀도 테스트
        float var4 = 0.123456780123456789f;
        System.out.println("var4 = " + var4);
        double var5 = 0.1234567890123456789;
        System.out.println("var5 = " + var5);

        //e 사용하기 5e2 = 5.0 x 10의 2제곱 = 500.0
        double var6 = 3e6;
        System.out.println("3e6 = " + var6);
        float var7 = 3e6F;
        System.out.println("3e6F = " + var7);
        double var8 = 2e-3;
        System.out.println("2e-3 = " + var8);
    }

    @Test
    void c0202_기본타입_boolean(){
        boolean stop = true;
        if (stop) {
            System.out.println("중지");
        } else {
            System.out.println("시작합니다.");
        }

    }


    @Test
    void c0202_기본타입(){

    }


}
