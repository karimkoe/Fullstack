package com.karim.schule.Repository;


import com.karim.schule.model.ClassRoom;
import com.karim.schule.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClassRoomRepository")
public interface ClassRoomRepository extends JpaRepository<ClassRoom, Long> {



}
