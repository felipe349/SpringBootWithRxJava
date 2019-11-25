package br.com.ecommerce.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddressesRequest {
    @JsonProperty("zipcodes")
    List<String> zipcodes;
}
