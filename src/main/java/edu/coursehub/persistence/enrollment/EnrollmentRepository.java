package edu.coursehub.persistence.enrollment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    boolean existsByStudent_IdAndCourse_Id(Long studentId, Long courseId);

    List<Enrollment> findByStudent_Id(Long studentId);

    long countByStatus(EnrollmentStatus status);
    // TODO-STUDENT S06: consultas JPQL.
    // TODO-STUDENT S11: resolver fetch para evitar N+1.
}
