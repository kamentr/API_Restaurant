package net.kodar.restaurantapi.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.reflections.ReflectionUtils;

import net.kodar.restaurantapi.data.entities.Persistent;

public final class Utils {

	private Utils() {

	}

	@SuppressWarnings("unchecked")
	public static <T extends Persistent, R extends Persistent, F extends Persistent> List<R> filterListBy
	(Collection<T> listToFilter, F filterObject, R resultObject)
			throws NoSuchFieldException, SecurityException, IllegalAccessException {

		List<R> resultList = new ArrayList<R>();

		listToFilter.stream().filter(gu -> {
			try {

				Field field = gu.getClass().getDeclaredField("apiUser");
				return ((T) field.get(gu)).getId().equals(filterObject.getId());

			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
				return false;
				
			}
			
		}).forEach(g -> {
			try {

				Field field = g.getClass().getDeclaredField("apiGroup");
				resultList.add((R) field.get(g));

			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			}
		});
		return resultList;
	}

//	listToFilter.stream().filter(g -> g.getApiUser().getId().equals(user.getId)).forEach(g -> resultList.add(g.getApiGroup()));

}
