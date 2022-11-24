package Vessels;

public class AeroCarrier implements Vessel{
    private int vesselSize;

    @Override
    public void getHit() {
        this.vesselSize--;
    }

    @Override
    public int getVesselSize(){
        return this.vesselSize;
    }
}
