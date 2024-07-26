package ch004.the_final.final_arguments;

class KitchenTable {
    // This method is marked as final, so it cannot be overridden by subclasses.
    public final void buildTable() {
        System.out.println("Building a kitchen table...");
    }

    // This method is not final, so it can be overridden by subclasses.
    public void useMaterial() {
        System.out.println("Using wood...");
    }
}

class ModernKitchenTable extends KitchenTable {
    // It is possible to override this method.
    @Override
    public void useMaterial() {
        System.out.println("Using glass...");
    }

    // This method cannot be overridden because it is marked as final in the superclass.
    // @Override
    // public void buildTable() {
    //     System.out.println("Building a modern kitchen table...");
    // }
}

public class Table {
    public static void main(String[] args) {
        KitchenTable kitchenTable = new KitchenTable();
        ModernKitchenTable modernKitchenTable = new ModernKitchenTable();

        // Method call on KitchenTable object
        kitchenTable.buildTable(); // Building a kitchen table...
        kitchenTable.useMaterial(); // Using wood...

        // Method call on ModernKitchenTable object
        modernKitchenTable.buildTable(); // Building a kitchen table... (Cannot be overridden in subclass)
        modernKitchenTable.useMaterial(); // Using glass... (Can be overridden in subclass)
    }
}
