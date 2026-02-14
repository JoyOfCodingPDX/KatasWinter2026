package com.gildedrose;

public class AgedBrie extends InventoriedItem {
  static final String AGED_BRIE = "Aged Brie";

  public AgedBrie(int sellIn, int quality) {
    super(AGED_BRIE, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    if (this.quality < 50) {
      int qualityImprovement = this.sellIn <= 0 ? 2 : 1;
      this.quality = Math.min(this.quality + qualityImprovement, 50);
    }
    this.sellIn--;
  }
}
