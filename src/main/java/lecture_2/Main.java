package lecture_2;

public class Main {
    public static void main(String[] args) {
        Shop.showClosets();

        Closet closetNew = new Closet(
                "ergergerg",
                "ergergergeretg5rt",
                2.5f,
                4f,
                1.5f,
                45_000.00
        );

        Shop.addCloset(closetNew);

        System.out.println("-------");

        Shop.showClosets();
    }
}
