package com.doctors.repository;

import com.doctors.model.ReservationModel;
import com.doctors.repository.crudrepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<ReservationModel> getAllReservation(){
        return (List<ReservationModel>) reservationCrudRepository.findAll();
    }

    public Optional<ReservationModel> getReservation(Integer id) {
        return reservationCrudRepository.findById((id));
    }

    public ReservationModel saveReservation(ReservationModel reservationModel){
        return reservationCrudRepository.save(reservationModel);
    }

    public void deleteReservation(Integer id){
        reservationCrudRepository.deleteById(id);
    }

    public ReservationModel updateReservation(ReservationModel reservationModel){
        return reservationCrudRepository.save(reservationModel);
    }
}
