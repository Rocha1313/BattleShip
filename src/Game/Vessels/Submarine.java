package Game.Vessels;

public class Submarine implements Vessel{

    final String name = "Submarine";
    private int vesselSize;
    int[][] positions = new int[1][2];

    public Submarine(){
        this.vesselSize = 1;
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
        positions[0][0] = position[0];
        positions[0][1] = position[1];
    }

    @Override
    public int[][] getPositions() {
        return this.positions;
    }

}
