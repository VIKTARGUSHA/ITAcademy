package by.academy.HomeWork.Deal;

public class BillPrint {
    public BillPrint(Deal deal){
        System.out.println("Deal is done is " + deal.isDone + "\n" +
                "Bueyer: " + deal.buyer + "\n" +
                "Saller: " + deal.saller + "\n" + " \n " +"        CHECK");
        for (Product product : deal.basket){
            System.out.println( product.type + " " + product.name + ": " + product.price
                    + " x " + product.quantity + " = " +product.quantity* product.price );
        }
        System.out.println("Total amount: " + deal.fullPrice);
    }
}
