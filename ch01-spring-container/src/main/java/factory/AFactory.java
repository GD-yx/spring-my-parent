package factory;

/**
 * @author 南八
 */
public class AFactory {
    private static A ainstance = new A();
    public static A createA(){
        return ainstance;
    }
    public A createB(){
        return ainstance;
    }
}
