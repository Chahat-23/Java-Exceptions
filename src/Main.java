//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Catch exception -
        try {
            int myInt = Integer.parseInt("pants"); //throws exception
            System.out.println(myInt);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Can't parse an Int out of a String!");
        }
        catch (Exception e) {
            System.out.println("An exception occured");
        }
        // catch ( NumberFormatException | Exception e) {
        //     System.out.println("Caught multiple exceptions");
        // }
    }
}