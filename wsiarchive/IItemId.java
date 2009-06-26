package wsiarchive;



// Eindeutiger Schlüssel für Item
public interface IItemId {
    // ist Schlüssel this gleich anderem Schlüssel?
    public boolean same(IItemId other);
}
