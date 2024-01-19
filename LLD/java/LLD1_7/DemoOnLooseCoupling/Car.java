package LLD1_7.DemoOnLooseCoupling;

public class Car {
    MusicSystem ms;

    void SetMusicSystem (MusicSystem ms)
    {
        this.ms = ms;
    }
    void StartEngine()
    {

    }
    void StopEngine()
    {

    }

    void PlaySong()
    {
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.play();
    }


    void PauseSong()
    {
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.pause();
    }
    void forwardSong(int x){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.forward(x);
    }

    void rewindSong(int x){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.rewind(x);
    }

    void setVolumeSong(int level){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.setVolume(level);
    }

}
