package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Event;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.EventRepository;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.PassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private PassRepository passRepository;

    public String createEvents(List<Event> events) {


        for (Event event : events) {

            if (event.getPasses() != null) {

                passRepository.saveAll(event.getPasses());

            }
        }

        eventRepository.saveAll(events);

        return "Added all Events and their Passes (if existing) successfully!";
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}

