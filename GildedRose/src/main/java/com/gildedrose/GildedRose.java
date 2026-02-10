package com.gildedrose;

class GildedRose {
  static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
  static final String AGED_BRIE = "Aged Brie";
  Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
      for (Item item : items) {
        if (item instanceof Sulfuras) {
          continue;
        }

        switch (item.name) {
          case AGED_BRIE -> {
            if (item.quality < 50) {
              int qualityImprovement = item.sellIn <= 0 ? 2 : 1;
              item.quality = Math.min(item.quality + qualityImprovement, 50);
            }
            item.sellIn--;
            continue;
          }
          case BACKSTAGE_PASS -> {
            if (item.sellIn <= 0) {
              item.quality = 0;

            } else if (item.quality < 50) {
              int qualityImprovement;
              if (item.sellIn <= 5) {
                qualityImprovement = 3;
              } else if (item.sellIn <= 10) {
                qualityImprovement = 2;
              } else {
                qualityImprovement = 1;
              }
              item.quality = Math.min(item.quality + qualityImprovement, 50);
            }
            item.sellIn--;
            continue;
          }
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
