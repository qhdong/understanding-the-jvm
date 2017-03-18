package gc;

public class Allocation {
    private static final int _1M = 1024 * 1024;

    private static void testAllocation() {
        byte[] allocation1 = new byte[2 * _1M];
        byte[] allocation2 = new byte[2 * _1M];
        byte[] allocation3 = new byte[2 * _1M];
        byte[] allocation4 = new byte[4 * _1M];
    }

    public static void main(String[] args) {
        testAllocation();
    }

}
