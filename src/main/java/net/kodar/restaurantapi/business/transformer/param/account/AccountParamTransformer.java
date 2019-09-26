package net.kodar.restaurantapi.business.transformer.param.account;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.Account;
import net.kodar.restaurantapi.presentation.param.AccountParam;

@Component
public class AccountParamTransformer implements ParamTransformer<AccountParam, Account, Account> {

	@Override
	public Account apply(AccountParam param, Account entity) {
		if (entity == null) {
			entity = new Account();
			entity.setId(param.getId());
		}

		entity.setApiUser(param.getApiUser());
		entity.setLocked(param.isLocked());
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());
		
		return entity;
	}

}
