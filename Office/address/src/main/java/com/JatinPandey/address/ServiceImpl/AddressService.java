package com.JatinPandey.address.ServiceImpl;

import com.JatinPandey.address.Entity.Address;
import com.JatinPandey.address.Exceptions.ResourceNotFoundException;
import com.JatinPandey.address.Mapper.AddressMapper;
import com.JatinPandey.address.Payloads.AddressDTO;
import com.JatinPandey.address.Repository.AddressRepository;
import com.JatinPandey.address.ServiceInterface.AddressServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements AddressServiceInterface {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressMapper addressMapper;


    @Override
    public AddressDTO createAddress(AddressDTO addressDTO) {
        Address address = addressMapper.toEntity(addressDTO);
        Address savedAddress = addressRepository.save(address);
        return addressMapper.toDto(savedAddress);
    }

    @Override
    public AddressDTO getAddressById(Long addressId) {
        Address address = addressRepository.findById(addressId).orElseThrow(() -> new ResourceNotFoundException("address","id",addressId));

        return addressMapper.toDto(address);
    }

    @Override
    public AddressDTO getAddressByEmpID(Long empId) {

        return null;
    }
}
