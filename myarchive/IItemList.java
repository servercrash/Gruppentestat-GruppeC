package myarchive;

import wsiarchive.*;

// Liste von Items
public interface IItemList {
    // in WSI-Itemliste umwandeln
    public wsiarchive.IItemList toWSIItemList();

    // alle Items in das Archiv schreiben
    public IPutResultList putAll(IArchive archive);
}
