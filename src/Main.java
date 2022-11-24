public class Main {

    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(2);
        boolean add = stringMagicBox.add("123");
        boolean add1 = stringMagicBox.add("456");
        boolean add2 = stringMagicBox.add("789");

        System.out.println(add+ " " + add1+ " "+ add2);

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}