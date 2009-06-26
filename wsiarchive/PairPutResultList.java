package wsiarchive;



// nichtleere Liste von PutResults
public class PairPutResultList implements IPutResultList {
    private IPutResult first;
    private IPutResultList rest;
    
    public PairPutResultList(IPutResult first, IPutResultList rest) {
        this.first = first;
        this.rest = rest;
    }
    
    // erstes Element extrahieren
    public IPutResult getFirst() {
        return this.first;
    }
    
    // Rest extrahieren
    public IPutResultList getRest() {
        return this.rest;
    }
    
    // in entsprechende myarchive-Liste umwandeln
    public myarchive.IPutResultList toMyPutResultList() {
        return new myarchive.PairPutResultList(this.first,
                                               this.rest.toMyPutResultList());
    }

    // in entsprechende yourarchive-Liste umwandeln
    public yourarchive.IPutResultList toYourPutResultList() {
        return new yourarchive.PairPutResultList(this.first,
                                                this.rest.toYourPutResultList());
    }
}
