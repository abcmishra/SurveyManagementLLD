import java.util.ArrayList;
import java.util.List;

public class FrequencySearchStrategy implements SearchStrategy{
    @Override
    public List<SearchResult> search(String pattern , List<Document> documents){
        List<SearchResult> results = new ArrayList<>();
        for(Document document:documents){
            int frequency= calculateFrequency(document.getContent(),pattern);
            if(frequency>0){
                results.add(new SearchResult(document,frequency));
            }
        }
        return results;
    }

    private  int calculateFrequency(String content,String pattern){
        int count=0;
        int index=content.indexOf(pattern);
        while(index!=-1){
            count++;
            index=content.indexOf(pattern,index+pattern.length());
        }
        return count;
    }
}


