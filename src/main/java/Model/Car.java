package Model;

public class Car extends Vehicle {

    private int ajtok_szama;

    public Car(String type, String marka, int ajtok_szama) {
        super(type, marka);
        this.ajtok_szama = ajtok_szama;
    }

    @Override
    public String toString() {
        return "{ Type=" + super.getType() +
                ", ajtok_szama=" + ajtok_szama +
                ", marka=" + super.getMarka() +
                '}';
    }
}
