package edu.coursehub.persistence.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findByCode(String code);

    boolean existsByCode(String code);

    List<Course> findByDepartment_NameIgnoreCase(String departmentName);
    // TODO-STUDENT S06: JPQL para cursos sin matrículas.
    // TODO-STUDENT S06: consulta nativa PostgreSQL con ILIKE.
}
