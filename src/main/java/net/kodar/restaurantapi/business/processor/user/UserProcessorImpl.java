//package net.kodar.restaurantapi.business.processor.user;
//
//import org.springframework.stereotype.Service;
//
//import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
//import net.kodar.restaurantapi.business.transformer.param.user.UserParamTransformer;
//import net.kodar.restaurantapi.business.transformer.result.user.UserResultTransformer;
//import net.kodar.restaurantapi.data.entities.user.CustomUser;
//import net.kodar.restaurantapi.dataaccess.dao.user.UserDaoImpl;
//import net.kodar.restaurantapi.presentation.param.UserParam;
//import net.kodar.restaurantapi.presentation.result.UserResult;
//
//@Service
//public class UserProcessorImpl extends
//		ProcessorGenericImpl<UserParam, UserResult, Integer, CustomUser, UserDaoImpl, UserParamTransformer, UserResultTransformer>
//		implements UserProcessor{
//
//	@Override
//	public Integer getID(UserParam param) {
//		return param.getId();
//	}
//	
//}
