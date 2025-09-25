package org.example;

public class TheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvdp;
    private Lights lg;
    private Projector pj;
    private Screen sc;


    public TheaterFacade(Amplifier amp, DVDPlayer dvdp, Lights lg, Projector pj, Screen sc) {
        this.amp = amp;
        this.dvdp = dvdp;
        this.lg = lg;
        this.pj = pj;
        this.sc = sc;
    }

    public void watchMovie(String name) {
        System.out.println("Get ready to watch a movie...");
        pj.on();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        lg.on();
        sc.on();
        dvdp.on();
        dvdp.play(name);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdp.stop();
        dvdp.off();
        amp.off();
        pj.off();
    }

    public void watchConcert(String name) {
        System.out.println("Get ready to watch a concert...");
        pj.on();
        amp.on();
        amp.setStereoSound();
        amp.setVolume(70);
        dvdp.on();
        dvdp.play(name);
    }

    public void endConcert() {
        System.out.println("Shutting concert down...");
        dvdp.stop();
        dvdp.off();
        amp.off();
        pj.off();
    }

}

