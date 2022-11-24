package Vessels;

public class Submarine implements Vessel{

    private int vesselSize;

    public Submarine(){
        this.vesselSize = 1;
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
