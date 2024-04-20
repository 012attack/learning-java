package chapter03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Chapter0302 {


    @Test
    void c0302_연산자_증감(){
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x = " + x);

        y--;
        --y;
        System.out.println("y = " + y);

        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }

    @Test
    void c0302_연산자_논리부정연산자(){
        boolean play = true;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);
    }

    @Test
    void c0302_연산자_산술연산자(){
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1 = " + result1);

        int result2 = v1- v2;
        System.out.println("result2 = " + result2);

        int result3 = v1 * v2;
        System.out.println("result3 = " + result3);

        int result4 = v1 / v2;
        System.out.println("result4 = " + result4);

        int result5 = v1 % v2;
        System.out.println("result5 = " + result5);

        double result6 = (double) v1 / v2;
        System.out.println("result6 = " + result6);
    }

    @Test
    @DisplayName("문자열 결합 연산자")
    void c0302_연산자_String_concat(){
        String str1 = "JDK" + 6.0;
        System.out.println("str1 = " + str1);
        String str2 = str1 + " 특징";
        System.out.println("str2 = " + str2);

        String str3 = "JDK" + 3 + 3.0;
        System.out.println("str3 = " + str3);
        String str4 = 3 + 3.0 + "JDK";
        System.out.println("str4 = " + str4);
    }

    @Test
    void c0302_비교_연산자(){
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        System.out.println("result1 = " + result1);
        boolean result2 = (num1 != num2);
        System.out.println("result2 = " + result2);
        boolean result3 = (num1 <= num2);
        System.out.println("result3 = " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4 = " + result4);
    }

    @Test
    void c0302_논리연산자(){
        int charCode = 'A';

        if((charCode>=65) & (charCode <= 90)){
            System.out.println("대문자군요");
        }

        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자군요");
        }

        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자군요");
        }

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요");
        }

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요");
        }


    }

    @Test
    void c0302_연산자_대입연산자(){
        int result = 0;
        result += 10;
        System.out.println("result = " + result);

        result -= 5;
        System.out.println("result = " + result);

        result *= 3;
        System.out.println("result = " + result);

        result /= 5;
        System.out.println("result = " + result);

        result %= 3;
        System.out.println("result = " + result);
    }

    @Test
    void c0302_연산자_삼항연산자(){
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println("grade = " + grade);
    }

    @Test
    void c0302_연산자(){

    }
}
