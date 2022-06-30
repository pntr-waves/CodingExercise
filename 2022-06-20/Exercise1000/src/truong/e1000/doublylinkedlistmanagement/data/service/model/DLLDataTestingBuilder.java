package truong.e1000.doublylinkedlistmanagement.data.service.model;

import java.util.Random;

import truong.e1000.doublylinkedlistmanagement.model.Complex;
import truong.e1000.doublylinkedlistmanagement.model.DoublyLinkedList;
import truong.e1000.doublylinkedlistmanagement.model.Fraction;
import truong.e1000.doublylinkedlistmanagement.model.Node;

public class DLLDataTestingBuilder {
    public static DoublyLinkedList generateRandomLinkedList () {
        DoublyLinkedList dll = new DoublyLinkedList();
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        int i = 0;
        while (i < length) {
            int value = random.nextInt(100) + 1;
            Node node = new Node(value);
            dll.push(node);
            i++;
        }
        
        return dll;
    }
    
    public static DoublyLinkedList generateRandomFractionDLL() {
        DoublyLinkedList dll = new DoublyLinkedList();
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        int i = 0;
        while (i < length) {
            int numerator = random.nextInt(100) + 1;
            int decominator = random.nextInt(100) + 1;
            Fraction value = new Fraction(numerator, decominator);
            Node node = new Node(value);
            dll.push(node);
            i++;
        }
        
        return dll;
    }
    
    public static DoublyLinkedList generateRandomComplexDLL() {
        DoublyLinkedList dll = new DoublyLinkedList();
        Random random = new Random();
        int length = random.nextInt(10) + 1;
        int i = 0;
        while (i < length) {
            int real = random.nextInt(100) + 1;
            int virtual = random.nextInt(100) - 50;
            Complex value = new Complex(real, virtual);
            Node node = new Node(value);
            dll.push(node);
            i++;
        }
        
        return dll;
    }
}
