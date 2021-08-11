import java.util.Random;
public class ServerNameGenerator {



    public static void main(String[] args) {
        String[] adj = {"Blue", "Red", "Purple", "Black","Orange","Yellow","White","Grey","Green","Silver"};
        String[] nouns = {"Volvo", "BMW", "Ford", "Mazda","Tesla","Hyundai","Honda","Porsche","Ferarri","Toyota"};

        Random r=new Random();
        int randomAdj=r.nextInt(adj.length);
        System.out.println(adj[randomAdj]);
        int randomNoun=r.nextInt(nouns.length);
        System.out.println(nouns[randomNoun]);

    }
}
