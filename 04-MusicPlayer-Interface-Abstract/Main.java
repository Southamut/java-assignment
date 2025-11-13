public class Main {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        Smartphone smartphone = new Smartphone();

        //connect and play music
        cdPlayer.connect();
        cdPlayer.play();
        System.out.println("--------------------------------");
        smartphone.connect();
        smartphone.play();
    }
}

interface Playable {
    void play();
}

abstract class MusicDevice {
    private String brand;
    abstract void connect();

    void info() {
        System.out.println("brand of the device: " + brand);
    }
}

class CDPlayer extends MusicDevice implements Playable {
    public void connect() {
        System.out.println("connecting CD...");
    }
    public void play() {
        System.out.println("playing music from CD");
    }
}

class Smartphone extends MusicDevice implements Playable {
    public void connect() {
        System.out.println("connecting through Bluetooth...");
    }
    public void play() {
        System.out.println("playing music from Sportify");
    }
}