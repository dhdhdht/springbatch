package io.springbatch.springbatchlecture;

import org.springframework.batch.item.ItemProcessor;

import java.util.Locale;

public class CustomItemProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {

        customer.setName(customer.getName().toUpperCase());
        return customer;
    }
}
