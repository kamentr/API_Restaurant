package net.kodar.restaurant_api.transformer.result;

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
import net.kodar.restaurantapi.business.transformer.result.measure.MeasureResultTransformer;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.presentation.result.MeasureResult;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class MeasureResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private MeasureResultTransformer rtr;
	
	private static Measure VALID_MEASURE = null;
	
	@Before
	public void setUp() {
		VALID_MEASURE = new Measure();
		VALID_MEASURE.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidMeasure_ShouldReturnMeasure(){
		MeasureResult result = rtr.apply(VALID_MEASURE);
		
		assertEquals(result.getId(), VALID_MEASURE.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewMeasure(){
		MeasureResult result = rtr.apply(null);
	}
}
