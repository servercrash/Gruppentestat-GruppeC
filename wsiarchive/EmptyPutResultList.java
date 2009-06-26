package wsiarchive;



// leere Liste von IPutResults
public class EmptyPutResultList implements IPutResultList {
    public EmptyPutResultList() {
    }

    // in entsprechende myarchive-Liste umwandeln
    public myarchive.IPutResultList toMyPutResultList() {
        return new myarchive.EmptyPutResultList();
    }

    // in entsprechende myarchive-Liste umwandeln
    public yourarchive.IPutResultList toYourPutResultList() {
        return new yourarchive.EmptyPutResultList();
    }

}
