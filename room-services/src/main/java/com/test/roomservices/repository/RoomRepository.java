package com.test.roomservices.repository;

import com.test.roomservices.model.Room;

import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
    
    Room findByRoomNumber(String roomNumber);

}