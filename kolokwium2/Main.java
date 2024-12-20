public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Legolas", 13, "krasnal");
        Elf elf2 = new Elf("Milord", 17, "krasnalud");
        Elf elf3 = new Elf("Adam", 31, "krasnalek");
        elf1.przedstawSie();
        elf2.przedstawSie();
        elf3.przedstawSie();

        System.out.println(elf1);
        System.out.println(elf2);
        System.out.println(elf3);

        Renifer renifer1 = new Renifer("Rudolf", 20);
        Renifer renifer2 = new Renifer("Rudy", 25);
        Renifer renifer3 = new Renifer("Ruda", 30);

        System.out.println(renifer1);
        System.out.println(renifer2);
        System.out.println(renifer3);

        System.out.println(elf1.hashCode());
        renifer1.nakarmRenifera();
    }
}