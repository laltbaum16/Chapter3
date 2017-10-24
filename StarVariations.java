public class StarVariations {
    public static void main(String[] args) {
        drawPatternA();
        System.out.println();
        drawPatternB();
        System.out.println();
        //drawPatternC();
        //System.out.println();
        //drawPatternD();
        //System.out.println();
    }
    public static void drawPatternA() {
        for(int i = 10; i > 0; i--) {
            for(int j = 0; j < i; j++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawPatternB() {
        for(int i = 10; i > 0; i--) {
            for(int j = 10; j >= i; j--) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawPatternC() {
        //
    }
    public static void drawPatternD() {
        //
    }
}