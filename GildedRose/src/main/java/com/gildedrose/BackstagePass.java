package com.gildedrose;

public class BackstagePass extends InventoriedItem {
  static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";

  public BackstagePass(int sellIn, int quality) {
    super(BACKSTAGE_PASS, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    if (this.sellIn <= 0) {
      this.quality = 0;

    } else if (this.quality < 50) {
      int qualityImprovement;
      if (this.sellIn <= 5) {
        qualityImprovement = 3;
      } else if (this.sellIn <= 10) {
        qualityImprovement = 2;
      } else {
        qualityImprovement = 1;
      }
      this.quality = Math.min(this.quality + qualityImprovement, 50);
    }
    this.sellIn--;
  }
}
