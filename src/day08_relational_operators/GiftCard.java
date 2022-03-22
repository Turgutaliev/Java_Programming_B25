package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200;
        System.out.println("buy item 1 for $100");
        giftCard -= 100.70; //giftcard = giftcard -100
        System.out.println("buy item 2 for $40");
        giftCard -= 40;//giftcard = giftcard -40
        System.out.println("Gift Card balance is: $"+giftCard);

        giftCard = giftCard*0.5;
        System.out.println(giftCard);

    }
}
