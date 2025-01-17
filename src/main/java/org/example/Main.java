package org.example;

class Main {
    public static void main(String[] args) {

        계산기.더한결과를_화면에_출력(10, 20);
        // 출력 => 결과 : 30

        계산기.더한결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 70

        계산기.뺀결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 30

        계산기.뺀결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 3

        계산기.곱한결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 10



        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21



        // 예시 시작
        int c = 20 + Math.더하기(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2= Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55



        int 결과3 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과3);
        // 출력 : 결과1 : 5

        int 결과4 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과4);
        // 출력 : 결과2 : 45




    }
}

class 계산기 {

    static void 더한결과를_화면에_출력(int a, int b) {
        System.out.println(a + b);
    }

    static void 뺀결과를_화면에_출력(int a, int b) {
        System.out.println(a - b);
    }

    static void 곱한결과를_화면에_출력(int a, int b) {
        System.out.println(a * b);
    }

    static int 합(int a, int b) {
        int c = a + b;
        return c;
    }

    static int 차(int a, int b) {
        int c = a - b;
        return c;
    }

    static int 곱(int a, int b) {
        int c = a * b;
        return c;
    }

}

class Math {
    // static => 본사직원
    // static은 현재 클래스에 지금당장 존재한다.
    static int 더하기(int a, int b) {
        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
        int c = a + b;

        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
        // return => 변신
        return c;
        }

    static int oneToSum(int a) {

        int c = 0;

        while(a > 0) {
            c += a;
            a--;
        }
        return c;
    }

    static int nToMSum(int a, int b) {
        int c = 0;
        while(a <= b) {
            c += a;
            a++;
        }
        return c;
    }
}