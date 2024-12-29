public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public Boolean addItem(ListItem li) {
        if (this.root == null) {
            this.root = li;
            return true;
        }

        ListItem cursor;
        cursor = root;

        while(true) {
            if (cursor.compareTo(li) > 0) {
                if (cursor.leftLink != null) {
                    cursor = cursor.leftLink;
                } else {
                    cursor.leftLink = li;
                    return true;
                }
            } else if (cursor.compareTo(li) == 0) {
                return false;
            } else {
                if (cursor.rightLink != null) {
                    cursor = cursor.rightLink;
                } else {
                    cursor.rightLink = li;
                    return true;
                }
            }
        }
    }

    private void performRemoval(ListItem itemToRemove, ListItem parent) {
        if ((itemToRemove != null) && (parent != null)) {
            if (parent.rightLink.compareTo(itemToRemove) == 0) {
                parent.rightLink = null;
            }
            if (parent.leftLink.compareTo(itemToRemove) == 0) {
                parent.leftLink = null;
            }
        }
        if ((itemToRemove != null) && (parent == null)) {
            if (root.compareTo(itemToRemove) == 0)
                root = null;
        }
    }

    @Override
    public Boolean removeItem(ListItem li) {
        ListItem cursor;
        ListItem parent = null;
        cursor = root;

        while(true) {
            if (cursor.compareTo(li) > 0) {
                if (cursor.leftLink != null) {
                    parent = cursor;
                    cursor = cursor.leftLink;
                } else {
                    return false;
                }
            } else if (cursor.compareTo(li) == 0) {
                performRemoval(cursor, parent);
                return true;
            } else {
                if (cursor.rightLink != null) {
                    parent = cursor;
                    cursor = cursor.rightLink;
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            if (root.leftLink != null) {
                traverse(root.leftLink);
            }
            System.out.println(root.getValue());
            if (root.rightLink != null) {
                traverse(root.rightLink);
            }

        }
    }
}
