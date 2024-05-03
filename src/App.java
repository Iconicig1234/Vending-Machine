import java.util.*;
import coin.Coin;
import item.*;
import vendingmachine.*;
import inventory.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");

        Vending_Machine vm = new Vending_Machine();
        System.out.println("Fill the inventory!");
        fill_inventory(vm);
        System.out.println("Display of the Inventory!");
        display_inventory(vm);

        Vending_Machine_State vms = vm.get_vms();
        vms.start();

        vms.insert_coin(vm, Coin.TEN);
        vms.insert_coin(vm, Coin.FIFTY);

        vms.choose_product(vm, 102);

    }

    public static void fill_inventory(Vending_Machine vm){
        ItemShelf[] slots = vm.get_inventory().get_inventory_itemshelf();
        for(int i=0; i<slots.length;i++){
            Item item = new Item();
            if(i==0 || i==8){
                item.set_item_type(ItemType.CHIPS);
                item.set_price(10);
            }
            else if(i==1 || i==9){
                item.set_item_type(ItemType.OREO);
                item.set_price(20);
            }
            else if(i==2){
                item.set_item_type(ItemType.COLDDRINK);
                item.set_price(50);
            }
            else if(i==6){
                item.set_item_type(ItemType.JIM_JAM);
                item.set_price(50);
            }
            else if(i==3){
                item.set_item_type(ItemType.PASTRY);
                item.set_price(30);
            }
            else if(i==4){
                item.set_item_type(ItemType.CHOCLATE);
                item.set_price(30);
            }
            else if(i==5){
                item.set_item_type(ItemType.MAGGIE);
                item.set_price(30);
            }
            else if(i==7){
                item.set_item_type(ItemType.JUICE);
                item.set_price(15);
            }
            slots[i].set_item(item);
            slots[i].set_sold(false);
        }
    }

    public static void display_inventory(Vending_Machine vm){
        ItemShelf[] slots = vm.get_inventory().get_inventory_itemshelf();
        for(ItemShelf shelf: slots){
            System.out.println("Itemcode: " + shelf.get_itemcode());
            System.out.println("Item: " + shelf.get_item().get_ItemType());
            System.out.println("Itemprice: "+ shelf.get_item().get_price());
            System.out.println("IsAvailable: "+ !shelf.is_soldout());
        }
    }
}
