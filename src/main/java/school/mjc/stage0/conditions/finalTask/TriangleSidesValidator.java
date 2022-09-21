package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double mx = Math.max(Math.max(secondSide,firstSide),thirdSide);
        System.out.println(mx<firstSide+secondSide+thirdSide-mx?"this is a valid triangle": "it's not a triangle");
    }
}
