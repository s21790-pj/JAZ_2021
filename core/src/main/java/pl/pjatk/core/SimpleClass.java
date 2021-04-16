package pl.pjatk.core;

public class SimpleClass {
    private int value1;
    private int value2;
    public String text1;

    public SimpleClass(int value1, int value2, String text1) {
        this.value1 = value1;
        this.value2 = value2;
        this.text1 = text1;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public String getText1() {
        return text1;
    }

    public void shoutSomething(){
        System.out.println("Hello from SimpleClass method");
    }
}
