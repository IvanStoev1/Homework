
public class Car {
    public static void main(String[] args) {
        byte age = 6;
        int price = 30000;

        boolean highClass = (age > 5 && price > 20000) || (age <= 5 && price > 40000);

        System.out.println(highClass);
    }
}
