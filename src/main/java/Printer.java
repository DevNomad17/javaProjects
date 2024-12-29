public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0)
            tonerLevel = -1;
        if (tonerLevel > 100)
            tonerLevel = -1;
        this.tonerLevel = tonerLevel;

        this.pagesPrinted = 0;

        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100)
            return -1;
        if ((tonerAmount + tonerLevel) > 100 || (tonerAmount + tonerLevel) < 0 )
            return -1;
        else
            tonerLevel+=tonerAmount;
            return tonerLevel;
    }

    public int printPages (int pages) {
        int pagesToPrint =  duplex ? ((pages / 2) + (pages % 2)) : pages;
        pagesPrinted+= pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
