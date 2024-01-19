package LLD1_7.DemoOnLooseCoupling;

public class Sony implements MusicSystem{
    @Override
    public void play()
    {
        System.out.println("Sony is playing the song");
    }

    @Override
    public void pause()
    {
        System.out.println("Sony is pausing the song");
    }

    @Override
    public void forward(int x) {System.out.println("Sony is forwarding the song by" + x);}

    @Override
    public void rewind(int x)
    {
        System.out.println("Sony is rewinding the song by" + x);
    }

    @Override
    public void setVolume(int level)
    {
        System.out.println("Sony is setting the volume the song by" + level);
    }
}
