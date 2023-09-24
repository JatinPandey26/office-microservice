package com.JatinPandey.employee.FeignClients;

import com.JatinPandey.employee.Payloads.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "addressClient" , url = "http://localhost:8002/api/address" )
public interface AddressClient {

    @GetMapping("/")
    AddressDTO getAddressByEmployeeId(@RequestParam long id);

}
