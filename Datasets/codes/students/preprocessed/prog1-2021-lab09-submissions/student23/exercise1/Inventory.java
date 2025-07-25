public class Inventory {
    private Items[] invItems = new Items[20];

    public void generateInv() {
        for (int i = 0; i < 20; i++) {
            invItems[i] = new Trash("", 0, "");
        }
    }

    public boolean add(Items items) {
        boolean notFullInv = false;
        for (int i = 0; i < 20; i++) {
            if (invItems[i].getName().equals("")) {
                notFullInv = true;
                invItems[i] = items;
                i = 21;
            }
        }
        return notFullInv;
    }

    public String getInvItems(int index) {
        return invItems[index].toString();
    }

    public String getInvItems2(Items items) {
        int pos = -1;
        for (int i = 0; i < 20; i++) {
            invItems.equals(items);
            pos = i;
        }
        return invItems[pos].toString();
    }

    public int drop(Items items) {
        int droped = 0;
        for (int i = 0; i < 20; i++) {
            if (invItems[i].equals(items)) {
                invItems[i] = new Items("", 0, "");
                droped = droped + 1;
            }
        }
        return droped;
    }

    public boolean drop(int index) {
        boolean dropable = false;
        if (!invItems[index].getName().equals("")) {
            invItems[index] = new Items("", 0, "");
            dropable = true;
        }
        return dropable;
    }

    public void use(int index) {
        if (!invItems[index].getName().equals("")) {
            if (invItems[index] instanceof Consumable) {
                ((Consumable) invItems[index]).setUses(((Consumable) invItems[index]).getUses() - 1);
                System.out.println("Used the consumable item " + invItems[index].getName() + " ("
                        + ((Consumable) invItems[index]).getUses() + ")\n");
                if (((Consumable) invItems[index]).getUses() == 0) {
                    System.out.println("The consumable item " + invItems[index].getName() + " has no charges left.");
                    invItems[index] = new Items("", 0, "");
                }
            } else {
                System.out.println("The item " + invItems[index].getName() + " can not be used");
            }
        }

    }

    public boolean sell(int index) {
        boolean sellable = false;
        if (!(invItems[index] instanceof Gear)) {
            invItems[index] = new Items("", 0, "");
            sellable = true;
        }
        return sellable;
    }

}
