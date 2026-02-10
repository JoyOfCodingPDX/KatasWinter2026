package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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
        assertThat(regularItem.sellIn, equalTo(9));
        assertThat(regularItem.quality, equalTo(19));
    }

    @Test
    void agedBrieIncreasesInQualityTheOlderItGets() {
        Item agedBrie = new Item(GildedRose.AGED_BRIE, 2, 0);
        Item[] items = new Item[]{agedBrie};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(agedBrie.sellIn, equalTo(1));
        assertThat(agedBrie.quality, equalTo(1));
    }

    @Test
    void agedBrieAtMaxQualityDoesNotIncreaseInQuality() {
        Item agedBrie = new Item(GildedRose.AGED_BRIE, 2, 50);
        Item[] items = new Item[]{agedBrie};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(agedBrie.sellIn, equalTo(1));
        assertThat(agedBrie.quality, equalTo(50));
    }

    @Test
    void afterSellByDateQualityOfAgedBrieIncreasesByTwo() {
        Item agedBrie = new Item(GildedRose.AGED_BRIE, 0, 0);
        Item[] items = new Item[]{agedBrie};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(agedBrie.sellIn, equalTo(-1));
        assertThat(agedBrie.quality, equalTo(2));
    }


    @Test
    void afterSellByDateQualityOfAgedBrieIncreasesByTwoUntilItReaches50() {
        Item agedBrie = new Item(GildedRose.AGED_BRIE, 0, 49);
        Item[] items = new Item[]{agedBrie};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(agedBrie.sellIn, equalTo(-1));
        assertThat(agedBrie.quality, equalTo(50));
    }

    @Disabled("Conjured items are not yet implemented")
    @Test
    void conjuredItemDecreasesInQualityByTwoWhenUpdateQualityIsCalled() {
        Item conjuredItem = new Item("Conjured Mana Cake", 3, 6);
        Item[] items = new Item[]{conjuredItem};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(conjuredItem.sellIn, equalTo(2));
        assertThat(conjuredItem.quality, equalTo(4));
    }

    @Test
    void backstagePassDropsToZeroQualityAfterConcert() {
        Item backstagePass = new Item(GildedRose.BACKSTAGE_PASS, 0, 57);
        Item[] items = new Item[]{backstagePass};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(backstagePass.sellIn, equalTo(-1));
        assertThat(backstagePass.quality, equalTo(0));
    }

    @Test
    void regularItemDegradesTwiceAsFastAfterSellByDate() {
        Item regularItem = new Item("Regular Item", 0, 20);
        Item[] items = new Item[]{regularItem};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(regularItem.sellIn, equalTo(-1));
        assertThat(regularItem.quality, equalTo(18));
    }

    @Disabled("Conjured items are not yet implemented")
    @Test
    void conjuredItemDegradesByTwoPerDay() {
        Item conjuredItem = new Item("Conjured Mana Cake", 10, 20);
        Item[] items = new Item[]{conjuredItem};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(conjuredItem.sellIn, equalTo(9));
        assertThat(conjuredItem.quality, equalTo(18));
    }

    @Test
    void backstagePassIncreasesBy1PerDayWhenMoreThan10DaysAway() {
        Item backstagePass = new Item(GildedRose.BACKSTAGE_PASS, 17, 20);
        Item[] items = new Item[]{backstagePass};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 7; i++) {
            app.updateQuality();
        }
        assertThat(backstagePass.sellIn, equalTo(10));
        assertThat(backstagePass.quality, equalTo(27));
    }

    @Test
    void backstagePassIncreasesBy2PerDayWhen10DaysOrLess() {
        Item backstagePass = new Item(GildedRose.BACKSTAGE_PASS, 10, 20);
        Item[] items = new Item[]{backstagePass};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertThat(backstagePass.sellIn, equalTo(5));
        assertThat(backstagePass.quality, equalTo(30));
    }

    @Test
    void backstagePassStaysAt0QualityWhenAlreadyExpired() {
        Item backstagePass = new Item(GildedRose.BACKSTAGE_PASS, -1, 0);
        Item[] items = new Item[]{backstagePass};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(backstagePass.sellIn, equalTo(-2));
        assertThat(backstagePass.quality, equalTo(0));
    }

    @Test
    void sulfurasNeverChangesInQualityOrSellIn() {
        Item sulfuras = new Item(GildedRose.SULFURAS, 0, 80);
        Item[] items = new Item[]{sulfuras};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(sulfuras.sellIn, equalTo(0));
        assertThat(sulfuras.quality, equalTo(80));
    }

    @Test
    void backstagePassIncreasesBy3PerDayWhen5DaysOrLess() {
        Item backstagePass = new Item(GildedRose.BACKSTAGE_PASS, 5, 20);
        Item[] items = new Item[]{backstagePass};
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 5; i++) {
            app.updateQuality();
        }
        assertThat(backstagePass.sellIn, equalTo(0));
        assertThat(backstagePass.quality, equalTo(35));
    }

    @Test
    void backstagePassAt0SellInDropsToZeroQualityAfterConcert() {
        Item backstagePass = new Item(GildedRose.BACKSTAGE_PASS, 0, 20);
        Item[] items = new Item[]{backstagePass};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(backstagePass.sellIn, equalTo(-1));
        assertThat(backstagePass.quality, equalTo(0));
    }

    @Test
    void sulfurasWithQuality10NeverChanges() {
        Item sulfuras = new Item(GildedRose.SULFURAS, 0, 10);
        Item[] items = new Item[]{sulfuras};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(sulfuras.sellIn, equalTo(0));
        assertThat(sulfuras.quality, equalTo(10));
    }
}
