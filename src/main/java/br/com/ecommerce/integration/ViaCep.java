package br.com.ecommerce.integration;

import br.com.ecommerce.domain.AddressesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCepClient",url = "${viaCep}")
public interface ViaCep {

    @GetMapping("ws/{zipcode}/json")
    public AddressesResponse findAddressByZipCode(@PathVariable("zipcode") String zipCode);

}
