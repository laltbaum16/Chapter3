public class multiplicationTable {
    public static void main (String [] args) {
        int rows = 0;
        int columns = 0;
        for (rows = 1; rows < 13; rows++) {
            for(columns = 1; columns < 13; columns++) {
                   System.out.print(columns * rows + "\t");
            }
            System.out.println("");
        }
    }
}