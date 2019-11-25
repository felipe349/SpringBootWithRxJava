package br.com.ecommerce.integration;

import br.com.ecommerce.domain.AddressesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    @Autowired
    private  ViaCep viaCep;

    public AddressesResponse findAddressByZipCode(String zipCode) {
        return viaCep.findAddressByZipCode(zipCode);
    }
}
