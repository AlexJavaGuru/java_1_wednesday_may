package lv.javaguru.teacher.lesson_15_refactoring.lessoncode;

import java.util.Map;
import java.util.function.Consumer;

// (x, y) -> x * y
//Predicate - Accepts value -> boolean
//Function  - Accepts value -> result
//Consumer  - Accepts value -> void
//Supplier  - Accepts NONE  -> value
class GildedRose {

    public static final int CONJURED_QUALITY_REDUCER = 2;
    Item[] items;

    Map<String, Consumer<Item>> updaters = Map.of(
        "Aged Brie", this::agedBrieQualityUpdate,
        "Backstage passes to a TAFKAL80ETC concert", this::backStagePassQualityUpdate,
        "Conjured", this::conjuredQualityUpdater
    );

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
                continue;
            }

            updaters.getOrDefault(item.name, this::commonItemQualityUpdate).accept(item);

            item.sellIn--;

            qualityUpdateWhenSellInZero(item);
        }
    }

    private void qualityUpdateWhenSellInZero(Item item) {
        if (item.sellIn < 0) {
            switch (item.name) {
                case "Aged Brie" -> agedBrieQualityUpdate(item);
                case "Backstage passes to a TAFKAL80ETC concert" -> item.quality = 0;
                case "Conjured" -> conjuredQualityUpdater(item);
                default -> commonItemQualityUpdate(item);
            }
        }
    }

    private void conjuredQualityUpdater(Item item) {
        item.quality -= CONJURED_QUALITY_REDUCER;
    }

    private void commonItemQualityUpdate(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void backStagePassQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }

            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
    }

    private void agedBrieQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

}
