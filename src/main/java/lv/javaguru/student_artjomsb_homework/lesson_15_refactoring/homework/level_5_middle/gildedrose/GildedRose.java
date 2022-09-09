package lv.javaguru.student_artjomsb_homework.lesson_15_refactoring.homework.level_5_middle.gildedrose;

import java.util.List;

class GildedRose {

	public void updateQuality(List<Item> items) {
		for (Item item : items) {
			if ((!"Aged Brie".equals(item.getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
				if (item.getQuality() > 0) {
					if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
						item.setQuality(item.getQuality() - 1);
					}
				}
			} else {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);

					if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
						if (item.getSellIn() < 11) {
							if (item.getQuality() < 50) {
								item.setQuality(item.getQuality() + 1);
							}
						}

						if (item.getSellIn() < 6) {
							if (item.getQuality() < 50) {
								item.setQuality(item.getQuality() + 1);
							}
						}
					}
				}
			}

			if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
				item.setSellIn(item.getSellIn() - 1);
			}

			if (item.getSellIn() < 0) {
				if (!"Aged Brie".equals(item.getName())) {
					if (!"Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
						if (item.getQuality() > 0) {
							if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
								item.setQuality(item.getQuality() - 1);
							}
						}
					} else {
						item.setQuality(0);
					}
				} else {
					if (item.getQuality() < 50) {
						item.setQuality(item.getQuality() + 1);
					}
				}
			}
		}
	}

}