package LLD1_6;

public class HyundaiEngine implements IEngine{
    @Override
    public void start() {
        System.out.println("Hyudai logic of starting the Engine");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai logic of stopping the engine");
    }
}
