public class Main {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer("Sony");
        Smartphone smartphone = new Smartphone("Apple");

        //connect and play music
        cdPlayer.info();
        cdPlayer.connect();
        cdPlayer.play();
        System.out.println("--------------------------------");
        smartphone.info();
        smartphone.connect();
        smartphone.play();
    }
}

interface Playable {
    void play();
}

abstract class MusicDevice {
    private String brand;

    MusicDevice(String brand) {
        this.brand = brand;
    }

    public abstract void connect();

    public void info() {
        System.out.println("brand of the device: " + brand);
    }
}

class CDPlayer extends MusicDevice implements Playable {
    CDPlayer(String brand) {
        super(brand);
    }
    public void connect() {
        System.out.println("connecting CD...");
    }
    public void play() {
        System.out.println("playing music from CD");
    }
}

class Smartphone extends MusicDevice implements Playable {
    Smartphone(String brand) {
        super(brand);
    }
    public void connect() {
        System.out.println("connecting through Bluetooth...");
    }
    public void play() {
        System.out.println("playing music from Sportify");
    }
}