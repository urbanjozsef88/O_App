package Model;

public class Bicycle extends Vehicle {

    private int terhelhetoseg;

    public Bicycle(String type, String marka, int terhelhetoseg) {
        super(type, marka);
        this.terhelhetoseg = terhelhetoseg;
    }

    @Override
    public String toString() {
        return "{ Type=" + super.getType() +
                ", terhelhetoseg=" + terhelhetoseg +
                ", marka=" + super.getMarka() +
                '}';
    }
}
