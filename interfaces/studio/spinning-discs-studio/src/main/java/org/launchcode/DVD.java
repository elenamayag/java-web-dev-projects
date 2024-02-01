package org.launchcode;

public class DVD extends BaseDisc {
    private int spinRate;
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    // Constructor for DVD
    public DVD(String name, int storageCapacity, int spinRate) {
        super(name, storageCapacity, "DVD");
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
        System.out.println("A DVD spin at a rate of " + spinRate + " rpm.");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to the DVD: " + data);
        setContents(data);
    }

    @Override
    public String readData() {
        String data = getContents();
        System.out.println("Reading data from the DVD: " + data);
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