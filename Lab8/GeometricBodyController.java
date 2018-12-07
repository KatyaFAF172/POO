package lab8;

public class GeometricBodyController {
    static GeometricBody getBiggestVolume(GeometricBody geometricBodies[]){
        GeometricBody biggestVolume = geometricBodies[0];
        for (GeometricBody body: geometricBodies){
            if (body.getVolume() > biggestVolume.getVolume()){
                biggestVolume = body;
            }
        }
        return biggestVolume;
    }
    static GeometricBody getBiggestArea(GeometricBody geometricBodies[]){
        GeometricBody biggestArea = geometricBodies[0];
        for (GeometricBody body: geometricBodies){
            if (body.getSurface() > biggestArea.getSurface())
                biggestArea = body;
        }
        return biggestArea;
    }
}
