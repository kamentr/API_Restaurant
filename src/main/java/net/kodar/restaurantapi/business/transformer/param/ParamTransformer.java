package net.kodar.restaurantapi.business.transformer.param;


import java.util.function.BiFunction;

public interface ParamTransformer<P, E, N> extends BiFunction<P, E, N> {

}
