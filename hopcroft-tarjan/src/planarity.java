import java.io.File;

/*** Object-oriented implementation of the Gries-Xue presentation of the Hopcroft-Tarjan planarity
 * algorithm.
 *
 * See the README for more information.
 *
 * @author Brady Sites */

public class planarity {

    public static void main(String[] args) {
        System.out.println("Is the graph planar? I haven't checked.");
        try {
            parseArgs(args);
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString());
        }
    }

    /*** Parses command-line arguments and processes them for use by the algorithm. If args do not
     * meet the program specification, this method throws an exception with an appropriate message
     * for the transgression.
     *
     * @param args
     * @throws IllegalArgumentException */
    private static void parseArgs(String[] args) throws IllegalArgumentException {
        // Must be two arguments
        if (args.length != 2) { throw new IllegalArgumentException("Invalid number of arguments"); }

        // Process first argument, mode of program
        String mode= args[0];
        if (!mode.contentEquals("test") && !mode.contentEquals("change")) {
            throw new IllegalArgumentException(
                "Specified action of program does not match its capabilities");
        }

        // Process second argument, filename
        String filename= args[1];
        File graph= new File("/" + filename);
        if (!graph.isFile()) {
            throw new IllegalArgumentException(
                "Specified file could not be located in the current directory");
        }

        /* At this point, we also need to make sure that the program
         * only accepts 'valid' file formats, but I have not defined what valid
         * means for this program yet.
         *
         * Largely, it will come down to formats that I can easily transform
         * into a Graph object, which I also have yet to implement. */
    }
}
