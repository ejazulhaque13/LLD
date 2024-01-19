package LLD1_6;

public class Car {
    IEngine engine;

    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
}
