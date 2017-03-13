package vmstack.overflow;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 堆内存溢出
 */
public class HeapOOM {
    private static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
