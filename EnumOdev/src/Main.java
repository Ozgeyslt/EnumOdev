// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(SolarSystem.Planets planet: SolarSystem.Planets.values())
        {
            System.out.println("Planet: " + planet.name());
            System.out.println("Placement: " + planet.getPlacement());
            System.out.println("Distance: " + planet.getDistance());
            System.out.println("Radius: " + planet.getRadius());
            System.out.println("Rotation Time: " + planet.getRotationTime());
            System.out.println();
        }
    }
}