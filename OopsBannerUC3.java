public class OopsBannerUC3 {

    public static void main(String[] args) {

        printLine(" ***** ", " ***** ", " ******", " ***** ");
        printLine("*     *", "*     *", "*     *", "*     *");
        printLine("*     *", "*     *", "*     *", "*      ");
        printLine("*     *", "*     *", " ******", " ***** ");
        printLine("*     *", "*     *", "*      ", "      *");
        printLine("*     *", "*     *", "*      ", "*     *");
        printLine(" ***** ", " ***** ", "*      ", " ***** ");
    }

    static void printLine(String a, String b, String c, String d) {
        System.out.println(String.join("   ", a, b, c, d));
    }
}
