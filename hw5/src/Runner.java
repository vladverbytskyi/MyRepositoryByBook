public class Runner {


    public void runApp() {
        MyList<Double> myList = new MyList<>();
        myList.addArgument(45D);
        myList.addArgument(425D);
        myList.addArgument(412D);
        myList.addArgument(1D);
        myList.addArgument(0D);
        System.out.println("Largest value is: " + myList.getMax(myList.getList()));
        System.out.println("Smallest value is: " + myList.getMin(myList.getList()));
    }
}
