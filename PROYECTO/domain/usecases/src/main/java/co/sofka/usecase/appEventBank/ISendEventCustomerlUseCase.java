package co.sofka.usecase.appEventBank;


import co.sofka.Event;
import co.sofka.gateway.IRabbitBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ISendEventCustomerlUseCase implements ISendEventCustomerDetailService {

    private static final Logger logger = LoggerFactory.getLogger(ISendEventCustomerlUseCase.class);


    private final IRabbitBus rabbitBus;

    public ISendEventCustomerlUseCase(IRabbitBus rabbitBus) {
        this.rabbitBus = rabbitBus;
    }


    public void save(Event item) {
        rabbitBus.send(item);
    }


}
