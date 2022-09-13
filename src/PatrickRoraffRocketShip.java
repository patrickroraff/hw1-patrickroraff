public class PatrickRoraffRocketShip {
        public static final int SIZE = 3;
    public static void main(String[] args) {
        rocketHead();
        rocketDivider();
        rocketTop();
        rocketBottom();
        rocketDivider();
        rocketBottom();
        rocketTop();
        rocketDivider();
        rocketTop();
    }
    //Draw the top of the rocket
    public static void rocketHead() {
        for (int line = 1; line <= (SIZE * 2 - 1); line++) {
            System.out.print(" ");
            for (int spaces = 1; spaces <= (SIZE * 2 - 1) - line; spaces++){
                System.out.print(" ");
            }
            for (int slashes = 1; slashes <= line; slashes++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int slashes = 1; slashes <= line; slashes++) {
                System.out.print("\\");
            }
            System.out.println(" ");
        }
    }
    //Draw center section of the rocket, barrier between top, middle and bottom (line with stars and equal signs)
    public static void rocketDivider() {
        System.out.print("+");
        for (int i = 1; i <= SIZE * 2; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
    //rockets Top half and barrier between top of rocket and bottom
    public static void rocketTop() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int repeat = 1; repeat <= 2; repeat++) {
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
                for (int points = 1; points <= line; points++) {
                    System.out.print("/\\");
                }
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
    //Draws out the base of rocket
    public static void rocketBottom() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int repeat = 1; repeat <= 2; repeat++) {
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
                for (int points = 1; points <= line; points++) {
                    System.out.print("\\/");
                }
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
}