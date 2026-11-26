
public class Animal {
    int weight, height;
    double speed;

    // First constructor
    Animal() {
        weight = 50;
        height = 4;
        speed = 2;
    }

    // Second constructor
    Animal(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    public double getTime(double miles) {
        return miles / speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }
}
