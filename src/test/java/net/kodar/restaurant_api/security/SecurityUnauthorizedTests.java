package net.kodar.restaurant_api.security;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.data.entities.Measure;
import org.springframework.http.MediaType;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
import net.kodar.restaurantapi.presentation.result.MeasureResult;
import net.kodar.restaurantapi.presentation.service.measure.MeasureService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class SecurityUnauthorizedTests {

	@Autowired
	private MockMvc mvc;

	@Captor
	ArgumentCaptor<MeasureParam> measureParamCaptor;

	@MockBean
	private MeasureService service;

	private static final Long VALID_ID = 1L;

	private static Measure VALID_MEASURE;

	private static MeasureResult VALID_MEASURE_RESULT;

	private static MeasureParam VALID_MEASURE_PARAM;

	private static final String VALID_MEASURE_UNIT = "Kg";

	private static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	private static final String REQUEST_BODY = "{" + "\"id\": 1,\n" + "\"measureUnit\": \"Test\"" + "}";

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
	public void findAll_shouldReturnStatus401Unauthorized() throws Exception {
		when(service.getAll()).thenReturn(Arrays.asList(VALID_MEASURE_RESULT, VALID_MEASURE_RESULT));

		mvc.perform(get("/measure")).andExpect(status().isUnauthorized());
	}

	@Test
	public void get_shouldReturnStatus401Unauthorized() throws Exception {
		when(service.get(VALID_ID)).thenReturn(VALID_MEASURE_RESULT);

		mvc.perform(get("/measure/" + VALID_ID)).andExpect(status().isUnauthorized());
	}

	@Test
	public void delete_whenRequested_shouldReturnStatus401Unauthorized() throws Exception {
		doNothing().when(service).delete(VALID_ID);

		mvc.perform(delete("/measure/" + VALID_ID)).andExpect(status().isUnauthorized());
	}

	@Test
	public void post_whenRequested_shouldReturnStatus401Unauthorized() throws Exception {
		when(service.save(VALID_MEASURE_PARAM)).thenReturn(VALID_MEASURE_RESULT);

		mvc.perform(post("/measure").contentType(APPLICATION_JSON_UTF8).content(REQUEST_BODY))
				.andExpect(status().isUnauthorized());
	}

	@Test
	public void update_givenValidParams_shouldReturnStatus401Unauthorized() throws Exception {
		doNothing().when(service).update(VALID_ID, VALID_MEASURE_PARAM);

		mvc.perform(put("/measure/" + VALID_ID).contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON).content(REQUEST_BODY)).andExpect(status().isUnauthorized());
	}


}
