package wsiarchive;



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

    // in myarchive-Item-Liste umwandeln
    public myarchive.IItemList toMyItemList() {
        return new myarchive.PairItemList(this.first,
                                          this.rest.toMyItemList());
    }

    // in yourarchive-Item-Liste umwandeln
    public yourarchive.IItemList toYourItemList() {
        return new yourarchive.PairItemList(this.first,
                                            this.rest.toYourItemList());
    }

    // alle Items in das Archiv schreiben
    public IPutResultList putAll(IArchive archive) {
        return new PairPutResultList(archive.put(this.first), 
                                     this.rest.putAll(archive));
    }

}
