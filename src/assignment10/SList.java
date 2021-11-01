package assignment10;

public class SList<T> {
    private Link<T> head = null;
    private Link<T> tail = null;

    public SListIterator<T> iterator() {
        return new SListIterator<>(this);
    }

    public String toString() {
        Link<T> tmp = head;
        StringBuilder build = new StringBuilder("");
        while (tmp != null) {
            build.append(tmp.getData());
            build.append("->");
            tmp = tmp.getNextLink();
        }
        return build.toString();
    }

    public Link<T> getHead() {
        return head;
    }

    public void setHead(Link<T> head) {
        this.head = head;
    }

    public Link<T> getTail() {
        return tail;
    }

    public void setTail(Link<T> tail) {
        this.tail = tail;
    }

}
