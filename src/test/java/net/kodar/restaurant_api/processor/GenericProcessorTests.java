package net.kodar.restaurant_api.processor;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.processor.measure.MeasureProcessorImpl;
import net.kodar.restaurantapi.business.transformer.param.measure.MeasureParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.measure.MeasureResultTransformer;
import net.kodar.restaurantapi.business.validator.measure.MeasureValidatorImpl;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.dataaccess.dao.measure.MeasureDaoImpl;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
import net.kodar.restaurantapi.presentation.result.MeasureResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class GenericProcessorTests {

	@Autowired
	private MeasureProcessorImpl processor;

	@MockBean
	private MeasureDaoImpl dao;

	@MockBean
	private MeasureParamTransformer paramTransformer;

	@MockBean
	private MeasureResultTransformer resultTransformer;

	@MockBean
	private MeasureValidatorImpl validator;

	private static Measure VALID_MEASURE;

	@Mock
	private static MeasureParam VALID_PARAM_MEASURE_MOCK;

	private static MeasureParam VALID_PARAM_MEASURE;

	private static MeasureResult VALID_RESULT_MEASURE;

	private static final Long VALID_ID = 1L;

	private static final Long INVALID_ID = -1L;

	private static final String VALID_MEASURE_UNIT = "Kg";

	@Before
	public void setUp() throws Exception {
		VALID_MEASURE = new Measure();
		VALID_MEASURE.setMeasureUnit(VALID_MEASURE_UNIT);
		VALID_MEASURE.setId(VALID_ID);

		VALID_PARAM_MEASURE = new MeasureParam();
		VALID_PARAM_MEASURE.setMeasureUnit(VALID_MEASURE_UNIT);
		VALID_PARAM_MEASURE.setId(VALID_ID);

		VALID_RESULT_MEASURE = new MeasureResult();
		VALID_RESULT_MEASURE.setMeasureUnit(VALID_MEASURE_UNIT);
		VALID_RESULT_MEASURE.setId(VALID_ID);
	}

	@Test
	public void get_givenValidId_shouldInvokeResultTransformer() {
		when(dao.get(VALID_ID)).thenReturn(VALID_MEASURE);
		when(resultTransformer.apply(VALID_MEASURE)).thenReturn(VALID_RESULT_MEASURE);

		processor.get(VALID_ID);

		verify(resultTransformer, times(1)).apply(VALID_MEASURE);
		verify(dao, times(1)).get(VALID_ID);
	}

	@Test(expected = IllegalArgumentException.class)
	public void get_givenInvalidId_shouldThrowException() {

		doThrow(IllegalArgumentException.class).when(dao).get(INVALID_ID);

		processor.get(INVALID_ID);
	}

	@Test
	public void getAll_whenInvoked_shouldInvokeDaoGetAll() {
		when(dao.getAll()).thenReturn(Collections.singletonList(VALID_MEASURE));

		processor.getAll();

		verify(dao, times(1)).getAll();
	}

	@Test
	public void getAll_whenInvoked_shouldInvokeResultTransormer() {
		when(dao.getAll()).thenReturn(Collections.singletonList(VALID_MEASURE));
		when(resultTransformer.apply(VALID_MEASURE)).thenReturn(VALID_RESULT_MEASURE);

		processor.getAll();

		verify(resultTransformer, times(1)).apply(VALID_MEASURE);
	}

	@Test
	public void save_whenInvokedShouldInvokeValidator() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);

		processor.save(VALID_PARAM_MEASURE);

		verify(validator, times(1)).validate(VALID_PARAM_MEASURE);
	}

	@Test
	public void save_whenInvokedShouldInvokeParamTransformer() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);
		when(paramTransformer.apply(VALID_PARAM_MEASURE, null)).thenReturn(VALID_MEASURE);
		processor.save(VALID_PARAM_MEASURE);

		verify(paramTransformer, times(1)).apply(VALID_PARAM_MEASURE, null);
	}

	@Test
	public void save_whenInvokedShouldInvokeResultTransformer() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);
		when(paramTransformer.apply(VALID_PARAM_MEASURE, null)).thenReturn(VALID_MEASURE);
		when(dao.save(VALID_MEASURE)).thenReturn(VALID_MEASURE);

		processor.save(VALID_PARAM_MEASURE);

		verify(resultTransformer, times(1)).apply(VALID_MEASURE);
	}

	@Test
	public void save_whenInvokedShouldInvokeDaoSave() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);
		when(paramTransformer.apply(VALID_PARAM_MEASURE, null)).thenReturn(VALID_MEASURE);

		processor.save(VALID_PARAM_MEASURE);

		verify(dao, times(1)).save(VALID_MEASURE);
	}

	@Test
	public void update_whenInvokedShouldInvokeValidator() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);
		when(dao.get(VALID_ID)).thenReturn(VALID_MEASURE);

		processor.update(VALID_PARAM_MEASURE);

		verify(validator, times(1)).validate(VALID_PARAM_MEASURE);
	}

	@Test
	public void update_whenInvokedShouldInvokeDaoGet() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);
		when(dao.get(VALID_ID)).thenReturn(VALID_MEASURE);

		processor.update(VALID_PARAM_MEASURE);

		verify(dao, times(1)).get(VALID_ID);
	}

	@Test
	public void update_whenInvokedShouldInvokeResultTransformer() {
		doNothing().when(validator).validate(VALID_PARAM_MEASURE);
		when(dao.get(VALID_ID)).thenReturn(VALID_MEASURE);

		processor.update(VALID_PARAM_MEASURE);

		verify(paramTransformer, times(1)).apply(VALID_PARAM_MEASURE, VALID_MEASURE);
	}

	@Test(expected = NullPointerException.class)
	public void update_whenGivenNull_shouldThrowException() {
		processor.update(null);

	}

	@Test
	public void getId_whenCalled_shouldInvokeMeasureGetId() {
		processor.getID(VALID_PARAM_MEASURE_MOCK);

		verify(VALID_PARAM_MEASURE_MOCK, times(1)).getId();
	}
}
