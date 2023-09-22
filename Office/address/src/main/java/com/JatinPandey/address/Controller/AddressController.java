package com.JatinPandey.address.Controller;

import com.JatinPandey.address.Payloads.AddressDTO;
import com.JatinPandey.address.ServiceImpl.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/")
    public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO){
        AddressDTO savedAddressDTO = addressService.createAddress(addressDTO);
        return new ResponseEntity<>(savedAddressDTO, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<AddressDTO> getAddressById(@RequestParam long id){
        AddressDTO addressDTO = addressService.getAddressById(id);

        return new ResponseEntity<>(addressDTO,HttpStatus.OK);
    }
}
