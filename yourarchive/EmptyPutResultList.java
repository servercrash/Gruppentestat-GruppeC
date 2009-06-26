package yourarchive;



// leere Liste von IPutResults
public class EmptyPutResultList implements IPutResultList {
    public EmptyPutResultList() {
    }
    
    // in IPutResultList aus wsiarchive umwandeln
    public wsiarchive.IPutResultList toWSIPutResultList() {
        return new wsiarchive.EmptyPutResultList();
    }
}
