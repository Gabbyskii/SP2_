import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
     public static void main(String[] args) {

         Author author1 = new Author("Karen Blixen");
         Author author2 = new Author("HC Andersen");
         Author author3 = new Author("JK rowling");

         AudioBook ab = new AudioBook("Skygger på græsset","FAG",200,12);
         PrintedBook pb = new PrintedBook("The ugly duckling","SKØN",250,100);
         PrintedBook pb2 = new PrintedBook("Harry Potter og de vises sten","SKØN",303,150);

         author1.addTitle(ab);
         author2.addTitle(pb);
         author3.addTitle(pb2);

         System.out.println(author1.getName() + "'s udbetaling: " + author1.calculateRoyalties() + "kr");
         System.out.println(author2.getName() + "'s udbetaling: " + author2.calculateRoyalties() + "kr");
         System.out.println(author3.getName() + "'s udbetaling: " + author3.calculateRoyalties() + "kr");


     }

}
