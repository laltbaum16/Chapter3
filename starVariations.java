
/**
 * Write a description of class starVariations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class starVariations
{
    public static void main(String[] args) {
        int biggestLine = 10;
        int currentLine = 0;
        for(currentLine = biggestLine; currentLine > 0; currentLine--) {
            for(int numberOfStars = 0; numberOfStars < currentLine; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        for(currentLine = biggestLine; currentLine > 0; currentLine--) {
            for(int numberOfStars = biggestLine; numberOfStars > currentLine - 1; numberOfStars--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
