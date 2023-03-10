
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int value;
        Dummy myDummy = new Dummy();

        myDummy.setAttr(123);
        value = myDummy.getAttr();
        System.out.println(value);
    }
}