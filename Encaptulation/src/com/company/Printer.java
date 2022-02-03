package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel <0 && tonerLevel>100){
            this.tonerLevel = -1;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int printPages(int pages){
        if(this.duplex){
            pages = (pages/2 + pages%2);
            this.pagesPrinted+=pages;
        }else{
            this.pagesPrinted+=pages;
        }
        return pages;
    }

    public int addtoner(int tonerAmount){
        if(tonerAmount>-1 && tonerAmount <100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }else{
                this.tonerLevel +=tonerAmount;
                return this.tonerLevel;
            }
        }
        return -1;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
