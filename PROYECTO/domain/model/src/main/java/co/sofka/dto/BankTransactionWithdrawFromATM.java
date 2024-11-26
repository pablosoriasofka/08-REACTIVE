package co.sofka.dto;


import java.math.BigDecimal;

public class BankTransactionWithdrawFromATM extends ParameterSeguridad{

    private String customerId;

    private String accountNumberClient;

    private BigDecimal amount;



    public BankTransactionWithdrawFromATM() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumberClient() {
        return accountNumberClient;
    }

    public void setAccountNumberClient(String accountNumberClient) {
        this.accountNumberClient = accountNumberClient;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
