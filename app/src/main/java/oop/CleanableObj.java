package oop;

import java.lang.ref.Cleaner;

public class CleanableObj implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    private final int id;

    public CleanableObj(int objectId) {
        this.id = objectId;
        this.cleanable = CLEANER.register(this, () -> free(objectId));
    }

    public void read() {
        System.out.println(id + " is readed...");
    }

    private static void free(int id) {
        System.out.println(id + " is free...");
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
