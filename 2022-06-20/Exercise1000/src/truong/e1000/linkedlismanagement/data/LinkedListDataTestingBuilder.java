package truong.e1000.linkedlismanagement.data;

import java.util.Random;

import truong.e1000.linkedlismanagement.model.LinkedList;
import truong.e1000.linkedlismanagement.model.Node;

public class LinkedListDataTestingBuilder {
    public static LinkedList generateRandomLinkedList () {
        LinkedList linkedList = new LinkedList();
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        int i = 0;
        while (i < length) {
            int value = random.nextInt(100) + 1;
            Node node = new Node(value);
            linkedList.push(node);
            i++;
        }
        
        return linkedList;
    }
}
