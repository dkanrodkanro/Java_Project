// 유튜버 생활코딩의 Java 입문 수업 재생목록에서 36번 영상 조건문(2/4): else
package basic.org.opentutorials.javatutorials.condition;

public class ElseDemo {

    public static void main(String[] args){

        if(false){  // if문의 조건절이 true이면 if문에 따라오는 {}안의 내용을 실행한다. 그 후 if문 전체를 탈출한다.

            System.out.println(1);

        } else if(true){    // if문의 조건절이 false이고 else if문의 조건절이 true이면 else if문에 따라오는 {}안의 내용을 실행한다.
            // 그 후 if문 전체를 탈출한다.

            System.out.println(2);

        } else if(true){    // 위에 있는 if문과 else if문들이 false이고 해당 else if문의 조건절이 true이면 해당 else if문에 따라오는
            // {}안의 내용을 실행한다. 그 후 if문 전체를 탈출한다.

            System.out.println(3);

        } else {    // 위에 있는 if문과 else if문들이 다 false이면 else문에 따라오는 {}안의 내용을 실행한다. 그 후 if문 전체를 탈출한다.

            System.out.println(4);

        }

    }

}
