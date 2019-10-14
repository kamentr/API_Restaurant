package net.kodar.restaurantapi.util;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.tomcat.util.codec.binary.Base64;
import org.reflections.ReflectionUtils;
import org.springframework.http.HttpHeaders;

import lombok.var;
import net.kodar.restaurantapi.data.entities.Persistent;

public final class Utils {

	private Utils() {

	}

	public static List<Object> filterListBy(List<?> list, String propName) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

	        List<Object> result = new ArrayList<Object>();
	        
	        for (Object item : list) {
	            Object value = item.getClass().getField(propName).get(item);

	        }
	        
	        return null;//result;

	    }
	
	
	List test() {
		List<Object> list = new ArrayList<Object>();
		
		return null;
	} 

//	listToFilter.stream()
//	.filter(g -> g.getApiUser().getId().equals(user.getId))
//	.forEach(g -> resultList.add(g.getApiGroup()));

}