import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Document> documents;

    public Category(String name){
        this.name=name;
        this.documents= new ArrayList<>();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name=name;
    }
    public List<Document> getDocuments() {
        return documents;
    }
    public void addDocuments(Document newDocument){
        if(!documents.contains(newDocument)){
            documents.add(newDocument);
        }
        System.out.println("Document is already present in the list: "+newDocument);

    }

    public void removeDocument(Document document){
        if(documents.contains(document)){
            documents.remove(document);
        }
        System.out.println("Document noit present in the list: "+ document);
    }

}
