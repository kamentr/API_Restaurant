package net.kodar.restaurantapi.presentation.service.acount;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.account.AccountProcessorImpl;
import net.kodar.restaurantapi.presentation.param.AccountParam;
import net.kodar.restaurantapi.presentation.result.AccountResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("account")
public class AccountService extends ServiceGeneric<AccountParam, AccountResult, Long, AccountProcessorImpl>{

	@Override
	protected Long getId(AccountParam param) {
		return param.getId();
	}
}
