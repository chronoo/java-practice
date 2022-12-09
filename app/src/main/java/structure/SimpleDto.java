package structure;

public class SimpleDto {
    private final String name;
    private final int age;
    private final boolean isMale;

    public SimpleDto(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }
}
