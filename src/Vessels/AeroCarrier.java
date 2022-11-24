package Vessels;

public class AeroCarrier implements Vessel{
    private int vesselSize;

    public AeroCarrier(){
        this.vesselSize = 5;
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
