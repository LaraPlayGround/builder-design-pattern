// Step 1: Create the House class representing the complex object.
public class House {
    private int floors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasGarden;

    public House(int floors, int rooms, boolean hasGarage, boolean hasGarden) {
        this.floors = floors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                '}';
    }
}