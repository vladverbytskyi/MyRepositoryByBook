class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }
    StaticSuper() {
        System.out.println("Родиельский конструктор");
    }
}

class StaticTests extends StaticSuper {
    static int rand;
    static  {
        rand = (int) (Math.random() * 6);
        System.out.println("Статический блок " + rand);
    }

    StaticTests() {
        System.out.println("Конструктор");
    }
    public static void main (String [] args) {
        System.out.println("Внутри main");
        StaticTests st = new StaticTests();
    }
}
