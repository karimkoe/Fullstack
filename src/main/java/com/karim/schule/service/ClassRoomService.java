package com.karim.schule.service;

import com.karim.schule.Repository.ClassRoomRepository;
import com.karim.schule.model.ClassRoom;
import com.karim.schule.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {

    private final ClassRoomRepository classRoomRepository;


    @Autowired
    public ClassRoomService(@Qualifier("ClassRoomRepository") ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }


    public void addClassRoom(ClassRoom classRoom) {
        classRoomRepository.save(classRoom);
    }

    public void deleteClassRoomById(Long id) {
        if (classRoomRepository.existsById(id)) {
            classRoomRepository.deleteById(id);
        }
    }

    public List<ClassRoom> getAllClassRooms() {
        return classRoomRepository.findAll();
    }

    public ClassRoom getClassRoomById(Long id) {
            return classRoomRepository.getOne(id);
    }

    public void updateClassRoomById(Long id, ClassRoom classroom) {
        if (classRoomRepository.existsById(id)) {
            classRoomRepository.save(classroom);
        }

    }



}
