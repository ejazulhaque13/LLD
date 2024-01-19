package LLD1_7.DemoOnLooseCoupling;

public class Bose implements MusicSystem{
    @Override
    public void play()
    {
        System.out.println("Bose is playing the song");
    }
    @Override
    public void pause()
    {
        System.out.println("Bose is pausing the song");
    }
    @Override
    public void forward(int x)
    {
        System.out.println("Bose is forwarding the song by" + x);
    }

    @Override
    public void rewind(int x)
    {
        System.out.println("Bose is rewinding the song by" + x);
    }

    @Override
    public void setVolume(int level)
    {
        System.out.println("Sony is setting volume to level = " + level);
    }
}
