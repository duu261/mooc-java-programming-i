
import java.util.ArrayList;

public class Sum {

    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;
        if (!(nums.size() == 0)) {
            for (Integer num : nums) {
                sum += num;
            }
            return sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Try your method here
    }

}
