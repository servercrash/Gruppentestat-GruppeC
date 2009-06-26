package wsiarchive;



// Liste von IPutResult-Werten
public interface IPutResultList {
    // in entsprechende myarchive-Liste umwandeln
    public myarchive.IPutResultList toMyPutResultList();

    // in entsprechende yourarchive-Liste umwandeln
    public yourarchive.IPutResultList toYourPutResultList();

}
