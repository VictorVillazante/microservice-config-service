package arquitectura.software.mscustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(contextId = "msCustomer", name = "ms-account")
public interface AccountService {
    @RequestMapping(value = "/v1/api/account/test",
            method = RequestMethod.GET)
    String test();
}
