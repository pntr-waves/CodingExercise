package truong.e1000.classmanagement.service;

import java.util.List;

import truong.e1000.classmanagement.data.ClassDataTestingBuilder;
import truong.e1000.classmanagement.model.Class;
import truong.e1000.classmanagement.model.Student;

public class ClassManagementService {
    
    static StudentManagementService studentService = new StudentManagementService();
    
    void sortByStudentNumber (List<Class> classList) {
        int length = classList.size();
        
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyByStudentNumber(classList, length, i);
        }
        
        for (int i = length - 1; i > 0; i--) {
            Class temp = classList.get(0);
            classList.set(0, classList.get(i));
            classList.set(i, temp);
            
            heapifyByStudentNumber(classList, i, 0);
        }
        
    }
    
    void heapifyByStudentNumber (List<Class> classList, int length, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        
        if (left < length && classList.get(largest).getStudentNumber() < classList.get(left).getStudentNumber()) {
            largest = left;
        }
        
        if (right < length && classList.get(largest).getStudentNumber() < classList.get(right).getStudentNumber()) {
            largest = right;
        }
        
        if (largest != index) {
            Class temp = classList.get(largest);
            classList.set(largest, classList.get(index));
            classList.set(index, temp);
            
            heapifyByStudentNumber(classList, length, largest);
        }
    }
    
    
    public Class getLargestStudentNumberClass () {
        List<Class> classList = ClassDataTestingBuilder.getClassList();
        sortByStudentNumber(classList);
        
        return classList.get(classList.size() - 1);
    }
    

    
    public Student getHighestAverageStudent () {
        Student result = null;
        List<Class> classList = ClassDataTestingBuilder.getClassList();
        int max = 0;
        for (Class clazz : classList) {
            Student st = studentService.getHighestAverageStudentOfEveryClass(clazz);
            if (st.getAverage() > max) {
                result = st;
                max = st.getAverage();
            }
        }
        
        return result;
    }
}
