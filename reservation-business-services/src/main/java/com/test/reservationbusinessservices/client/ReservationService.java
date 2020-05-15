package com.test.reservationbusinessservices.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.reservationbusinessservices.domain.Reservation;

@FeignClient(value = "RESERVATIONSERVICES")
public interface ReservationService {

	@GetMapping(value = "/reservations")
    List<Reservation> findAll(@RequestParam(name = "date", required = false) String date);
	
}
