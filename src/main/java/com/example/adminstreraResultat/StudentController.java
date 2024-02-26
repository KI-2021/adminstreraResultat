package com.example.adminstreraResultat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

   /* List<Betyg> studentBetyg = Arrays.asList(
            new Betyg(1L,"David John", "G", "G", 20220412, "klar", "nej"),
            new Betyg(2L, "Johan Ek", "VG", "G", 20220412, "klar", "nej"),
            new Betyg(3L, "Hanna Blomberg", "G", "G", 20220412, "klar", "nej")
    );*/

    //2:24 minuter https://www.youtube.com/watch?v=_thI-4AF7M8
    @GetMapping("/student")
    public Student getBetyg(){
        return new Student(1L,"David", "G", "G", 20220412, "klar", "nej");
    }

    //metod för att hämta stundenter
    @GetMapping("/studenter")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
                students.add(new Student(2L, "Johan", "G", "G", 20220412, "klar", "nej"));
                students.add(new Student(2L, "David", "VG", "VG", 20220412, "klar", "nej"));
                students.add(new Student(2L, "Maria", "VG", "MVG", 20220412, "klar", "nej"));
        return students;
    }

    //path variable annotation 2:30
    //http://localhost:8080/student/id
    //retunerar sökt resultat.
    @GetMapping("/student/{namn}/{betygLadok}")
    public Student studentPathVariable(@PathVariable("namn") String namn,
                                       @PathVariable("betygLadok") String betygLadok) {
        return new Student(namn, betygLadok);
                            //https://www.youtube.com/watch?v=I1AAgB99gZw fel meddelnde koll den klipp
                            //2;40 min
    }


}
