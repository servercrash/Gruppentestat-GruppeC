package myarchive;

import wsiarchive.*;

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
    
    // in IPutResultList aus wsiarchive umwandeln
    public wsiarchive.IPutResultList toWSIPutResultList() {
        return new wsiarchive.PairPutResultList(this.first,
                                                this.rest.toWSIPutResultList());
    }

}
