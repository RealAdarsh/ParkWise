package Models;

import Models.enums.PaymentMode;
import Models.enums.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModels{
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Date timeOfPayment;
    private String transactionID;
}
