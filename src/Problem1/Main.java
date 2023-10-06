package Problem1;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<EnumDresses.EnumDress> dresses = EnumSet.allOf(EnumDresses.EnumDress.class);

        for (EnumDresses.EnumDress dress : dresses) {
            System.out.println("Garment Name: " + dress.getGarmentName());
            System.out.println("Garment Description: " + dress.getGarmentDescription());
            System.out.println("Shelf Number: " + dress.getShelfNumber());
            dress.showDescription();
        }
    }
}
