package com.JatinPandey.address.ServiceInterface;

import com.JatinPandey.address.Payloads.AddressDTO;

public interface AddressServiceInterface {
    public AddressDTO createAddress(AddressDTO addressDTO);

    public AddressDTO getAddressById(Long addressId);

    public AddressDTO getAddressByEmpID(Long empId);


}
