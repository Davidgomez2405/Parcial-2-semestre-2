package Problem1;

public class EnumDresses {
    public enum EnumDress {
        BLOUSE("Red Blouse", "Long sleeve blouse with red details", 1),
        JEAN("Blue Jean", "Long blue jeans", 2),
        SHIRT("Blue T-shirt", "Blue short sleeve t-shirt", 3),
        COAT("Black coat", "A beautiful black coat", 4);

        private String garmentName;
        private String garmentDescription;
        private int shelfNumber;

        EnumDress(String garmentName, String garmentDescription, int shelfNumber) {
            this.garmentDescription = garmentDescription;
            this.garmentName = garmentName;
            this.shelfNumber = shelfNumber;
        }

        public String getGarmentName() {
            return garmentName;
        }

        public void setGarmentName(String garmentName) {
            this.garmentName = garmentName;
        }

        public String getGarmentDescription() {
            return garmentDescription;
        }

        public void setGarmentDescription(String garmentDescription) {
            this.garmentDescription = garmentDescription;
        }

        public int getShelfNumber() {
            return shelfNumber;
        }

        public void setShelfNumber(int shelfNumber) {
            this.shelfNumber = shelfNumber;
        }

        public void showDescription() {
            System.out.println(garmentDescription);
        }
    }
}

