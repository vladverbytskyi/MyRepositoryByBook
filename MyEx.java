class MyEx extends Exception{ }

public class ExTestDrive {
    public static void main (String[] args) {
        String test = args[0];

    }

    static void doRisky (String t) throws MyEx {
        System.out.println("h");
    }
}