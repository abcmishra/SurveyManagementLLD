
import javax.swing.*;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void  main(String[] args){
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.createCategory("Tech");
        searchEngine.createCategory("Travel");

        Document doc1 = new Document("Java Basics", "Java is a programming language.");
        Document doc2 = new Document("Spring Boot", "Spring Boot is great for microservices.");
        Document doc3 = new Document("Travel Blog", "Traveling is a wonderful experience.");

        searchEngine.addDocument("Tech",doc1);
        searchEngine.addDocument("Tech",doc2);
        searchEngine.addDocument("Travel",doc3);

        SearchStrategy normalSearchStrategy = new NormalSearchStrategy();
        List<SearchResult> normalResults = searchEngine.search("Tech", "Java", normalSearchStrategy, Comparator.comparing(o -> o.getDocument().getCreatedAt()));
        System.out.println("Normal Search Results");
        for(SearchResult searchResult:normalResults){
            System.out.println(searchResult.getDocument().getTitle());
        }


        SearchStrategy frequencySearchStrategy = new FrequencySearchStrategy();

        List<SearchResult> searchResults = searchEngine.search("Tech","Spring",frequencySearchStrategy,Comparator.comparing(SearchResult::getFrequency).reversed());

        System.out.println("\n Frequency based results");
        for(SearchResult searchResult:searchResults){
            System.out.println(searchResult.getDocument().getTitle()+" (Frequency: " + searchResult.getFrequency() + ")");
        }


    }
}
