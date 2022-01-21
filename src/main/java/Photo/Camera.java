package Photo;


public interface Camera {
    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhotograph();
    void breaking();
    boolean isBroken();
    public void ready();
}

/*
public interface Camera {
    default void doPhotograph(){

    }

    default void setCameraRoll(CameraRoll cameraRoll){

    }
}*/

/*

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
    @Value("X1")
    private String model;

    public Camera() {
    }

    public Camera(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}





public class Camera {
    private CameraRoll cameraRoll;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph(){
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
*/