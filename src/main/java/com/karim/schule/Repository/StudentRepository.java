package com.karim.schule.Repository;

import com.karim.schule.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {

}
