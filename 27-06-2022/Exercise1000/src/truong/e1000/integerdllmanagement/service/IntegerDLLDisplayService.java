package truong.e1000.integerdllmanagement.service;

import truong.e1000.integerdllmanagement.model.DLL;
import truong.e1000.integerdllmanagement.model.Node;

public class IntegerDLLDisplayService {
    public void printDLL(DLL dll) {
        Node index = dll.head;

        while (index.next != null) {
            System.out.print(String.format("[%d] ", index.getData()));
            index = index.next;
        }
    }
}
