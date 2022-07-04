package truong.e1000.integerdllmanagement.service;

import truong.e1000.integerdllmanagement.model.DLL;
import truong.e1000.integerdllmanagement.model.Node;

public class IntegerDLLService {
    public int getTotalValue(DLL dll) {
        Node index = dll.head;
        int total = 0;
        while (index.next != null) {
            total += index.getData();
            index = index.next;
        }

        return total;
    }
}
