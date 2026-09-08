package edu.coursehub.persistence.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findByCode(String code);

    boolean existsByCode(String code);

    List<Course> findByDepartment_NameIgnoreCase(String departmentName);

    @Query("""
            select c
            from Course c
            where not exists (
                select e.id
                from Enrollment e
                where e.course = c
            )
            order by c.code
            """)
    List<Course> findCoursesWithoutEnrollments();
    // TODO-STUDENT S06: consulta nativa PostgreSQL con ILIKE.
}
