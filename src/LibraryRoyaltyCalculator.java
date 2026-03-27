import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
     public static void main(String[] args) {

      Author a1 = new Author("Karen Blixen");
      Author a2 = new Author("HC Andersen");
      Author a3 = new Author("JK rowling");

      a1.addTitle(new AudioBook("Skygger på græsset","FAG",200,12));
      a2.addTitle(new PrintedBook("The ugly duckling","SKØN",250,100));
      a3.addTitle(new PrintedBook("Harry Potter og de vises sten","SKØN",303,150));

      System.out.println(a1.getName() + "'s udbetaling: " + a1.calculateRoyalties() + "kr");
      System.out.println(a2.getName() + "'s udbetaling: " + a2.calculateRoyalties() + "kr");
      System.out.println(a3.getName() + "'s udbetaling: " + a3.calculateRoyalties() + "kr");


     }

}
