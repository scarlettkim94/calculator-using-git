import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //5가지 연산 메뉴
        //1~5 중 선택
        //해당 연산을 실행
        while (true) {
            System.out.println("=========================");
            System.out.println("1.더하기");
            System.out.println("2.빼기");
            System.out.println("3.곱하기");
            System.out.println("4.나누기");
            System.out.println("5.나머지");
            System.out.println("q.종료 ");
            System.out.println(">>");

            System.out.println("연산자 >> ");
            String op = sc.nextLine();
            System.out.println("피연산자 1 >>");
            int a = Integer.parseInt(sc.nextLine()); // String -> int
            System.out.println("피연산자 2 >>");
            int b = Integer.parseInt(sc.nextLine());


            switch (op){
                case "1":
                    plus(a, b);
                    break;
                case "2":
                    minus(a, b);
                    break;
                case"3":
                    multiply(a, b);
                    break;
                case"4":
                    divide(a, b);
                    break;
                case"5":
                    modulo(a, b);
                    break;
                case"q":
                    return; //메서드 종료
            }
        }
    }

    private static void modulo(int a, int b) {
    }

    private static void divide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    private static void multiply(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a * b));
    }

    private static void minus(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private static void plus(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));

    }
}
