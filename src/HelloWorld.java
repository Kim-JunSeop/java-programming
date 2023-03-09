
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int value;
        Dummy myDummy = new Dummy();

        myDummy.setAtr(123);
        value = myDummy.getAtr();
        System.out.println(value);
    }
}