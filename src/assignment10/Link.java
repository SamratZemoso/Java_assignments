package assignment10;

public class Link<T> {
    private Link<T> nextLink = null;
    private T data;

    Link(T val) {
        this.data = val;
    }

    public Link<T> getNextLink() {
        return nextLink;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }

    public T getData() {
        return data;
    }

    public void setData(T val) {
        this.data = val;
    }

}
