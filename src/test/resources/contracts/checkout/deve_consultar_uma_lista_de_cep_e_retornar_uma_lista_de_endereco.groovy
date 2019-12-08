package resources.contracts.checkout

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        urlPath '/checkout/v1/addresses'
        body([
                "06813090"
        ])

        headers {
            contentType(applicationJson())
        }
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
    }
}