package com.test.reservationbusinessservices.client.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.test.reservationbusinessservices.client.GuestService;
import com.test.reservationbusinessservices.domain.Guest;

@Component
public class GuestServiceFallbackImpl implements GuestService {

	@Override
	public List<Guest> findAll(String emailAddress) {
		return Collections.emptyList();
	}

	@Override
	public Guest findOne(long id) {
		Guest guest = new Guest();
		guest.setFirstName("Guest");
		guest.setLastName("Occupied");
		return guest;
	}

}
