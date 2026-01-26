package basic.org.opentutorials.javatutorials.condition;

public class SwitchDemo {

    public static void main(String[] args) {

        System.out.println("switch(1)");

        switch(1) {

            case 1:     // 얘 실행되면 밑에 애들 다 실행됨

                System.out.println("one");

            case 2:     // 얘 실행되면 얘 밑에 애들 다 실행됨. 위에는 안됨

                System.out.println("two");

            case 3:     // 얘처럼 맨 밑에 애는 자기만 실행됨

                System.out.println("three");


        }

        System.out.println("switch(2)");

        switch(2) {

            case 1:     // 얘 실행되면 밑에 애들 다 실행됨

                System.out.println("one");

            case 2:     // 얘 실행되면 얘 밑에 애들 다 실행됨. 위에는 안됨

                System.out.println("two");

            case 3:     // 얘처럼 맨 밑에 애는 자기만 실행됨

                System.out.println("three");


        }

        System.out.println("switch(3)");

        switch(3) {

            case 1:     // 얘 실행되면 밑에 애들 다 실행됨

                System.out.println("one");

            case 2:     // 얘 실행되면 얘 밑에 애들 다 실행됨. 위에는 안됨

                System.out.println("two");

            case 3:     // 얘처럼 맨 밑에 애는 자기만 실행됨

                System.out.println("three");


        }

        System.out.println("switch(1)");

        switch(1) { // 만약 case 1만 실행시키고 싶다면

            case 1:     // case 1의 맨 밑에 break;를 추가함

                System.out.println("one");
                break;

            case 2:

                System.out.println("two");
                break;

            case 3:

                System.out.println("three");
                break;

            default: // 상정한 조건에 없는 값이 switch의 조건절에 들어가면 default가 실행된다.

                System.out.println("default");
                break;


        }

    }

}
