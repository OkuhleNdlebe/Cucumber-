package za.ac.cput.donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.donation.entity.Address;
import za.ac.cput.donation.service.AddressServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/auth/address")
public class AddressController {
    @Autowired
    private AddressServiceImpl service;

    @PostMapping("/update")
    public Address update(@RequestBody Address address) {
        return service.update(address);
    }

    @GetMapping("/find-id/{id}")
    public Address findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping("/find-name/{streetName}")
    public List<Address> findByStreetName(@PathVariable String streetName) {
        return service.findByStreetName(streetName);
    }
}
