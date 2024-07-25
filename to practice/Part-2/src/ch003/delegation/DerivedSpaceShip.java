package ch003.delegation;

import ch003.reuse.Detergent;

import java.io.PrintWriter;

public class DerivedSpaceShip extends SpaceShipControls {
    private String shipName;

    public DerivedSpaceShip(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String toString() {
        return shipName;
    }

    public static void main(String[] args) {
        DerivedSpaceShip ship = new DerivedSpaceShip("Aima-4563");
        ship.forward(100);
    }
}
