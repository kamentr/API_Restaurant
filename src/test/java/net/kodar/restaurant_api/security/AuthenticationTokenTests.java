package net.kodar.restaurant_api.security;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
import net.kodar.restaurantapi.presentation.result.MeasureResult;
import net.kodar.restaurantapi.presentation.service.measure.MeasureService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class AuthenticationTokenTests {

	@Autowired
	private MockMvc mvc;

	@Captor
	ArgumentCaptor<MeasureParam> measureParamCaptor;

	@MockBean
	private MeasureService service;

	private static final Long VALID_ID = 1L;

	private static MeasureParam VALID_MEASURE_PARAM;

	private static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	private static final String REQUEST_BODY = "{" + "\"id\": 1,\n" + "\"measureUnit\": \"Test\"" + "}";

	private static final String AUTH_TOKEN = "?token=testToken";

	private static final String URL = "/measure";

	private static final MeasureResult VALID_MEASURE_RESULT = new MeasureResult();

	@Test
	public void findAll_whenRequestedWithValidToken_shouldReturnStatus200Ok() throws Exception {
		when(service.getAll()).thenReturn(null);

		mvc.perform(get(URL + AUTH_TOKEN)).andExpect(status().isOk());
	}

	@Test
	public void get_whenRequestedWithValidToken_shouldReturnStatus200Ok() throws Exception {
		when(service.get(VALID_ID)).thenReturn(null);

		mvc.perform(get(URL + "/" + VALID_ID + AUTH_TOKEN)).andExpect(status().isOk());
	}

	@Test
	public void delete_whenRequestedWithValidToken_shouldReturnStatus200Ok() throws Exception {
		doNothing().when(service).delete(VALID_ID);

		mvc.perform(delete(URL + "/" + VALID_ID + AUTH_TOKEN)).andExpect(status().isOk());
	}

	@Test
	public void post_whenRequestedWithValidToken_shouldReturnStatus405() throws Exception {
		when(service.save(VALID_MEASURE_PARAM)).thenReturn(VALID_MEASURE_RESULT);
		
		mvc.perform(post(URL + "/" + VALID_ID + AUTH_TOKEN).contentType(APPLICATION_JSON_UTF8).content(REQUEST_BODY))
				.andExpect(status().isMethodNotAllowed());
	}

	@Test
	public void update_whenRequestedWithValidToken_shouldReturnStatus200Ok() throws Exception {
		doNothing().when(service).update(VALID_ID, VALID_MEASURE_PARAM);

		mvc.perform(put(URL + "/" + VALID_ID + AUTH_TOKEN).contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON).content(REQUEST_BODY)).andExpect(status().isOk());
	}
}
