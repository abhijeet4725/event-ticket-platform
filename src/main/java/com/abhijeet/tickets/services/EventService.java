package com.abhijeet.tickets.services;

import com.abhijeet.tickets.domain.CreateEventRequest;
import com.abhijeet.tickets.domain.entites.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest eventRequest);

}
