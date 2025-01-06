public class SearchResult {

    public SearchResult(Document document,int frequency){
        this.document=document;
        this.frequency=frequency;
    }
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    private Document document;
    private int frequency;





}
