// 유튜버 생활코딩의 Java 입문 수업 재생목록에서 38번 영상 조건문(4/4): 조건문의 중첩
package basic.org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

    public static void main(String[] args) {

        String id = args[0];
        String password = args[1];

        if (id.equals("egoing")) {

            if (password.equals("111111")) {

                System.out.println("right");

            } else {

                System.out.println("wrong");

            }

        } else {

            System.out.println("wrong");

        }

    }

}
