package wsiarchive;



// Prädikat auf Items
public interface IItemPredicate {

    // sagt aus, ob ein Item auf das Prädikat passt 
    public boolean matches(Item item);

}
