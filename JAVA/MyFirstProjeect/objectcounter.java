public class objectcounter {
    private static int objectcount = 0;

    public objectcounter() {
        objectcount++;
    }

    public void show() {
        System.out.println("total objects are " + objectcount);
    }

    public static void main(String[] args) {
        objectcounter obj1 = new objectcounter();
        objectcounter obj2 = new objectcounter();
        objectcounter obj3 = new objectcounter();
        obj2.show();
    }
}
