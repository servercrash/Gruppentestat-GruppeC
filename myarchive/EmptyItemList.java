package myarchive;

import wsiarchive.*;

// leere Liste von Items
public class EmptyItemList implements IItemList {
    public EmptyItemList() {
    }
    
    // in WSI-Itemliste umwandeln
    public wsiarchive.IItemList toWSIItemList() {
        return new wsiarchive.EmptyItemList();
    }

    // alle Items in das Archiv schreiben
    public IPutResultList putAll(IArchive archive) {
        return new EmptyPutResultList();
    }
}
