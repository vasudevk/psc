package io.collections._4_sets;


import org.junit.Test;

import static io.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class ProductCatalogueTest {


    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }

    @Test
    public void shouldFindLightVanProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
    }

    @Test
    public void shouldFindHeavyVanProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));

    }
}