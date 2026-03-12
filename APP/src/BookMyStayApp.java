public class BookMyStayApp {

    abstract static class Room {
        protected int numberOfBeds;
        protected int squareFeet;
        protected double pricePerNight;

        public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
            this.numberOfBeds = numberOfBeds;
            this.squareFeet = squareFeet;
            this.pricePerNight = pricePerNight;
        }

        public void displayRoomDetails() {
            System.out.println("Beds: " + numberOfBeds);
            System.out.println("Size: " + squareFeet + " sq ft");
            System.out.println("Price per night: " + pricePerNight+" INR");
        }
    }

    static class SingleRoom extends Room {
        public SingleRoom() {
            super(1, 200, 1100);
        }
    }

    static class DoubleRoom extends Room {
        public DoubleRoom() {
            super(2, 350, 2180);
        }
    }

    static class SuiteRoom extends Room {
        public SuiteRoom() {
            super(3, 600, 3500);
        }
    }

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;
        System.out.println("\n");
        System.out.println("===== ROOM TYPES & AVAILABILITY =====\n");

        System.out.println("Single Room");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailability + "\n");

        System.out.println("Double Room");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailability + "\n");

        System.out.println("Suite Room");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailability + "\n");

        System.out.println("=====================================");
    }
}