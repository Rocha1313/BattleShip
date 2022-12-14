package Game.Vessels;

public class AeroCarrier implements Vessel{

    final String name = "AeroCarrier";
    private int vesselSize;
    int[][] positions = new int[5][2];

    public AeroCarrier(){
        this.vesselSize = 5;
        for (int[] i : positions){
            i[0] = -1;
            i[1] = -1;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void getHit() {
        this.vesselSize--;
    }

    @Override
    public int getVesselSize(){
        return this.vesselSize;
    }

    @Override
    public void setPositions(int[] position) {
        for (int i = 0; i < positions.length; i++){
            if (positions[i][0] == -1){
                positions[i][0] = position[0];
                positions[i][1] = position[1];
                return;
            }
        }
    }

    @Override
    public int[][] getPositions() {
        return this.positions;
    }
}
