package dynamic;

/**
 * @author 南八
 */
public class B {
    private String name;

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
