package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.WeatherService;
import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class WeatherAlarmNotifierTest {

    private WeatherAlarmNotifier alarmNotifier =
            new WeatherAlarmNotifier(
                    new WeatherService(
                            new TemperatureProvider(),
                            new RainfallProvider(),
                            new WindSpeedProvider()
                    )
            );

    //    WindSpeedProvider windSpeedProvider = mock(WindSpeedProvider.class);
    @Test
    public void testWeatherAlarmNotifier() {


        WeatherAlarmLevel weatherAlarmLevel;
    }

}
