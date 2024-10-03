
class Order1 {
    private int OrderID;
    private List<Order> dishes;
}
class OrderItem {
    private String dishName;
    private int quantity;
}
class order {
    public void getDishName() {}
    public void getQuantity() {}
    public void getOrderID() {}
}
class TableCustomer {
    public int tableID;
    public int customerID;
    public void getTableID() {
        System.out.println("Table ID: " + tableID +"把餐送去相应的桌子");

    }
}
class WechatCustomer {
    public String address;
    public boolean takeout;
    public boolean takeout() {
        return takeout;
    }
    public void deliver() {
        if(takeout) {
            System.out.println("食品已经打包，正在送往地址：" + address);
        }else {
            System.out.println("顾客未选择打包，订单已经完成");
        }
    }

}

public class System {
    static PrintStream out;
    private Map<String,Integer> inventory = new HashMap<>();
    private List<com.Dish.java.WechatCustomer> wechatcustomers;

    public void ManageOrder(List<Order> orders , List<com.Dish.java.TableCustomer> customers, List<com.Dish.java.WechatCustomer> wechatcustomers) {
        this.wechatcustomers = wechatcustomers;
        inventory = new HashMap<>();
        Order order = new Order() {
        @Override
        public boolean check(boolean hasIngredients) {
                return false;
         }

        @Override
            public String getDishName() {
                return " ";
            }

            @Override
            public Integer getQuantity() {
                return 0;
            }

            @Override
            public String getOrderID() {
                return " ";
            }
        };
        if(checkInventory(orders)) {
            int orderID = generateOrderID();
            Order Order = null;
            PrintOrder(Order);
        } else {
            com.Dish.java.System.out.println("原料不足，订单取消");
        }
        com.Dish.java.TableCustomer custom1 = new com.Dish.java.TableCustomer() ;
        com.Dish.java.WechatCustomer custom2 = new com.Dish.java.WechatCustomer() ;
        custom1.getTableID();
        custom2.deliver();


    }

    private int generateOrderID() {
        return 1;
    }
    private int getOrderID() {
        return 1;
    }

    private boolean checkInventory(List<Order> orders) {
        for(Order order : orders) {
            String dishName = order.getDishName();
            Integer stock = inventory.get(dishName);
            if (stock!= null && stock >= order.getQuantity()) {
                return true;

            }
private void PrintOrder(Order order) {
System.out.println( "订单编号" +order.getOrderID());
System.out.println( "菜品" +order.getDishName());
}

}
    }
}





