package chapter02;

import org.junit.jupiter.api.Test;


public class Chapter0203 {


    // 자동 타입 변환 : 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생. 반대는 에러.
    @Test
    void c0203_자동타입변환(){
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 = " + charValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);
    }

    // 강제 타입 변환
    // = 캐스팅 연산자 괄호 ()를 사용하는데, 괄호 안에 들어가는 타입은 나누는 단위입니다.
    // 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입
    @Test
    void c0203_타입변환_casting(){
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println("charValue = " + charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }

    @Test
    void c0203_타입변환_Byte자동변환toInt(){
        byte result1 = 10 + 20;
        System.out.println("result1 = " + result1);

        byte x = 20;
        byte y = 20;
        int result2 = x + y;
        System.out.println("result2 = " + result2);
    }

    @Test
    void c0203_타입변환_Long자동변환(){
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println("result = " + result);
    }

    @Test
    void c0203_타입변환_실수연산(){
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        byte byteValue3 = byteValue1 = byteValue2; // compile 에러 안나는데..? java version에 따라 다르거나 책저자가 잘못생각했거나

        int intValue1 = byteValue1 = byteValue2;
        System.out.println("intValue1 = " + intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; // comepile error
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 = " + intValue2);
        System.out.println("출력문자 = " + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println("intValue4 = " + intValue4);

        int intValue5 = 10;
        //int intValue6 = 10 / 4.0;
        double doubleValue = intValue5 / 4.0;
        System.out.println("doubleValue = " + doubleValue);

        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println("result = " + result);
    }

    @Test
    void c0203_타입변환_연산에서의_문자열_자동타입변환(){
        int value = 10 + 2 + 8;
        System.out.println("value = " + value);

        String str1 = 10 + 2 + "8";
        System.out.println("str1 = " + str1);

        String str2 = 10 + "2" + 8;
        System.out.println("str2 = " + str2);

        String str3 = "10" + 2 + 8;
        System.out.println("str3 = " + str3);

        String str4 = "10" + (2 + 8);
        System.out.println("str4 = " + str4);
    }

    @Test
    void c0203_타입변환_기본타입과_문자열_간의_변환(){
        int value1 = Integer.parseInt("10");
        System.out.println("value1 = " + value1);
        double value2 = Double.parseDouble("3.14");
        System.out.println("value2 = " + value2);
        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf(10);
        System.out.println("str1 = " + str1);
        String str2 = String.valueOf(3.14);
        System.out.println("str2 = " + str2);
        String str3 = String.valueOf(true);
        System.out.println("str3 = " + str3);
    }


    @Test
    void c0203_타입변환(){

    }


}
