package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem item1 = new MenuItem("Steak", "A classic, can't ever go wrong with a good Steak.", 24.99, "main course");
        MenuItem item2 = new MenuItem("Cheese cake", "Finish your dinner with a slice of our rich and creamy cheese cake!",4.99, "desserts");
        MenuItem item3 = new MenuItem("Garlic Bread", "Start your meal off right, with our fresh garlic bread!", 8.99, "appetizers");
        MenuItem item4 = new MenuItem("Salmon", "Fresh salmon, served over a warm bed of wild rice.", 19.99 ,  "main course");
        MenuItem item5 = new MenuItem("Pasta", "Spaghetti served with our home-made sauce!",  17.99 ,  "main course");

        System.out.println(item1.isNew());

        System.out.println(item1);



        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        //menu.removeItem(item4);
        //System.out.println(menu);







    }
}
