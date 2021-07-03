package Sales;

import java.util.List;

public class BubbleShortSales {


    public List<SalesRepresentative> sort(List<SalesRepresentative> salesRepresentativeList) {

        calculateRevenue(salesRepresentativeList);

        int n = salesRepresentativeList.size();
        int i;
        int j;
        SalesRepresentative temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                int value1 = salesRepresentativeList.get(j).getTotalValue();
                int value2 = salesRepresentativeList.get(j+1).getTotalValue();

                if (value1 > value2)
                {
                    temp = salesRepresentativeList.get(j);
                    salesRepresentativeList.set(j, salesRepresentativeList.get(j+1));
                    salesRepresentativeList.set(j+1, temp);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        return salesRepresentativeList;
    }


    public void calculateRevenue(List<SalesRepresentative> salesRepresentativeList) {
        for (SalesRepresentative salesRepresentative : salesRepresentativeList) {
            salesRepresentative.setTotalValue(salesRepresentative.getValueOfProduct() * salesRepresentative.getNumberOfSales());
        }
    }
}
