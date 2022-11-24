package Vessels;

public class Corvettes implements Vessel{
    private int vesselSize;

    public Corvettes(){
        this.vesselSize = 4;
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
