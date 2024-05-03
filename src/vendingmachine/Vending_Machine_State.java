package vendingmachine;
import java.util.*;
import coin.Coin;
import item.Item;

public class Vending_Machine_State {
    
    public Vending_Machine_State(){
        System.out.println("Vending machine is in idle state");
    }

    public void start(){
        System.out.println("Vending Machine is in running mode!!");
    }

    public void insert_coin(Vending_Machine vm, Coin coin){
        System.out.println("Vending Machine is in hasmoneystate");
        System.out.println("Accepted the coin: "+ coin);
        vm.get_coinlist().add(coin);
    }

    public void choose_product(Vending_Machine vm, int itemcode){
        Item item = vm.get_inventory().get_item(itemcode);
        int amtpaid = 0;
        for(Coin coin : vm.get_coinlist()){
            amtpaid += coin.get_value();
        }
        if(item.get_price() > amtpaid){
            refund_money(vm, amtpaid);
            return;
        }
        else{
            get_change(item.get_price(), amtpaid);
            dispense_product(vm, itemcode);
            return;
        }
    }

    public List<Coin> refund_money(Vending_Machine vm, int amtpaid){
        System.out.println("Return the full amount in coin dispense tray: "+ amtpaid);
        vm.set_vms(new Vending_Machine_State());
        return vm.get_coinlist();
    }

    public void update_inventory(Vending_Machine vm, Item item, int itemcode){
        vm.get_inventory().add_items(item, itemcode);
    }

    public void dispense_product(Vending_Machine vm, int itemcode){
        System.out.println("Currently vending machine is in dipense state");
        System.out.println("product has been dispensed");
        vm.get_inventory().update_soldoutitem(itemcode);
        vm.set_vms(new Vending_Machine_State());
    } 

    public void get_change(int costprice, int amtpaid){
        System.out.println("Return the change: " + (amtpaid-costprice));
    }
}
