package lecture_2;

public class Shop {
    public static Closet[] closets = new Closet[3];

    static {
        Closet closet1 = new Closet(
                "IKEA",
                "Luxury 325",
                2.5f,
                4f,
                1.5f,
                45_000.00
        );

        Closet closet2 = new Closet(
                "Cleopatra",
                "Super Length",
                3.5f,
                5f,
                3.5f,
                65_000.00
        );

        Closet closet3 = new Closet(
                "Polaris",
                "Popper Plip",
                2f,
                4f,
                2.5f,
                100_000.00
        );

        closets[0] = closet1;
        closets[1] = closet2;
        closets[2] = closet3;
    }

    public static Closet[] addCloset(Closet closet) {
        int lastIndex = closets.length - 1;
        int lastIndexNew = lastIndex + 1;

        for (int k = 0; k < closets.length; k++) {
            if (closets[k] == null) {
                closets[k] = closet;

                break;
            } else if (k + 1 == closets.length && closets[k] != null) {
                Closet[] arrCopy = closets;
                closets = new Closet[arrCopy.length + 1];

                for (int index = 0; index < arrCopy.length; index++) {
                    closets[index] = arrCopy[index];
                }

                closets[lastIndexNew] = closet;

                break;
            }
        }
        return closets;
    }

    public static void showClosets() {
        for (int index = 0; index < closets.length; index++) {
            System.out.println(closets[index].getManufacturer() +
                    " " + closets[index].getModel());
        }
    }
}
