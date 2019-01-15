package com.raghvendra;

//public static final TONER_MAX_LEVEL = 100;
public class Printer {
    private int tonerlevel = 100;
    private int pages = 350;
    private boolean isDuplex;

    public Printer(int tonerlevel, int pages, boolean isDuplex) {
        if(tonerlevel > 0 && tonerlevel <= 100) {
            this.tonerlevel = tonerlevel;
        }
        if(pages > 0 && pages <= 350) {
            this.pages = pages;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int ink) {
        int allowedLimit = 100 - this.tonerlevel;
        if( ink <= 0 && ink >= allowedLimit) {
            System.out.println("Enter ink quantity in range of 1 to " + allowedLimit);
            return;
        }
        if(allowedLimit > 0 && allowedLimit <= 100) {
            this.tonerlevel +=ink;
            System.out.println("Toner Level increased. New level is: " + this.tonerlevel);
        }
    }
/*
    public void printPage(int pageCount) {
        if(pageCount < 1) {
            System.out.println("Enter Page Quantity in range of 1 to " + this.pages);
            return;
        }
        int this.pages = this.pages;
        int this.tonerlevel = this.tonerlevel;

        if(this.pages <= 0) {
            System.out.println("Paper tray is empty. Please re-fill it.");
        } else if(this.tonerlevel <= 0) {
            System.out.println("Toner is Empty. Please re-fill it");
        } else {
            int allowedPrintPage = pageCount;
            boolean isPagesinQueue = false;

            if((pageCount/2) > this.pages && this.isDuplex) {
                allowedPrintPage = this.pages;
                isPagesinQueue = true;
            } else if((pageCount/2) <= this.pages && this.isDuplex) {
                allowedPrintPage = pageCount;
            } else if(pageCount > this.pages){
                allowedPrintPage = this.pages;
                isPagesinQueue = true;
            } else {
                allowedPrintPage = pageCount;
            }
            if(this.isDuplex) {
                if(allowedPrintPage % 2 == 0) {
                    this.pages = this.pages - (allowedPrintPage/2);
                    System.out.println("Number of Pages Printed: " + allowedPrintPage);
                    System.out.println("Number of Pages left in tray: " + this.pages);
                    if(isPagesinQueue) {
                        System.out.println("Number of Pages in Queue: " + this.pages);
                        System.out.println("Please fill the tray for Printing the pages in Queue.");
                    }
                } else {
                    this.pages = this.pages - (allowedPrintPage/2) + 1;
                    System.out.println("Number of Pages Printed: " + allowedPrintPage);
                    System.out.println("Number of Pages left in tray: " + this.pages);
                    if(isPagesinQueue) {
                        System.out.println("Number of Pages in Queue: " + (pageCount - this.pages));
                        System.out.println("Please fill the tray for Printing the pages in Queue.");
                    }
                }
            } else {
               this.pages = this.pages - allowedPrintPage;
               System.out.println("Number of Pages Printed: " + allowedPrintPage);
               System.out.println("Number of Pages left: " + this.pages);
                if(isPagesinQueue) {
                    System.out.println("Number of Pages in Queue: " + (pageCount - this.pages));
                    System.out.println("Please fill the tray for Printing the pages in Queue.");
                }
            }
            this.pages = this.pages;
            this.tonerlevel = this.tonerlevel - allowedPrintPage/5;
            System.out.println("Toner Level remaining: "+ this.tonerlevel);
        }
    }
*/

    public void printPage(int pageCount) {
        if(pageCount < 1) {
            System.out.println("Enter Page Quantity in range of 1 to " + this.pages);
            return;
        }
        int inQueue = 0;

        if(this.pages <= 0) {
            System.out.println("Paper tray is empty. Please re-fill it.");
        } else if(this.tonerlevel <= 0) {
            System.out.println("Toner is Empty. Please re-fill it");
        } else {
            if(this.isDuplex) {
                if(this.pages < pageCount / 2) {
                    inQueue = pageCount / 2 - this.pages;
                    this.tonerlevel = this.tonerlevel - this.pages / 5;
                    this.pages = 0;
                } else {
                    this.pages = this.pages - pageCount / 2;
                    this.tonerlevel = this.tonerlevel - pageCount / 5;
                }
            } else {
                if(this.pages < pageCount) {
                    inQueue = pageCount - this.pages;
                    this.tonerlevel = this.tonerlevel - this.pages / 5;
                    this.pages = 0;
                } else {
                    this.pages = this.pages - pageCount;
                    this.tonerlevel = this.tonerlevel - pageCount / 5;
                }
            }
            System.out.println("Number of Pages Printed: " + (pageCount - inQueue));
            System.out.println("Number of Pages in Queue: " + inQueue);
            System.out.println("Number of Pages left: " + this.pages);
            System.out.println("Toner Level remaining: "+ this.tonerlevel);
        }
    }


    public int getTonerlevel() {
        return tonerlevel;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
