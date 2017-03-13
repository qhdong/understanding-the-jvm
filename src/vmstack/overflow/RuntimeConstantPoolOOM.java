package vmstack.overflow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 17-3-13.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++));
        }
    }
}
