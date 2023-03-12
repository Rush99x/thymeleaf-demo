package lk.nibm.ead2.mvc.repository;

import lk.nibm.ead2.mvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
