package truong.e1000.doublylinkedlistmanagement.model;

public class Node {
    private Object data;
    public Node prev = null;
    public Node next = null;
    
    public Node (Object data) {
        this.setData(data);
    }

    public Object getData() {
        return data.toString();
    }

    public void setData(Object data) {
        this.data = data;
    }
}
