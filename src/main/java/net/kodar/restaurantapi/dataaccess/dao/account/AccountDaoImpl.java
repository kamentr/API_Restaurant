package net.kodar.restaurantapi.dataaccess.dao.account;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.Account;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class AccountDaoImpl extends DaoGenericImpl<Account, Long> implements AccountDao{

	@Override
	protected Long getId(Account entity) {
		return entity.getId();
	}
}
