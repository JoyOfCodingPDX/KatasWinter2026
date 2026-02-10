package com.gildedrose;

class GildedRose {
  Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
      for (Item item : items) {
        if (item instanceof Sulfuras) {
          continue;

        } else if (item instanceof AgedBrie agedBrie) {
          agedBrie.updateQuality();
          continue;

        } else if (item instanceof BackstagePass backstagePass) {
            backstagePass.updateQuality();
            continue;
        }

        if (item.quality > 0) {
          item.quality--;
        }

        item.sellIn--;

        if (item.sellIn < 0) {
          if (item.quality > 0) {
            item.quality--;
          }
        }
      }
    }
}
