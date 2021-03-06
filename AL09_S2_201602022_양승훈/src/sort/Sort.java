package sort;

public abstract class Sort <E extends Comparable<E>> {
    private boolean _nonDecreasingOrder;

    //constructor
    public Sort(boolean givenSortingOrder) {
        this.setNonDecreasingOrder(givenSortingOrder);
    }

    //getter/setter
    public boolean nonDecreasingOrder() {
        return this._nonDecreasingOrder;
    }

    public void setNonDecreasingOrder(boolean newNonDecreasingOrder) {
        this._nonDecreasingOrder = newNonDecreasingOrder;
    }

    protected void swap(E[] aList, int i, int j) {                                                                      //i번째 요소와 j번째 요소를 바꿈
        E tempElement = aList[i];
        aList[i] = aList[j];
        aList[j] = tempElement;
    }

    protected int compare(E anElement, E theOtherElement) {
        if (this.nonDecreasingOrder()) {
            return anElement.compareTo(theOtherElement);                                                                //내림차순이 아닐경우 비교한값을 그대로 주면 되지만,
        } else {
            return -anElement.compareTo(theOtherElement);                                                               //내림차순일 경우 비교한값의 부호를 바꿔서 리턴해주어야한다
        }
    }

    public abstract boolean sort(E[] aList);                                                                            //추상 함수. 상속받는 클래스에서 구현해야함.
}
