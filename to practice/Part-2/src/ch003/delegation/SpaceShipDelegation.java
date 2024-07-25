package ch003.delegation;

import ch003.reuse.SprinklerSystem;

public class SpaceShipDelegation {
    private String shipName;

    // SpaceShipControls sınıfının bir örneğini oluşturuyoruz
    private SpaceShipControls controls = new SpaceShipControls();

    // Constructor (yapıcı metod)
    public SpaceShipDelegation(String shipName) {
        this.shipName = shipName;
    }

    // Delegated methods (yönlendirilmiş metodlar)
    public void down(int velocity) {
        controls.down(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public static void main(String[] args) {
        // SpaceShipDelegation sınıfının bir örneğini oluşturuyoruz
        SpaceShipDelegation delegation = new SpaceShipDelegation("deleGateShip-0432X_Ar2");

        // down metodunu çağırıyoruz ve ekrana sonucu yazdırıyoruz
        delegation.down(10);
        System.out.println("Gemi aşağı iniyor, hız: 10");

        // forward metodunu çağırıyoruz ve ekrana sonucu yazdırıyoruz
        delegation.forward(20);
        System.out.println("Gemi ileri gidiyor, hız: 20");

        // left metodunu çağırıyoruz ve ekrana sonucu yazdırıyoruz
        delegation.left(5);
        System.out.println("Gemi sola dönüyor, hız: 5");
    }
}
