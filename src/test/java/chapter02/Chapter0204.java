package chapter02;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Chapter0204 {

    // %d = 정수, %6d = 6자리 정수. 등등
    @Test
    void c0204_변수와_시스템_입출력_Printf(){
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);
        System.out.printf("상품의 가격:%-6d원\n", value);
        System.out.printf("상품의 가격:%06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }

    @Test
    void c0204_변수와_시스템_입출력_입력된_내용을_변수에_저장() throws IOException {

    }

    //c0204_변수와_시스템_입출력_입력된_내용을_변수에_저장() 이후 내용은 실무에서 거의 안쓰므로 그냥 넘어감.
    public static void main(String[] args) throws IOException {
        int keyCode;
        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);
    }


    @Test
    void c0204_변수와_시스템_입출력(){

    }
}
