package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;
    }


    @Override
    public String toString() {
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("desserts")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizers")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\nElena diner Menu\n" +
                "Appetizers" + appetizers.toString() + "\n" +
                "Main Courses" + mainCourses.toString() + "\n" +
                "Desserts" + desserts.toString() + "\n";
    }

    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }


}
