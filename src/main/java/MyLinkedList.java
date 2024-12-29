public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public Boolean addItem(ListItem li) {
        if (this.root == null) {
            this.root = li;
            return true;
        }
        if (root.compareTo(li) > 0) {
            root.leftLink = li;
            li.rightLink = root;
            root = li;
            return true;
        }
        if (root.compareTo(li) == 0) {
            return false;
        }
        ListItem cursor;
        cursor = root;
        while (cursor.rightLink != null) {
            if (cursor.compareTo(li) == 0)
                return false;
            if (cursor.compareTo(li) < 0) {
                cursor = cursor.rightLink;
            } else {
                cursor.leftLink.rightLink = li;
                li.leftLink = cursor.leftLink;
                cursor.leftLink = li;
                li.rightLink = cursor;
                return true;
            }
        }
        li.leftLink = cursor;
        cursor.rightLink = li;
        return true;
    }

    @Override
    public Boolean removeItem(ListItem li) {
        if (root == null)
            return false;

        ListItem cursor;
        cursor = root;

        while (cursor.compareTo(li) != 0 || cursor.rightLink != null) {
            cursor = cursor.rightLink;
        }

        if (cursor.compareTo(li) == 0 && cursor.rightLink == null) {
            if (cursor.leftLink != null) {
                cursor.leftLink.rightLink = null;
            } else {
                root = null;
            }
            return true;
        }

        if (cursor.compareTo(li) == 0) {
            cursor.leftLink.rightLink = cursor.rightLink;
            cursor.rightLink.leftLink = cursor.leftLink;
            return true;
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        ListItem cursor;
        cursor = root;
        System.out.println(cursor.getValue());
        while (cursor.rightLink != null) {
            cursor = cursor.rightLink;
            System.out.println(cursor.getValue());
        }
    }
}
