package com.test.reservationservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.reservationservices.model.ReservationEntity;

import java.sql.Date;
import java.util.List;

/**
 * Created by frankmoley on 5/23/17.
 */
@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
    List<ReservationEntity> findByDate(Date date);
}
