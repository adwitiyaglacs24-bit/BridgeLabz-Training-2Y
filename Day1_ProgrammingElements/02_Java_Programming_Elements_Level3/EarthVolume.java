public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;  // radius in kilometers
        double radiusMiles = radiusKm * 0.621371; // convert km to miles

        // Volume formula: (4/3) * π * r^3
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
