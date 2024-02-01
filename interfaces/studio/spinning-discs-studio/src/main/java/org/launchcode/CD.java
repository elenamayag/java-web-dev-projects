package org.launchcode;

public class CD extends BaseDisc {
    private int spinRate;
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    // Constructor for CD
    public CD(String name, int storageCapacity, int spinRate) {
        super(name, storageCapacity, "CD");
        this.spinRate = spinRate;
    }
    public int getSpinRate() {
        return spinRate;
    }
    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + spinRate + " rpm.");
    }
    @Override
    public void writeData(String data) {
        System.out.println("Writing data to the CD: " + data);
        setContents(data);
    }
    @Override
    public String readData() {
        String data = getContents();
        System.out.println("Reading data from the CD: " + data);
        return data;
    }
    @Override
    public String reportInformation() {
        return "Name: " + getName() +
                "\nStorage Capacity: " + getStorageCapacity() +
                "\nDisc Type: " + getDiscType() +
                "\nContents: " + getContents() +
                "\nSpin Rate: " + spinRate + " rpm";
    }
}