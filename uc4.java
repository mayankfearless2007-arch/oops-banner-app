
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner rows inside an array
        String[] banner = {

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ***** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "     * "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ***** ",
                    " ***** ")
        };

        // Loop through array and print each row
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
