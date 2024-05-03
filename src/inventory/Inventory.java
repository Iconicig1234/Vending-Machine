package inventory;
import item.ItemShelf;
import item.Item;

public class Inventory {
    private ItemShelf[] inventory; 

    public Inventory(int n){
        inventory = new ItemShelf[n];
        set_initial_inventory();
    }

    public void set_inventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }

    public ItemShelf[] get_inventory_itemshelf(){
        return this.inventory;
    }

    public void set_initial_inventory(){
        int startcode = 101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf itemshelf = new ItemShelf();
            itemshelf.set_itemcode(startcode);
            itemshelf.set_sold(true);
            inventory[i] = itemshelf;
            startcode++;
        }
    }

    public void add_items(Item item, int itemcode){
        for(ItemShelf shelf : inventory){
            int code = shelf.get_itemcode();
            if(code==itemcode){
            if(shelf.is_soldout()==true){
                shelf.set_item(item);
                shelf.set_sold(false);
            }
            }
        }
    }

    public Item get_item(int itemcode){
        for(ItemShelf shelf : inventory){
            int code = shelf.get_itemcode();
            if(code==itemcode){
                if(shelf.is_soldout()){
                    System.out.println("Sorry!! Item is out of stock");
                    return new Item();
                }
                else{
                    return shelf.get_item();
                }
            }
        }
        System.out.println("Try Again!! Invalid item code");
        return new Item();
    }

    public void update_soldoutitem(int code){
        for(ItemShelf shelf : inventory){
            if(code == shelf.get_itemcode()){
                shelf.set_sold(true);
            }
        }
    }
}
