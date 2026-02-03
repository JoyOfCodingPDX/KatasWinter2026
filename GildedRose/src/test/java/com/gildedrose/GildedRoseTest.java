package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Disabled // This needs to be fixed
    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void regularItemHasItsSellInAndQualityDecreasedByOneWhenUpdateQualityIsCalled() {
        Item regularItem = new Item("Regular Item", 10, 20);
        Item[] items = new Item[] {regularItem};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, regularItem.sellIn);
        assertEquals(19, regularItem.quality);
    }

    @Test
    void agedBrieIncreasesInQualityTheOlderItGets() {
        Item agedBrie = new Item("Aged Brie", 2, 0);
        Item[] items = new Item[]{agedBrie};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, agedBrie.sellIn);
        assertEquals(1, agedBrie.quality);
    }

}
