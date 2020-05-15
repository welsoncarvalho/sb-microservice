package com.test.reservationbusinessservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.reservationbusinessservices.business.RoomReservationBusinessProcess;
import com.test.reservationbusinessservices.client.RoomService;
import com.test.reservationbusinessservices.domain.Room;
import com.test.reservationbusinessservices.domain.RoomReservation;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "RoomReservations", description = "Business process service operations on rooms and reservations", tags = {"roomReservations"})
public class RoomReservationController {

	@Autowired
	private RoomService roomService;
	
	@Autowired
	private RoomReservationBusinessProcess businessProcess;
	
	@GetMapping(value = "/rooms")
	@ApiOperation(value = "Get All Rooms", notes = "Gets all rooms in the system", nickname = "getRooms")
	public List<Room> getAllRooms() {
		return roomService.findAll(null);
	}
	
	@GetMapping(value = "/roomReservations/{date}")
	@ApiOperation(value = "Get Room Reservations", notes = "Get all reservations for a specific date", nickname = "getReservationForDate")
	public List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date) {
		return this.businessProcess.getRoomReservationsForDate(date);
	}
	
}
