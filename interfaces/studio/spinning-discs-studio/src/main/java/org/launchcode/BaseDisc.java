package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    private String name;
    private int storageCapacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, int storageCapacity, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning the disc...");
    }

    @Override
    public void writeData(String data) {
        this.contents = data;
        System.out.println("Writing data to the disc: " + data);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from the disc: " + contents);
        return contents;
    }

    @Override
    public String reportInformation() {
        return "Name: " + name +
                "\nStorage Capacity: " + storageCapacity +
                "\nDisc Type: " + discType +
                "\nContents: " + contents;
    }
}