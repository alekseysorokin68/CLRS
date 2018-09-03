package clrs.main;

public class MaxArrStore {

    public MaxArrStore(int maxLeft, int maxRight, int maxArrSumm) {
        this.maxLeft = maxLeft;
        this.maxRight = maxRight;
        this.maxArrSumm = maxArrSumm;
    }

    public int getMaxLeft() {
        return maxLeft;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("Max-Left: " + this.maxLeft);
        sb.append(",");
        sb.append("Max-Right: " + this.maxRight);
        sb.append(",");
        sb.append("Max-Arr-Summ: " + this.maxArrSumm);
        sb.append("]");
        return sb.toString();
    }

    public void setMaxLeft(int maxLeft) {
        this.maxLeft = maxLeft;
    }

    public int getMaxRight() {
        return maxRight;
    }

    public void setMaxRight(int maxRight) {
        this.maxRight = maxRight;
    }

    public int getMaxArrSumm() {
        return maxArrSumm;
    }

    public void setMaxArrSumm(int maxArrSumm) {
        this.maxArrSumm = maxArrSumm;
    }
    private int maxLeft;
    private int maxRight;
    private int maxArrSumm;
}
