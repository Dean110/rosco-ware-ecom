package com.roscoware.ecom.catalog;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ShoppingCartControllerTest {

	Long cartId = 42L;
	
	@InjectMocks
	private ShoppingCartController underTest;
	@Mock
	private ProductRepository productRepo;
	@Mock
	private CategoryRepository categoryRepo;
	@Mock
	private CartItemRepository cartItemRepo;
	@Mock
	private Product product;
	@Mock
	private Category category;
	@Mock
	private CartItem cartItem;
	@Mock
	private ShoppingCart shoppingCart;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldGetCartITems() {
		when(cartItemRepo.findAll()).thenReturn(Collections.singleton(cartItem));
		Iterable<CartItem> result = underTest.findShoppingCart(0);
		assertThat(result, contains(cartItem));

	}

}
