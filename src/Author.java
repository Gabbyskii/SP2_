import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTitle(Title title){
        //System.out.println("Book added: " + title);
       titles.add(title);
    }

    public double calculateRoyalties(){
        double total = 0;
        for (Title t: titles){
            total += t.calculateRoyalty();
        }
        return Math.round(total);
    }


}
