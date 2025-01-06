import java.util.*;

public class SearchEngine {
    private Map<String,Category> categories;

    public SearchEngine(){
        this.categories= new HashMap<>();
    }

    public void   createCategory(String name){
        if(!categories.containsKey(name)) {
            categories.put(name, new Category(name));
        }
        System.out.println("Name not present in map: "+name);

    }

    public void removeCategory(String name){
        if(categories.containsKey(name)){
            categories.remove(name);
        }
        System.out.println(" Name not in the category: "+name);
    }

    public void addDocument(String categoryName,Document document){
        Category category = categories.get(categoryName);
        if(category!=null){
            category.addDocuments(document);
        }
    }

    public void deleteDocument(String categoryName, Document document){
        Category category = categories.get(categoryName);
        if(category!=null){
            category.removeDocument(document);
        }

    }

    public List<SearchResult> search(String categoryName, String pattern, SearchStrategy searchStrategy, Comparator<SearchResult> comparator){
        Category category= categories.get(categoryName);
        if(category!=null){
            return  Collections.emptyList();
        }
        List<SearchResult> results = searchStrategy.search(pattern,category.getDocuments());
        results.sort(comparator);
        return results;

    }
}
