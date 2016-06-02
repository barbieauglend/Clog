import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class BlogTester {
	public static void main(String[] args) {
		BlogConsole i = new BlogConsole();
                try {
                    i.runInterface();
                }
		catch (FileNotFoundException e) {
                    System.out.println("You entered an invalid file name");
		}
		catch (InputMismatchException e) {
                    System.out.println("Please format your input correctly");
		}
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please reformat your input");
                }
        }
}
