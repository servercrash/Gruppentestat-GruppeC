package wsiarchive;



// Item im Archiv
public class Item {
    private String contents; // Inhalt des Items
    private int size; // Größe des Items (in MB)
    
    public Item(String contents, int size) {
        this.contents = contents;
        this.size = size;
    }
    
    // Inhalt herausrücken
    public String getContents() {
        return this.contents;
    }
    
    // Größe herausrücken
    public int getSize() {
        return this.size;
    }
}
