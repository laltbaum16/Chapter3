public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 12;
        printMultiplicationTable(tableSize);
        //setting the parameter tableSize
    }
    public static void printMultiplicationTable(int tableSize) {
        System.out.print("     ");
        for(int i = 1; i <= tableSize; i++ ) {
            //space between products
            System.out.print(i + "   ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        for(int i = 1 ; i<=tableSize; i++) {
            System.out.print(i + "|" );
            for(int j=1; j<=tableSize; j++) {
              if(i < 10) {
                  //formatting to try and line up columns
                  System.out.print("   " + (i*j));
              }
              if(i >= 10) {
                  //formatting to try and line up columns
                  System.out.print("  " + (i*j));
              }
            }
            System.out.println();
        }
    }
}
