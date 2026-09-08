package edu.coursehub.persistence.enrollment;

import edu.coursehub.persistence.course.CourseRepository;
import edu.coursehub.persistence.student.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentService(
            EnrollmentRepository enrollmentRepository,
            StudentRepository studentRepository,
            CourseRepository courseRepository
    ) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }
    // 2. Crear enroll(studentId, courseId).
    // 3. Marcar la operación como transaccional.
    // 4. Validar estudiante/curso.
    // 5. Evitar matrícula duplicada en la capa de negocio.
    // 6. Recordar que el UNIQUE de PostgreSQL sigue siendo obligatorio.
}
