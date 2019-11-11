package net.kodar.restaurant_api.transformer.param;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.transformer.param.measure.MeasureParamTransformer;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.presentation.param.MeasureParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class MeasureParamTransformerTests {

	@Autowired
	private MeasureParamTransformer ptr;
	
	private static Measure VALID_MEASURE = null;
	
	private static MeasureParam PARAM_MEASURE = null;
	
	@Before
	public void setUp() {
		VALID_MEASURE = new Measure();
		PARAM_MEASURE = new MeasureParam();
	}
	
	@Test
	public void apply_whenGivenValidMeasure_ShouldReturnMeasure(){
		Measure result = ptr.apply(PARAM_MEASURE, VALID_MEASURE);
		
		assertEquals(result, VALID_MEASURE);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewMeasure(){
		Measure result = ptr.apply(PARAM_MEASURE, null);
		
		assertEquals(result, VALID_MEASURE);
	}
}
