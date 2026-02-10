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
          case BACKSTAGE_PASS -> {
            //- __"Backstage passes"__, like aged brie, increases in `Quality` as its `SellIn` value approaches;
            //	- `Quality` increases by `2` when there are `10` days or less and by `3` when there are `5` days or less but
            //	- `Quality` drops to `0` after the concert
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
