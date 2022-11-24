public class Main {
    public static void main(String[] args) {
        MagicBox magicBox1 = new MagicBox<>(3);
        MagicBox magicBox2 = new MagicBox<>(2);
        MagicBox magicBox3 = new MagicBox<>(2);

        magicBox1.add(100);
        magicBox1.add(200);
        magicBox1.add(300);
        System.out.println(magicBox1.pick());

        magicBox2.add("Petya");
        magicBox2.add("Lexa");
        System.out.println(magicBox2.pick());

        magicBox3.add(1);
        System.out.println(magicBox3.pick());
    }
}
