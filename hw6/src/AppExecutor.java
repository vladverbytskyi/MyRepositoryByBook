class AppExecutor {
    static void runApp() {
        new ListActions().addNumbers();
        new Fruits().replaceFruits();
        new ElementChecker().checkElement();
        new ValuesActions().sortElement();
    }
}
