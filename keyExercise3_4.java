
public class keyExercise3_4 {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println(c.getArea());
        c = new Circle(1, 2, 5);
        System.out.println(c.getArea());

    }

    public static class Circle {
        private int x;
        // ...
        private int y;
        private double radius;
        public Circle(){
            this(0, 0, 0);
        }

        public Circle(int x, int y, double radius){
            this.x = x;
            // ...
            this.y = y;
            this.radius = radius;
        }

        public int getArea(){
            double area = Math.PI * Math.pow(radius, 2);
            return (int)area;
        }

    }
}
