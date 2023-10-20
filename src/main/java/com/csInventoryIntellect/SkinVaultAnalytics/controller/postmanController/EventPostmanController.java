package com.csInventoryIntellect.SkinVaultAnalytics.controller.postmanController;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Event;
import com.csInventoryIntellect.SkinVaultAnalytics.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postmanEvents")
public class EventPostmanController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<String> createEvents(@RequestBody List<Event> events){

        String output = eventService.createEvents(events);

        return new ResponseEntity<>(output, HttpStatus.OK);
    }

    @GetMapping
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

}
