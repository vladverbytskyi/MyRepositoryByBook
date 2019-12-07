package ThirdHomework;

public class CountObject {
    static int count;

    CountObject() {
        count++;
    }

    public void countObject() {
        CountObject countObject = new CountObject();
        System.out.println("Creat objects -- " + CountObject.count);
        CountObject anotherObject = new CountObject();
        System.out.println("Creat objects -- " + CountObject.count);
        CountObject anyAnotherObject = new CountObject();
        System.out.println("Creat objects -- " + CountObject.count);
    }
}


