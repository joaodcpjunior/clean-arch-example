package com.joaodcpjunior.cleanarch.entrypoint.consumer;

import com.joaodcpjunior.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.joaodcpjunior.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.joaodcpjunior.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "joaodcpjunior")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.zipCode());
    }
}
