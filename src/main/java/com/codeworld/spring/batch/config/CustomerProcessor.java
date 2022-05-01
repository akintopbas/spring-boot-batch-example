package com.codeworld.spring.batch.config;

import com.codeworld.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        //if you want to apply some filters you can write below as in the example
        if (customer.getCountry().equals("United States")) {
            return customer;
        }
        else {
            return null;
        }
    }

}
