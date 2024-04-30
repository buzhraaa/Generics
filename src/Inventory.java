import java.util.ArrayList;

class Inventory<T extends Vehicle> {
    private ArrayList<T> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();
    }

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(T vehicle) {
        inventory.add(vehicle);
    }

    public boolean removeFromInventory(String vin) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getVin().equals(vin)) {
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }
}
