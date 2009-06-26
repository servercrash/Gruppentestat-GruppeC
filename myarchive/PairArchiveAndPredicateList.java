package myarchive;

import wsiarchive.*;

// nichtleere Liste von Archive/Prädikat-Paaren
public class PairArchiveAndPredicateList implements IArchiveAndPredicateList {
    private IItemPredicate predicate;
    private IArchive archive;
    private IArchiveAndPredicateList rest;
    
    public PairArchiveAndPredicateList(IItemPredicate predicate, IArchive archive,
                                       IArchiveAndPredicateList rest) {
        this.predicate = predicate;
        this.archive = archive;
        this.rest = rest;
    }
}
