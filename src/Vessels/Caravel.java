package Vessels;

public class Caravel implements Vessel{
    private int vesselSize;

    public Caravel(){
        this.vesselSize = 2;
    }

    @Override
    public void getHit() {
        this.vesselSize--;
    }

    @Override
    public int getVesselSize(){
        return this.vesselSize;
    }
}
