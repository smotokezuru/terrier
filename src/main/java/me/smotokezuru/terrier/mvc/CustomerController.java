package me.smotokezuru.terrier.mvc;

import me.smotokezuru.terrier.domain.Customer;
import me.smotokezuru.terrier.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method=GET)
    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }

    @RequestMapping
    public Iterable<Customer> getByLastName(@RequestParam(value="name", required=false, defaultValue="Bauer") String lastName) {
        return customerRepository.findByLastName(lastName);
    }
}