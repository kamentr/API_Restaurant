package net.kodar.restaurantapi.business.transformer.result.account;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.Account;
import net.kodar.restaurantapi.presentation.result.AccountResult;

@Component
public class AccountResultTransformer implements ResultTransformer<Account, AccountResult> {

	@Override
	public AccountResult apply(Account entity) {
		AccountResult result = new AccountResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		result.setApiUser(entity.getApiUser());
		
		return result;
	}

}
