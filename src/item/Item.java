package item;

public class Item {
    private ItemType itemtype;
    private int value;

    public void set_item_type(ItemType itemtype){
        this.itemtype = itemtype;
    }

    public ItemType get_ItemType(){
        return this.itemtype;
    }

    public int get_price(){
        return this.value;
    }

    public void set_price(int value){
        this.value = value;
    }
}
