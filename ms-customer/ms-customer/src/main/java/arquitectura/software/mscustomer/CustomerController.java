package arquitectura.software.mscustomer;

import arquitectura.software.mscustomer.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/customer")
public class CustomerController {
    private static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    private AccountService accountService;
    @Autowired
    public CustomerController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        LOGGER.info("REQUEST: Iniciando petición del micro-servicio customer servicio: test");
        String result = accountService.test();
        LOGGER.info("RESULTADO DE LA INVOCACION A MS-ACCOUNT: {}", result);
        return new ResponseEntity<>("TEST CUSTOMER " + result, HttpStatus.OK);
    }
}
