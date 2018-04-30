package com.amsystem;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amsystem.model.Account;
import com.amsystem.repository.AccountRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class AccountRepositoryIntegrationTest {

	@Autowired
	private AccountRepository accountRepository;
	
	@Test
	public void testFindAll() {
		
		List<Account> accounts = accountRepository.findAll();
		assertThat(accounts.size(), is(greaterThanOrEqualTo(0)));
		
	}
	
}
