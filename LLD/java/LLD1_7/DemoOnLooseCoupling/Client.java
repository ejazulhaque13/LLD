package LLD1_7.DemoOnLooseCoupling;

public class Client {
    public static void main(String[] args) {

        Car obj = new Car();

        obj.PlaySong();

        Sony sonyMusicSystem = new Sony();
        obj.SetMusicSystem(sonyMusicSystem);
        obj.PlaySong();

        Bose boseMusicSystem = new Bose();
        obj.SetMusicSystem(boseMusicSystem);
        obj.PlaySong();
    }
}
