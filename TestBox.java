public class TestBox {
    Integer i;
    int j;
    public static void main (String [] args) {
        TestBox t = new TestBox();
        t.go();
    }
    public void go() {

        i = j;
        System.out.println(j);
        System.out.println(i);
    }
}
