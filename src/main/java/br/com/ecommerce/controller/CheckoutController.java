package br.com.ecommerce.controller;

import br.com.ecommerce.domain.AddressesRequest;
import br.com.ecommerce.domain.AddressesResponse;
import br.com.ecommerce.facade.CheckoutFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/checkout/v1")
@ApiOperation(value = "Checkout API V1")
public class CheckoutController {

    @Autowired
    private CheckoutFacade checkoutFacade;

    @PostMapping("/addresses")
    @ApiOperation(value = "Returns message addresses")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Sucessfull"),
            @ApiResponse(code = 404, message = "Bad request on the addresses"),
            @ApiResponse(code = 400, message = "Not found addresses"),
            @ApiResponse(code = 500, message = "Internal Server Error: Contact your support") })
    public ResponseEntity<List<AddressesResponse>> findAddresByZipCode(AddressesRequest addressesRequest) {
        List<AddressesResponse> addressesResponse = checkoutFacade.findAddresByZipCode(addressesRequest);
        return new ResponseEntity<>(addressesResponse,HttpStatus.OK);
    }
}
