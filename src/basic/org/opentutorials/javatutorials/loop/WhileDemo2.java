// 유튜버 생활코딩 Java 입문수업 재생목록 43번 영상 Java - 반목문(1/5): while
package basic.org.opentutorials.javatutorials.loop;

public class WhileDemo2 {

    public static void main(String[] args) {

        int i = 0;  // i의 값이 10보다 작다면 true, 크다면 false가 된다.

        while(i < 10) {

            System.out.println("Coding Everybody" + i);

            i++;    // i = i + 1; i의 값에 1을 더한다.

        }

    }

}
