public class keyExercise3_6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c = new Circle(0, 0, 10);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c = new Circle(0, 0, -15);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c.setRadius(12);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
    }

    public static class Circle {
        private int x;
        private int y;
        private double radius;
        private static double maxRadius;
        public Circle(){
            this(0, 0, 0);
        }

        public Circle(int x, int y, double radius){
            setX(x);
            setY(y);
            setRadius(radius);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = Math.max(radius, 0);
            if (maxRadius < this.radius) {
                maxRadius = this.radius;
            }
        }

        //TODO: Add your getMaxRadius() method here
        public static double getMaxRadius() {
            return maxRadius;
        }
    }
}

