package co.sofka.usecase.appEventBank;


import co.sofka.Event;
import co.sofka.commands.request.BankTransactionBuys;
import co.sofka.generic.DomainEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface ISaveEventTransactionCompraService {
    Flux<DomainEvent> apply(Mono<BankTransactionBuys> item);


}
