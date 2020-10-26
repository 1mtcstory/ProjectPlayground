/***
 * Design and implement a class called Sphere with two instant variables that
 * represents the radius, and an ID. Instant variable should enforce the
 * encapsulation.
 * Beside the getters and setters, the class should have these methods as well:
 * Volume: calculates the volume of the shape
 * Area: calculates the surface area of the shape
 * toString: generates an appropriate string to provide the id and radius of the
 * instance
 * In driver class instantiate 3 spheres with ID of s0, s2, s3. Prompt the user to
 * enter the radius of all three. Then print the area and volume.
 *
 * https://www.youtube.com/watch?v=MBniqMKBEWY&ab_channel=MooMooMathandScience
 * https://www.youtube.com/watch?v=7vojilWXkMI&ab_channel=MathMotor
 * https://www.youtube.com/watch?v=WROccOAozXo&ab_channel=patrickJMT
 * https://www.youtube.com/watch?v=7vojilWXkMI&ab_channel=MathHelp.com
 *
 * A = 4πr2
 * V = (4/3)πr3
 */

public class Sphere {
    int id;
    private double area, volume, radius;
    // google formula of sphere

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public void CalcSurfaceArea() {
        radius = this.radius;
        area = (4 * Math.PI) * Math.pow(radius, 2);
        this.area = area;
    }

    public void CalcVolume() {
        radius = this.radius;
        volume = Math.pow(radius, 3);
        volume = ((volume / 3) * 4) * Math.PI;
        this.volume = volume;
    }

    public double GetSurfaceArea() {
        area = this.area;
        return area;
    }

    public double GetVolume() {
        volume = this.volume;
        return volume;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String toString() {
        String result = Integer.toString(id);
        result = "s" + result;

        return result;
    }
}
