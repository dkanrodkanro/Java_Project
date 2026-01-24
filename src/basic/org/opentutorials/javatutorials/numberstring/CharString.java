// 생활코딩 자바 입문 수업 재생목록 19번 영상 문자열 부분
package basic.org.opentutorials.javatutorials.numberstring;

public class CharString {

    public static void main(String[] args){

        System.out.println('생');        // 문자는 홀따옴표''로 감싼다.
        System.out.println("생활코딩");     // 문자열은 쌍따옴표""로 감싼다. 문자도 쌍따옴표로 감쌀 수 있다. 왜냐하면 문자 하나도 문자열로
        // 취급되기 때문이다.
        System.out.println("생활코딩" + "입니다.");    // 문자열과 문자열을 결합할 때는 더하기를 쓰기도 한다.
        // System.out.println("egoing said "Welcome programing world"");이 문장은 오류다. 이 문장에서 표현하고자 하는게 "를 문자열의
        // 일부로 출력하는 것이지만 이렇게 하면 오류난다.
        System.out.println("egoing said \"Welcome programing world\""); // 이렇게 쌍따옴표앞에 역슬레시를 넣어야 쌍따옴표를 문자열의
        // 일부로 출력할 수 있다. 이러한 기법을 escape라고 하는데 쌍따옴표가 가진 문법적인 역할에서 도망쳐서 문자로 인식하도록 한다는 의미이다.
        System.out.println("egoing said\n\"Welcome programing world\""); // 역슬레시 뒤에 n이 오면 이 두 문자는 줄바꿈 기능을 가진
        // 기호로 해석된다.
        

    }

}
