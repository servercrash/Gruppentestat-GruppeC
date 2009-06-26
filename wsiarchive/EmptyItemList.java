package wsiarchive;



// leere Liste von Items
public class EmptyItemList implements IItemList {
    public EmptyItemList() {
    }
    
    // alle Items in das Archiv schreiben
    public IPutResultList putAll(IArchive archive) {
        return new EmptyPutResultList();
    }

    // in myarchive-Item-Liste umwandeln
    public myarchive.IItemList toMyItemList() {
        return new myarchive.EmptyItemList();
    }

    // in yourarchive-Item-Liste umwandeln
    public yourarchive.IItemList toYourItemList() {
        return new yourarchive.EmptyItemList();
    }

}
