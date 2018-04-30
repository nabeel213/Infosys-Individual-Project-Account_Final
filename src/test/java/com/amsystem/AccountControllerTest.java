package com.amsystem;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.amsystem.controller.AccountController;
import com.amsystem.model.Account;
import com.amsystem.repository.AccountRepository;

public class AccountControllerTest {
	
	@InjectMocks
	private AccountController ac_controller;
	
	@Mock
	private AccountRepository accountRepository;
	
	@Before
	public void init() {
		
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAccountGet() {
		
		Account ac = new Account();
		ac.setId(1l);
		when(accountRepository.findOne(1l)).thenReturn(ac);
		
		Account account = ac_controller.get(1L);
		
		verify(accountRepository).findOne(1l);
		
		assertThat(account.getId(), is(1l));
		
	}
	
}
