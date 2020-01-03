package kostka;
import kostka.Kostka;

public class Main {

    public static void main(String[] args) {

        Kostka desetistenna = new Kostka(10);
        Kostka sestistenna = new Kostka();
        System.out.println(desetistenna.vratPocetSten());
        System.out.println(sestistenna.vratPocetSten());

        System.out.println("\n" + desetistenna);
        for (int i = 0; i < 10; i++){
            System.out.print(desetistenna.hod() + " ");
        }

        System.out.println("\n\n" + sestistenna);
        for (int i = 0; i < 10; i++){
            System.out.print(sestistenna.hod() + " ");
        }



    }
}
