// Step 2: Create the HouseBuilder class implementing the Builder interface.
public class HouseBuilder {
    private int floors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasGarden;

    // Step 3: Provide setter methods for each attribute of the House.
    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    // Step 4: Create a build method to construct the House object.
    public House build() {
        return new House(floors, rooms, hasGarage, hasGarden);
    }
}
