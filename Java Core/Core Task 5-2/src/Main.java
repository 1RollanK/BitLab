import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GoldShape> goldShapes = new ArrayList<>();

        SphereGold sphereGold1 = new SphereGold(2.5);
        SphereGold sphereGold2 = new SphereGold(3.0);
        SphereGold sphereGold3 = new SphereGold(4.0);

        CubeGold cubeGold1 = new CubeGold(4.5);
        CubeGold cubeGold2 = new CubeGold(5.0);
        CubeGold cubeGold3 = new CubeGold(6.0);

        goldShapes.add(sphereGold1);
        goldShapes.add(sphereGold2);
        goldShapes.add(sphereGold3);
        goldShapes.add(cubeGold1);
        goldShapes.add(cubeGold2);
        goldShapes.add(cubeGold3);

        for (GoldShape goldShape : goldShapes) {
            System.out.println("Price for gold shape: $" + goldShape.getPrice());
        }
    }
}