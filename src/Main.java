// Step 5: Client code to use the HouseBuilder to construct the House objects.
public class Main {
    public static void main(String[] args) {
        // Step 6: Use the HouseBuilder to create House objects step by step.
        House house1 = new HouseBuilder()
                .setFloors(2)
                .setRooms(4)
                .setHasGarage(true)
                .setHasGarden(true)
                .build();

        House house2 = new HouseBuilder()
                .setFloors(1)
                .setRooms(3)
                .setHasGarage(false)
                .setHasGarden(false)
                .build();

        // Step 7: Display the constructed House objects.
        System.out.println("House 1: " + house1);
        System.out.println("House 2: " + house2);
    }
}