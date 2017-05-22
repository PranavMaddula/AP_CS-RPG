package com.pm.tf.main;

class Version {
    private static final String VERSION = "1.0DEV";
    private static final String STAGE = "Alpha";
    private static final String DESC = "" //Award for "worse game description" goes to:
            //But seriously; add information that the user actually cares about
            + "Text-Fighter is a Text-Based\n"
            + "Fighter RPG game, completely\n"
            + "written in Java.\n\n";
    private static final String CHANGE_LOG = ""
            + "None";

    private Version() {
    }

    public static String get() {
        return VERSION;
    }

    public static String getStage() {
        return STAGE;
    }

    public static String getFull() {
        return STAGE + " " + VERSION;
    }

    public static String getDesc() {
        return DESC;
    }

    public static String getChange() {
        return CHANGE_LOG;
    }
}
