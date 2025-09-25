package org.example;

public class FacadePattern {
    public static void main(String[] args) {
        Amplifier ap = new Amplifier("Top-of-Line");
        DVDPlayer dp = new DVDPlayer("Super-DVD-PLAYER!!!!");
        Lights lg = new Lights("Theatre Lights");
        Projector pj = new Projector("Theatre Projector");
        Screen sc = new Screen("Theatre Screen");

        TheaterFacade tf = new TheaterFacade(ap, dp, lg, pj, sc);
        tf.watchMovie("BEBAMAX");
        tf.endMovie();
    }
}