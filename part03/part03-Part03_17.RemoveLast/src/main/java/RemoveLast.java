
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> sList) {
        if (!(sList.size() == 0)) {
            sList.remove(sList.size() - 1);
            return;
        }
        return;
    }

    public static void main(String[] args) {
        // Try your method in here
        // BUG: IM 1 SHOOT 1 KILLS WHY TEST
    }

}
