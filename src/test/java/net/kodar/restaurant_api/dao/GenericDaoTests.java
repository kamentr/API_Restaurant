package net.kodar.restaurant_api.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.dataaccess.dao.measure.MeasureDaoImpl;
import net.kodar.restaurantapi.dataaccess.repository.MeasureRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class GenericDaoTests {

	@Autowired
	private MeasureDaoImpl dao;

	@MockBean
	private MeasureRepository repository;

	private static Measure VALID_MEASURE;
	
    private static final Long VALID_ID = 1L;

    private static final Long INVALID_ID = -1L;

	private static final String VALID_MEASURE_UNIT = "Kg";
	
	@Before
	public void setUp() {
		VALID_MEASURE = new Measure();
		VALID_MEASURE.setMeasureUnit(VALID_MEASURE_UNIT);
		VALID_MEASURE.setId(VALID_ID);
	}

    @Test
    public void get_givenValidId_ShouldInvokeMeasureRepositoryFindById() {
        when(repository.findById(VALID_ID)).thenReturn(Optional.ofNullable(VALID_MEASURE));

        dao.get(VALID_ID);

        verify(repository, times(1)).findById(VALID_ID);
    }
    
    @Test(expected = Exception.class)
    public void get_givenInvalidId_shouldThrowException() {
        when(repository.findById(INVALID_ID)).thenReturn(null);

        dao.get(INVALID_ID);
    }

    @Test
    public void save_givenValidMeasure_shouldReturnTheCorrectMeasure() {
        when(repository.save(VALID_MEASURE)).thenReturn(VALID_MEASURE);

        Measure savedMeasure = dao.save(VALID_MEASURE);

        assertEquals(repository.save(VALID_MEASURE).getMeasureUnit(), savedMeasure.getMeasureUnit());
    }

    @Test
    public void save_givenNull_shouldReturnNull() {
        when(repository.save(null)).thenReturn(null);

        Measure nullMeasure = dao.save(null);

        assertNull(nullMeasure);
    }

    @Test
    public void update_whenGivenValidMeasure_shouldInvokeRepositorySave() {
        when(repository.findById(VALID_ID)).thenReturn(Optional.of(VALID_MEASURE));
        when(repository.save(VALID_MEASURE)).thenReturn(VALID_MEASURE);

        dao.update(VALID_MEASURE);
        
        verify(repository, times(1)).save(VALID_MEASURE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void delete_whenGivenNull_shouldThrowException() {
        dao.delete(null);
    }

    @Test
    public void deleteById_whenGivenValidId_shouldInvokeRepositoryDeleteById() {
        when(repository.existsById(VALID_ID)).thenReturn(true);
        doNothing().when(repository).deleteById(VALID_ID);

        dao.delete(VALID_ID);

        verify(repository, times(1)).deleteById(VALID_ID);
        verify(repository, times(1)).existsById(VALID_ID);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteById_whenGivenINValidId_shouldInvokeRepositoryDeleteById() {
        when(repository.existsById(VALID_ID)).thenReturn(true);
        doNothing().when(repository).deleteById(VALID_ID);

        dao.delete(INVALID_ID);
    }
    
}
