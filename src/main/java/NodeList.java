public interface NodeList {
    ListItem getRoot();
    Boolean addItem(ListItem li);
    Boolean removeItem(ListItem li);
    void traverse(ListItem root);
}
