
import java.util.ArrayList;
import java.util.List;

public class NormalSearchStrategy implements SearchStrategy{
    @Override
    public List<SearchResult> search(String pattern ,List<Document> documents){
        List<SearchResult> res = new ArrayList<>();
        for(Document document:documents  ){
            if(document.getContent().contains(pattern)){
                res.add( new SearchResult(document,0));

            }
        }
        return res;
    }
}
