package com.doctors.controller;

import com.doctors.model.ReserveQualificationModel;
import com.doctors.service.ReserveQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservequalifications")
@CrossOrigin(origins = "*")

public class ReserveQualificationController{
    @Autowired
    private ReserveQualificationService reservequalificationService;

    @GetMapping("/all")
    public List<ReserveQualificationModel> getAllReserveQualifications()
    {
        return reservequalificationService.getAllReserveQualifications();
    }

    @GetMapping("/{id}")
    public Optional<ReserveQualificationModel> getReserveQualification(@PathVariable Integer id)
    {
        return reservequalificationService.getReserveQualification(id);
    }

    @PostMapping("/save")
    public ReserveQualificationModel saveReserveQualification(@RequestBody ReserveQualificationModel reservequalificationModel)
    {
        return reservequalificationService.saveReserveQualification(reservequalificationModel);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteReserveQualification(@PathVariable Integer id)
    {
        return reservequalificationService.deleteReserveQualification(id);
    }

    @PutMapping("/update")
    public ReserveQualificationModel updateReserveQualification(@RequestBody ReserveQualificationModel reservequalificationModel)
    {
        return reservequalificationService.updateReserveQualification(reservequalificationModel);
    }
}
