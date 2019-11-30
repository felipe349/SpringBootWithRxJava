package br.com.ecommerce.facade;

import br.com.ecommerce.domain.AddressesRequest;
import br.com.ecommerce.domain.AddressesResponse;
import br.com.ecommerce.integration.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.observables.BlockingObservable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CheckoutFacade {

    @Autowired
    private ViaCepService viaCepService;



    public List<AddressesResponse> findAddresByZipCode(AddressesRequest addressesRequest) {
        List<AddressesResponse> addressesResponses = new ArrayList<>();

        if(Objects.nonNull(addressesRequest)){
            List<String> zipcodes = addressesRequest.getZipcodes();
            zipcodes.parallelStream().forEach(zipcode -> {
                AddressesResponse addressByZipCode = viaCepService.findAddressByZipCode(zipcode);
                addressesResponses.add(addressByZipCode);
            });
        }
        return addressesResponses;
    }


}
