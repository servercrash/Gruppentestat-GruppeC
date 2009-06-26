package wsiarchive;



// ItemIds für die WORM-Klasse
public class WORMItemId implements IItemId {
    public WORMItemId() {
    }
    
    // ist Schlüssel this gleich anderem Schlüssel?
    public boolean same(IItemId other) {
        return this == other;
    }
}

