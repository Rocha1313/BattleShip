package Game.Vessels;

public interface Vessel{
    final String name = null;
    int vesselSize = 0;
    int[][] positions = new int[0][0];

    String getName();
    void getHit();
    int getVesselSize();
    void setPositions(int[] position);
    int[][] getPositions();


}
