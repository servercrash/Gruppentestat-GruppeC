package myarchive;

import wsiarchive.*;

// nichtleere Liste von Items
public class PairItemList implements IItemList {
    private Item first;
    private IItemList rest;
    
    public PairItemList(Item first, IItemList rest) {
        this.first = first;
        this.rest = rest;
    }
    
    // erstes Element extrahieren
    public Item getFirst() {
        return this.first;
    }
    
    // Rest extrahieren
    public IItemList getRest() {
        return this.rest;
    }

    // in WSI-Itemliste umwandeln
    public wsiarchive.IItemList toWSIItemList() {
        return new wsiarchive.PairItemList(this.first,
                                           this.rest.toWSIItemList());
    }

    // alle Items in das Archiv schreiben
    public IPutResultList putAll(IArchive archive) {
        return new PairPutResultList(archive.put(this.first), 
                                     this.rest.putAll(archive));
    }

}
