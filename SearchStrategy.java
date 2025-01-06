import java.util.List;

public interface SearchStrategy {
    List<SearchResult> search(String pattern,List<Document> Documents);
}
