package com.test.reservationbusinessservices.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.reservationbusinessservices.client.impl.GuestServiceFallbackImpl;
import com.test.reservationbusinessservices.domain.Guest;

@FeignClient(value = "GUESTSERVICES", fallback = GuestServiceFallbackImpl.class)
public interface GuestService {

	@GetMapping(value="/guests")
    List<Guest> findAll(@RequestParam(name="emailAddress", required = false)String emailAddress);

    @GetMapping(value = "/guests/{id}")
    Guest findOne(@PathVariable(name="id")long id);
    
}
