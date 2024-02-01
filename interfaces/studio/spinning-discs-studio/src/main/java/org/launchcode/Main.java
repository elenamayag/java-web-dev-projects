package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        // Create a CD object
        CD myCd = new CD("Music CD", 2000, 225);

        // Create a DVD object
        DVD myDvd = new DVD("Movie DVD", 11000, 1130);

        myCd.spinDisc();
        myDvd.spinDisc();

    }
}