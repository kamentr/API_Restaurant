package net.kodar.restaurantapi.business.processor.account;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.account.AccountParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.account.AccountResultTransformer;
import net.kodar.restaurantapi.business.validator.account.AccountValidatorImpl;
import net.kodar.restaurantapi.data.entities.Account;
import net.kodar.restaurantapi.dataaccess.dao.account.AccountDaoImpl;
import net.kodar.restaurantapi.presentation.param.AccountParam;
import net.kodar.restaurantapi.presentation.result.AccountResult;

@Service
public class AccountProcessorImpl extends
		ProcessorGenericImpl<AccountParam, AccountResult, Long, Account, AccountDaoImpl, AccountParamTransformer, AccountResultTransformer, AccountValidatorImpl>
		implements AccountProcessor {

	@Override
	public Long getID(AccountParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
