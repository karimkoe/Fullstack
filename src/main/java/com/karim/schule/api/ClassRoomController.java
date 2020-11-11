package com.karim.schule.api;

import com.karim.schule.model.ClassRoom;
import com.karim.schule.service.ClassRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/classroom")
@RestController
public class ClassRoomController {

    private final ClassRoomService classRoomService;

    public ClassRoomController(ClassRoomService classRoomService) {
        this.classRoomService =classRoomService;
    }

    @PostMapping
    public void addClassRoom(@RequestBody ClassRoom classRoom) {
        classRoomService.addClassRoom(classRoom);
    }

    @GetMapping
    public List<ClassRoom> getAllClassRooms() {
        return classRoomService.getAllClassRooms();
    }

    @GetMapping(path = "{id}")
    public ClassRoom getClassRoomById(@PathVariable("id") Long id) {
        return classRoomService.getClassRoomById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteClassRoomById(@PathVariable("id") Long id) {
        classRoomService.deleteClassRoomById(id);
    }

    @PutMapping(path = "{id}")
    public void updateClassRoomById(@PathVariable("id") Long id, @RequestBody ClassRoom classRoom) {
        classRoomService.updateClassRoomById(id, classRoom);
    }

}
