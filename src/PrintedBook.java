import java.lang.classfile.instruction.SwitchCase;

public class PrintedBook extends Title {

    int pages;
    int copies;

    public PrintedBook(String title, String literatureType, int pages, int copies) {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    public int getPages() {
        return pages;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    protected double calculatePoints() {
        return getPages() * convertLiteratureType() * getCopies();
    }


    @Override
    protected double convertLiteratureType(){

        switch (literatureType){
            case "BI":
            case "TE":
              return 3;
            case "LYRIK":
             return 6;
            case "SKØN":
             return 1.7;
            case "FAG":
              return 1;

        }
        return 0;
    }




}
