package item;

public class ItemShelf {
    private Item item;
    public int itemcode;
    private boolean soldout;

    public void set_item(Item item){
        this.item = item;
    }

    public Item get_item(){
        return this.item;
    }

    public void set_itemcode(int itemcode){
        this.itemcode = itemcode;
    }

    public int get_itemcode(){
        return this.itemcode;
    }

    public boolean is_soldout(){
        return this.soldout;
    }

    public void set_sold(boolean soldout){
        this.soldout = soldout;
    }

}
