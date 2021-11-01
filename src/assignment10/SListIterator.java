package assignment10;

public class SListIterator<T> {
    private SList sList;
    private Link head;
    private Link tail;

    SListIterator(SList sList) {
        this.sList = sList;
        head = sList.getHead();
        tail = sList.getTail();
    }

    public void insert(T val) {
        if(head == null) {
            head = new Link(val);
            tail = head;
        } else {
            Link<T> tmp = new Link(val);
            tail.setNextLink(tmp);
            tail = tmp;
        }
        sList.setHead(head);
        sList.setTail(tail);
    }

    public void remove(T val) {
        if(head == null) {
            return;
        } else {
            Link<T> tmp = head;
            Link<T> prev = null;
            while(tmp != null) {
                if(tmp.getData().equals(val)) {
                    if(tmp == head) {
                        if(head == tail) {
                            tail = null;
                        }
                        head = head.getNextLink();
                    } else if(tmp == tail) {
                        tail = prev;
                        tail.setNextLink(null);
                    } else {
                        prev.setNextLink(tmp.getNextLink());
                    }
                }
                prev = tmp;
                tmp = tmp.getNextLink();
            }
        }
        sList.setHead(head);
        sList.setTail(tail);
    }

}
