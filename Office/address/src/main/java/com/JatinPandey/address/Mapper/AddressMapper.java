package com.JatinPandey.address.Mapper;


import com.JatinPandey.address.Entity.Address;
import com.JatinPandey.address.Payloads.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface AddressMapper {
    AddressDTO toDto(Address address);

    Address toEntity(AddressDTO addressDTO);
}
