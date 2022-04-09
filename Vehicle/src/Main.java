public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(36);

        mercedes.accelerate(10);
        System.out.println(mercedes.getLoadCapacity());
    }
}
