package myarchive;

import wsiarchive.*;

// nichtleere Liste von Archiven

public class PairArchiveList implements IArchiveList {
    private IArchive first;
    private IArchiveList rest;
    
    public PairArchiveList(IArchive first, IArchiveList rest) {
        this.first = first;
        this.rest = rest;
    }
}
