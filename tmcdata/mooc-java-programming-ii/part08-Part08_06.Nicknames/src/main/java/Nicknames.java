
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> naming = new HashMap<>();

        naming.put("matthew", "matt");
        naming.put("michael", "mix");
        naming.put("arthur", "artie");

        System.out.println(naming.get("matthew"));
    }

}
