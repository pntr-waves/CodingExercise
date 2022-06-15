package truong.e1000.classmanagement.service;

import java.util.List;

import truong.e1000.classmanagement.model.Class;
import truong.e1000.classmanagement.model.Student;

public class StudentManagementService {
    void sortByAverage (List<Student> studentList, int low, int high) {
        if (low < high) {
            int pi = partition (studentList, low, high);
            
            sortByAverage(studentList, low, pi - 1);
            sortByAverage(studentList, pi + 1, high);
        }
    }
    
    int partition (List<Student> studentList, int low, int high) {
        Student pivot = studentList.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            int average = studentList.get(j).getAverage();
            if (average < pivot.getAverage()) {
                i++;
                Student temp = studentList.get(i);
                studentList.set(i, studentList.get(j));
                studentList.set(j, temp);
            }
        }
        
        Student temp = studentList.get(i + 1);
        studentList.set(i + 1, studentList.get(high));
        studentList.set(high, temp);
        return i + 1;
    }
    
    Student getHighestAverageStudentOfEveryClass (Class clazz) {
        List<Student> studentList = clazz.getStudentList();
        sortByAverage(studentList, 0, studentList.size() - 1);
        
        return studentList.get(studentList.size() - 1);
    }
}
