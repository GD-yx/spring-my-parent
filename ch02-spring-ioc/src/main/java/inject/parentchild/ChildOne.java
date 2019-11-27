package inject.parentchild;

/**
 * @author 南八
 */
public class ChildOne {
    private String childOne;

    @Override
    public String toString() {
        return "ChildOne{" +
                "childOne='" + childOne + '\'' +
                ", p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                '}';
    }

    String p1;
    String p2;

    public String getChildOne() {
        return childOne;
    }

    public void setChildOne(String childOne) {
        this.childOne = childOne;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
