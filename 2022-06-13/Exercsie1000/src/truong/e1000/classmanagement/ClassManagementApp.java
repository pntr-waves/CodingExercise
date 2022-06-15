/**
 * 837. Write the program with requirements:
 * a. Create Class object
 * - Class name: sequence character type
 * - Number of students: integer type;
 * - List of student: (Student is object)
 * b. Find a class has the most number of students
 * c. Find a student has the highest average mark
 */
package truong.e1000.classmanagement;

import truong.e1000.classmanagement.service.ClassManagementDisplayService;
import truong.e1000.classmanagement.service.ClassManagementService;
import truong.e1000.classmanagement.service.StudentManagementDisplayService;

public class ClassManagementApp {
    public static void main(String[] args) {
        ClassManagementService service = new ClassManagementService();
        ClassManagementDisplayService classDisplayService = new ClassManagementDisplayService();
        StudentManagementDisplayService studentDisplayService = new StudentManagementDisplayService();
        System.out.println("1. Class has the largest number of students");
        classDisplayService.printClass(service.getLargestStudentNumberClass());
        System.out.println("\n2. Student has the highest average");
        studentDisplayService.printStudent(service.getHighestAverageStudent());
    }
}
