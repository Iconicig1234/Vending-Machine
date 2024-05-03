package vendingmachine;
import java.util.*;
import inventory.Inventory;
import coin.Coin;

public class Vending_Machine {
    private Vending_Machine_State vms;
    private Inventory inventory;
    private List<Coin> coinlist;

    public Vending_Machine(){
        vms = new Vending_Machine_State();
        inventory = new Inventory(10);
        coinlist = new ArrayList<>();
    }

    public Vending_Machine_State get_vms(){
        return this.vms;
    }

    public void set_vms(Vending_Machine_State vms){
        this.vms = vms;
    }

    public void set_inventory(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory get_inventory(){
        return this.inventory;
    }

    public List<Coin> get_coinlist(){
        return this.coinlist;
    }

    public void set_coinlist(List<Coin> coinlist){
        this.coinlist = coinlist;
    }
}
