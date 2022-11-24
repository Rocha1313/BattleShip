package Vessels;

public class TorpedoBoat implements Vessel{
    private int vesselSize;

    public TorpedoBoat(){
        this.vesselSize = 3;
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
