public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return rightLink;
    }

    @Override
    public ListItem setNext(ListItem right) {
        rightLink = right;
        return rightLink;
    }

    @Override
    public ListItem previous() {
        return leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem left){
        leftLink = left;
        return leftLink;
    }

    @Override
    public int compareTo(ListItem objectToCompare) {
        double dblThisVal;
        int intThisVal;
        double dblOtcVal;
        int intOtcVal;

        if ((this.getValue() instanceof Double) && (objectToCompare.getValue() instanceof Double)) {
            dblThisVal = (double) this.getValue();
            dblOtcVal = (double) objectToCompare.getValue();

            if (dblThisVal == dblOtcVal)
                return 0;
            else if (dblThisVal > dblOtcVal)
                return 1;
            else
                return -1;
        }

        if ((this.getValue() instanceof Integer) && (objectToCompare.getValue() instanceof Integer)) {
            intThisVal = (int) this.getValue();
            intOtcVal = (int) objectToCompare.getValue();

            if (intThisVal == intOtcVal)
                return 0;
            else if (intThisVal > intOtcVal)
                return 1;
            else
                return -1;
        }
        return -2;
    }
}
