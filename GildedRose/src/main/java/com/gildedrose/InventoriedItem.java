package com.gildedrose;

public abstract class InventoriedItem extends Item {
  public InventoriedItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  public abstract void updateQuality();
}
