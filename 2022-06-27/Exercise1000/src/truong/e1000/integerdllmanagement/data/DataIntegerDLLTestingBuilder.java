package truong.e1000.integerdllmanagement.data;

import java.util.Random;

import truong.e1000.integerdllmanagement.model.DLL;
import truong.e1000.integerdllmanagement.model.Node;

public class DataIntegerDLLTestingBuilder {
    public static DLL generateRandomIntegerDLL() {
        DLL dll = new DLL();
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        for (int i = 0; i < length; i++) {
            int value = random.nextInt(100) - 50;
            Node node = new Node(value);
            dll.push(node);
        }

        return dll;
    }
}
