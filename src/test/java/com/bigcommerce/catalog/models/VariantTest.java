package com.bigcommerce.catalog.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.Test;

public class VariantTest {

	@Test
	public void givenSameInstanceWhenTestingEqualityThenReturnTrue() {
		final Variant leftHandVariant = new Variant();
		leftHandVariant.setId("64");
		leftHandVariant.setProductId("113");

		final Variant rightHandVariant = leftHandVariant;

		assertTrue(leftHandVariant.equals(rightHandVariant));
		assertEquals(leftHandVariant.hashCode(), rightHandVariant.hashCode());
	}

	@Test
	public void givenSomeStringWhenTestingEqualityThenReturnFalse() {
		final Variant leftHandVariant = new Variant();
		leftHandVariant.setId(UUID.randomUUID().toString());
		leftHandVariant.setProductId(UUID.randomUUID().toString());

		final String rightHandVariant = "test123";

		assertFalse(leftHandVariant.equals(rightHandVariant));
		assertFalse(leftHandVariant.hashCode() == rightHandVariant.hashCode());
	}

	@Test
	public void givenSameFieldsWhenTestingEqualityThenReturnTrue() {
		final Variant leftHandVariant = new Variant();
		leftHandVariant.setId("64");
		leftHandVariant.setProductId("113");
		leftHandVariant.setSku("ABC030303");
		leftHandVariant.setPrice(BigDecimal.valueOf(30.45));
		leftHandVariant.setUpc("9839537238592");
		leftHandVariant.setMpn("AFFF332");
		leftHandVariant.setInventoryLevel(76);

		final Variant rightHandVariant = new Variant();
		rightHandVariant.setId("64");
		rightHandVariant.setProductId("113");
		rightHandVariant.setSku("ABC030303");
		rightHandVariant.setPrice(BigDecimal.valueOf(30.45));
		rightHandVariant.setUpc("9839537238592");
		rightHandVariant.setMpn("AFFF332");
		rightHandVariant.setInventoryLevel(76);

		assertTrue(leftHandVariant.equals(rightHandVariant));
		assertEquals(leftHandVariant.hashCode(), rightHandVariant.hashCode());
	}

	@Test
	public void givenDifferentFieldWhenTestingEqualityThenReturnFalse() {
		final Variant leftHandVariant = new Variant();
		leftHandVariant.setId("64");
		leftHandVariant.setProductId("113");
		leftHandVariant.setSku("ABC030303");
		leftHandVariant.setPrice(BigDecimal.valueOf(30.45));
		leftHandVariant.setUpc("9839537238592");
		leftHandVariant.setMpn("AFFF332");
		leftHandVariant.setInventoryLevel(76);

		final Variant rightHandVariant = new Variant();
		rightHandVariant.setId("64");
		rightHandVariant.setProductId("113");
		rightHandVariant.setSku("ABC030303");
		rightHandVariant.setPrice(BigDecimal.valueOf(30.45));
		rightHandVariant.setUpc("9839537238592");
		rightHandVariant.setMpn("AFFF332");
		rightHandVariant.setInventoryLevel(75);

		assertFalse(leftHandVariant.equals(rightHandVariant));
		assertFalse(leftHandVariant.hashCode() == rightHandVariant.hashCode());
	}
}