import java.util.HashMap;
import java.util.Map;

public class BookMyStayApp{

    static class RoomInventory {

        private Map<String, Integer> roomAvailability;

        public RoomInventory() {
            roomAvailability = new HashMap<>();
            initializeInventory();
        }

        private void initializeInventory() {
            roomAvailability.put("SingleRoom", 5);
            roomAvailability.put("DoubleRoom", 3);
            roomAvailability.put("SuiteRoom", 2);
        }

        public Map<String, Integer> getRoomAvailability() {
            return roomAvailability;
        }

        public void updateAvailability(String roomType, int count) {
            roomAvailability.put(roomType, count);
        }
    }

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("=== Hotel Room Inventory ===");

        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }

        System.out.println("\nUpdating SuiteRoom availability...\n");

        inventory.updateAvailability("SuiteRoom", 4);

        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }
    }
}