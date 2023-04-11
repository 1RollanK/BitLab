class CubeGold extends GoldShape {
    private final double side;

    public CubeGold(double side) {
        this.side = side;
    }
    double getVolume() {
        return Math.pow(side, 3);
    }
}