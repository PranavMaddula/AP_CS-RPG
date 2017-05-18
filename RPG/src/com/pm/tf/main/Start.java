package com.pm.tf.main;

class Start {

    public static void main(String args[]) {

        if (args.length != 0 && args[0].equalsIgnoreCase("nogui")) Ui.guiEnabled = false;
        Ui.println("Loading..");

        //Check if current version is a developer version, if so, enable debug menu
        if (Version.get().contains("DEV")) {
            Debug.enable();
        }

        //Runs the game
        Menu.load();

        //Clears Console
        Ui.cls();
//test
    }
}

