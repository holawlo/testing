package foo.bar.meteorology.weather;

import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.logging.Logger;

import static org.mockito.Mockito.mock;

class WeatherServiceTest {

    private WeatherService weatherService =
        new WeatherService(
            new TemperatureProvider(),
            new RainfallProvider(),
            new WindSpeedProvider()
        );

    @Test
    void testWeatherService() {
        Weather weather = weatherService.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }


    TemperatureProvider tempMock = mock(TemperatureProvider.class);
    RainfallProvider rainMock = mock(RainfallProvider.class);
    WindSpeedProvider windMock = mock(WindSpeedProvider.class);

    private WeatherService weatherServiceMocked = new WeatherService(tempMock, rainMock, windMock);

    @Test
    void testWeatherServiceMock() {

        Mockito.when(tempMock.getTemperature()).thenReturn(30);
        Mockito.when(rainMock.getRainfallLevel()).thenReturn(10);
        Mockito.when(windMock.getWindSpeed()).thenReturn(100);

        Weather weather = weatherServiceMocked.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }

    WeatherService weatherMock = mock(WeatherService.class);

    @Test
    void testWeatherServiceMockWeather() {

        Mockito.when(weatherMock.getWeather()).thenReturn(new Weather(20,30,30));

        Weather weather = weatherMock.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }


}
