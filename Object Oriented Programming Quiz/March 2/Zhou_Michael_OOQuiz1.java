/**
 * Name: Michael Zhou
 * Date: March 2
 * Description: The main that calls upon the other classes
 */
public class Zhou_Michael_OOQuiz1 {

    public static void main(String[] args) {

        Human human1 = new Human("Joe", 80, 50);

        Vegetable vegetable1 = new Vegetable("carrot", 60, 20  );

        Cookie packagedCookie = new Cookie("packagedCookie",40, 50 ,true );

        Cookie unpackagedCookie = new Cookie("unpackagedCookie", 30, 50);

        Cookie defaultCookie = new Cookie();

        human1.eat(packagedCookie, 50);
        System.out.println();

        human1.eat(vegetable1, 400);
        System.out.println();

        System.out.println("Before eating unpackaged cookie");
        System.out.println(human1.toString());

        human1.eat(unpackagedCookie, 30);

        System.out.println();
        System.out.println("After eating unpackaged cookie");
        System.out.println(human1.toString());

    }
}
