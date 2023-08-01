package academy.learnprogramming;

public class ComputerPrinter {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public ComputerPrinter(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + this.tonerLevel > 100) {
                System.out.println("Toner amount more than required!");
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
