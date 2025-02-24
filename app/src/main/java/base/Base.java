package base;

public class Base {
    public static void main(String[] args) throws Exception {
        var obj = new Object();
        synchronized (obj) {
            obj.wait();
        }
    }
}
