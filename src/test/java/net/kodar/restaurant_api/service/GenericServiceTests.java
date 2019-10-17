package net.kodar.restaurant_api.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.processor.measure.MeasureProcessorImpl;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
import net.kodar.restaurantapi.presentation.result.MeasureResult;
import net.kodar.restaurantapi.presentation.service.measure.MeasureService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class GenericServiceTests {
	
    @MockBean
    private MeasureProcessorImpl processor;

    @Autowired
    private MeasureService service;

    @Captor
    ArgumentCaptor<MeasureParam> captor;

    private static final Long VALID_ID = 1L;

    private static final Long INVALID_ID = -1L;

    private static Measure VALID_MEASURE;

    private static MeasureResult VALID_MEASURE_RESULT;

    private static MeasureParam VALID_MEASURE_PARAM;

	private static final String VALID_MEASURE_UNIT = "Kg";

    @Before
    public void setUp() throws Exception {
        VALID_MEASURE = new Measure();
        VALID_MEASURE.setMeasureUnit(VALID_MEASURE_UNIT);
        VALID_MEASURE.setId(VALID_ID);

        VALID_MEASURE_RESULT = new MeasureResult();
        VALID_MEASURE_RESULT.setMeasureUnit(VALID_MEASURE_UNIT);
        VALID_MEASURE_RESULT.setId(VALID_ID);

        VALID_MEASURE_PARAM = new MeasureParam();
        VALID_MEASURE_PARAM.setMeasureUnit(VALID_MEASURE_UNIT);
        VALID_MEASURE_PARAM.setId(VALID_ID);
    }

    @Test
    public void get_givenMeasure_returnsTheCorrectMeasure(){
        when(processor.get(VALID_ID)).thenReturn(VALID_MEASURE_RESULT);

        MeasureResult measureResult = service.get(VALID_ID);

        assertEquals(measureResult.getMeasureUnit(), VALID_MEASURE.getMeasureUnit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_givenInvalidId_ShouldThrowException() {
        when(processor.get(INVALID_ID)).thenThrow(new IllegalArgumentException());
        service.get(INVALID_ID);
    }

    @Test
    public void getAll_givenTwoMeasures_shouldReturnTwoMeasures() {
        List<MeasureResult> measureList =  Arrays.asList(VALID_MEASURE_RESULT, VALID_MEASURE_RESULT);

        when(processor.getAll()).thenReturn(measureList);

        assertEquals(service.getAll().size(), 2);
    }

    @Test
    public void delete_tryToDeleteAMeasure_shouldThrowException() {
        when(processor.get(VALID_ID)).thenReturn(VALID_MEASURE_RESULT);

        service.delete(VALID_ID);
        verify(processor, times(1)).delete(VALID_ID);
    }

    @Test(expected = Exception.class)
    public void update_givenWrongId_ShouldThrowException() throws Exception {
        doThrow(new Exception()).when(processor).update(VALID_MEASURE_PARAM);

        service.update(INVALID_ID, VALID_MEASURE_PARAM);
    }

    @Test
    public void update_givenMeasureToUpdate_ShouldUseTheMeasureProcessorSave() throws Exception {

        doNothing().when(processor).update(VALID_MEASURE_PARAM);

        service.update(VALID_ID, VALID_MEASURE_PARAM);

        verify(processor, times(1)).update(captor.capture());
    }

    @Test(expected = Exception.class)
    public void save_givenMeasureToSave_ShouldUseTheMeasureProcessorSave() throws Exception {

        doNothing().when(processor).save(VALID_MEASURE_PARAM);

        service.save(VALID_MEASURE_PARAM);

        verify(processor, times(1)).save(captor.capture());
    }
}
