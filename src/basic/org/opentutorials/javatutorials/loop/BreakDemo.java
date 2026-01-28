// 유튜버 생활코딩 Java 입문수업 재생목록 46번 영상 Java - 반복문(4/5):break, continue
package basic.org.opentutorials.javatutorials.loop;

public class BreakDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {

                break;

            }

            System.out.println("Coding Everybody" + i);

        }

    }

}
