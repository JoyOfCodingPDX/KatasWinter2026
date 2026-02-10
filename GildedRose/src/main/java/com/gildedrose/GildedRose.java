package com.gildedrose;

class GildedRose {
  static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
  static final String AGED_BRIE = "Aged Brie";
  static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
  Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
      for (Item item : items) {
        switch (item.name) {
          case SULFURAS -> {
            continue;
          }
          case AGED_BRIE -> {
            if (item.quality < 50) {
              int qualityImprovement = item.sellIn <= 0 ? 2 : 1;
              item.quality = Math.min(item.quality + qualityImprovement, 50);
            }
            item.sellIn--;
            continue;
          }
        }

        if (!item.name.equals(BACKSTAGE_PASS)) {
          if (item.quality > 0) {
            item.quality--;
          }
        } else {
          if (item.quality < 50) {
            item.quality++;

            if (item.sellIn <= 10) {
              if (item.quality < 50) {
                item.quality++;
              }
            }

            if (item.sellIn <= 5) {
              if (item.quality < 50) {
                item.quality++;
              }
            }
          }
        }

        item.sellIn--;

        if (item.sellIn < 0) {
          if (!item.name.equals(BACKSTAGE_PASS)) {
            if (item.quality > 0) {
              item.quality--;
            }
          } else {
            item.quality = 0;
          }
        }
      }
    }
}
