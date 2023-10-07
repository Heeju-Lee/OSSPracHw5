import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("학번을 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("학과를 입력하세요: ");
        String dep = sc.nextLine();

        System.out.print("학교를 입력하세요: ");
        String sch = sc.nextLine();

        //한 줄 엔터
        System.out.println();
        System.out.println("<출력>");
        System.out.println("이름: " + name);
        System.out.println("학번: " + id);
        System.out.println("학과: " + dep);
        System.out.println("학교: " + sch);

        sc.close();
    }
}