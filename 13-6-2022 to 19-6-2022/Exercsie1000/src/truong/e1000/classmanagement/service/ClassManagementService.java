/*
 * 837.Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các lớp
học (LOPHOC). Biết rằng một lớp học gồm những thành phần như
sau:
- Tên lớp: chuỗi tối đa 30 ký tự.
- Sĩ số: kiểu số nguyên 2 byte.
- Danh sách các học sinh trong lớp (tối đa 50 học sinh)
b. Nhập danh sách.
c. Xuất danh sách.
d. Tìm một lớp có sỉ số đông nhất.
e. TÌm một học sinh có điểm trung bình lớn nhất.*/
package truong.e1000.classmanagement.service;

import java.util.List;

import truong.e1000.classmanagement.data.ClassDataTestingBuilder;
import truong.e1000.classmanagement.model.Class;
import truong.e1000.classmanagement.model.Student;

public class ClassManagementService {
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
    
    void sortStudentListByAverage (List<Student> studentList, int low, int high) {
        if (low < high) {
            int pi = partition (studentList, low, high);
            
            sortStudentListByAverage(studentList, low, pi - 1);
            sortStudentListByAverage(studentList, pi + 1, high);
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
    
    public Class getLargestStudentNumberClass () {
        List<Class> classList = ClassDataTestingBuilder.getClassList();
        sortByStudentNumber(classList);
        
        return classList.get(classList.size() - 1);
    }
    
    Student getHighestAverageStudentOfEveryClass (Class clazz) {
        List<Student> studentList = clazz.getStudentList();
        sortStudentListByAverage(studentList, 0, studentList.size() - 1);
        
        return studentList.get(studentList.size() - 1);
    }
    
    public Student getHighestAverageStudent () {
        Student result = null;
        List<Class> classList = ClassDataTestingBuilder.getClassList();
        int max = 0;
        for (Class clazz : classList) {
            Student st = getHighestAverageStudentOfEveryClass(clazz);
            if (st.getAverage() > max) {
                result = st;
                max = st.getAverage();
            }
        }
        
        return result;
    }
    
    public void printClass (Class clazz) {
        System.out.println("-----------------------------");
        System.out.println("Class: " + clazz.getClassName());
        System.out.println("Student Number: " + clazz.getStudentNumber());
        printStudentList(clazz.getStudentList());
    }
    
    public void printStudentList (List<Student> studentList) {
        System.out.println("List of Student");
        for (Student student : studentList) {
            System.out.println("\t--------------------------------");
            System.out.println("\tName: " + student.getName());
            System.out.println("\tAverage: " + student.getAverage());
        }
    }
    
    public void printStudent (Student student) {
        System.out.println("\t--------------------------------");
        System.out.println("\tName: " + student.getName());
        System.out.println("\tAverage: " + student.getAverage());
    }
}
