package by.academy.HomeWork.Deal;

public class Shop {
    public static void main(String[] args) {
int numberOfGoods = 3;
User buyer = new User("Afanasiy" , 48 , 1000);
User saller = new User("Albert" , 33 , 200);
Product [] basket = new Product[numberOfGoods];
basket[0] = new Vine(12, "Vine" , 10, "Burgunskoe" , "red" , "semiDry");
        basket[1] = new Vine(5, "Vine" , 15, "Shampanskoe" , "white" , "semiSweet");
        basket[2] = new Chocolate(12, "Vine" , "Alpengolt", 5 , "bitter" , 100);
        Deal deal = new Deal("12:48", buyer, saller, basket, false, numberOfGoods);
        deal.deal();
        buyer.getCheckMoney(deal.fullPrice);
        buyer.buyerPay(deal.fullPrice);
        saller.sallerSold(deal.fullPrice);
        deal.setDone(true);
        BillPrint billPrint = new BillPrint(deal);
    }
}
