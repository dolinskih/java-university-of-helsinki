
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(11, 12, 2011);
        date.advance();
        System.out.println(date);
        date.advance(10);
        System.out.println(date);
    }
}
