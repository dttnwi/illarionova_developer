public class Stroki_test {
    public static void main(String[] args) {
        StringStorage storage = new StringStorage();
        storage.addString("Apple");
        storage.addString("Banana");
        storage.addString("Kiwi");
        storage.addString("Strawberry");
        storage.printStrings();
        System.out.println("Longest string: " + storage.getMaxString());
        System.out.println("Average length: " + storage.getAverageLength());
    }
}
