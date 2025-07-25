package lu.uni.programming1.lab8.exercise2;

import java.util.Arrays;

public class OrderList {

    Order[] List1;
    public OrderList(Order[] List1) {
        
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(List1);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderList other = (OrderList) obj;
        if (!Arrays.equals(List1, other.List1))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "OrderList [List1=" + Arrays.toString(List1) + "]";
    }


}
