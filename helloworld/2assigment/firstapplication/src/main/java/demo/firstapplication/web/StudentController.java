package demo.firstapplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String hello(Model model) {
        List<Student> studentList = createStudentList();
        model.addAttribute("students", studentList);
        return "hello";
    }

    private List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));
        return students;
    }
}

