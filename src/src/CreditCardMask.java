package src;

public class CreditCardMask {

    public static String maskify(String cardNumber) {
        if (cardNumber.length() <= 4) {
            return cardNumber;
        }
        String showPart = cardNumber.substring(cardNumber.length()-4);
        return "#".repeat(cardNumber.length()-4) + showPart;
    }
}