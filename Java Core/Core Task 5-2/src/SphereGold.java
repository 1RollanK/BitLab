class SphereGold extends GoldShape {
    private final double radius;

    public SphereGold(double radius) {
        this.radius = radius;
    }
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}