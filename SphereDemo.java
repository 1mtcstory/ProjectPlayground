import java.util.Scanner;

public class SphereDemo {
    public static void main(String[] args) {
        int x = 0;
        double r;

        while (x < 3) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the sphere's radius: ");
            r = scan.nextDouble();

            Sphere newSphere = new Sphere();
            newSphere.SetRadius(r);

            // Calculate Surface Area
            newSphere.CalcSurfaceArea();
            System.out.println("Surface Area = " + newSphere.GetSurfaceArea());

            // Calculate Volume
            newSphere.CalcVolume();
            System.out.println("Volume = " + newSphere.GetVolume());

            switch (x) {
                case 0 -> newSphere.SetId(0);
                case 1 -> newSphere.SetId(2);
                case 2 -> newSphere.SetId(3);
            }

            x++;
        }
    }
}
