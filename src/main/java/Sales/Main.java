package Sales;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BubbleShortSales sort = new BubbleShortSales();

        SalesRepresentative salesRepresentative1 = new SalesRepresentative();
        salesRepresentative1.setNumberOfSales(10);
        salesRepresentative1.setValueOfProduct(50);
        SalesRepresentative salesRepresentative2 = new SalesRepresentative();
        salesRepresentative2.setNumberOfSales(5);
        salesRepresentative2.setValueOfProduct(30);
        SalesRepresentative salesRepresentative3 = new SalesRepresentative();
        salesRepresentative3.setNumberOfSales(2);
        salesRepresentative3.setValueOfProduct(100);
        SalesRepresentative salesRepresentative4 = new SalesRepresentative();
        salesRepresentative4.setNumberOfSales(1);
        salesRepresentative4.setValueOfProduct(10);

        List<SalesRepresentative> salesRepresentativeList = new ArrayList<>();
        sort.calculateRevenue(salesRepresentativeList);
        salesRepresentativeList.add(salesRepresentative1);
        salesRepresentativeList.add(salesRepresentative2);
        salesRepresentativeList.add(salesRepresentative3);
        salesRepresentativeList.add(salesRepresentative4);

        List<SalesRepresentative> sortedSales = sort.sort(salesRepresentativeList);

        for (SalesRepresentative sale: salesRepresentativeList) {
            System.out.println(sale.getTotalValue());
        }

    }
}
