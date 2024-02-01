package org.launchcode;

public interface OpticalDisc {
    void spinDisc();
    void writeData(String data);
    String readData();
    String reportInformation();
}
