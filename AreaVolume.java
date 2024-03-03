import java.util.Scanner;

abstract class Shape {
    abstract double calcArea();
    abstract double calcVolume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calcVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    double radius;
    double height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calcArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double calcVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calcArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calcVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Box extends Shape {
    double length;
    double breadth;
    double height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calcArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    @Override
    double calcVolume() {
        return length * breadth * height;
    }
}

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere:");
        double sphereRadius = scanner.nextDouble();
        Shape sphere = new Sphere(sphereRadius);

        System.out.println("Enter the radius and height of the cone:");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Shape cone = new Cone(coneRadius, coneHeight);

        System.out.println("Enter the radius and height of the cylinder:");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Shape cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        System.out.println("Enter the length, breadth, and height of the box:");
        double boxLength = scanner.nextDouble();
        double boxBreadth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Shape box = new Box(boxLength, boxBreadth, boxHeight);

        System.out.println("Sphere Area: " + sphere.calcArea());
        System.out.println("Sphere Volume: " + sphere.calcVolume());
        System.out.println();

        System.out.println("Cone Area: " + cone.calcArea());
        System.out.println("Cone Volume: " + cone.calcVolume());
        System.out.println();

        System.out.println("Cylinder Area: " + cylinder.calcArea());
        System.out.println("Cylinder Volume: " + cylinder.calcVolume());
        System.out.println();

        System.out.println("Box Area: " + box.calcArea());
        System.out.println("Box Volume: " + box.calcVolume());
        System.out.println();

        scanner.close();
    }
}
