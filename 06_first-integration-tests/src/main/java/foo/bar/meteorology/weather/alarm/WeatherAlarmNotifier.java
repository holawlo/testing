package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;

public class WeatherAlarmNotifier {

    private WeatherService weatherService;

    public WeatherAlarmNotifier(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public WeatherAlarmLevel raiseLevelIfNeccessary() {
        Weather weather = weatherService.getWeather();
        int alarmCounter = 0;
        boolean tempAlarm = false;
        boolean windAlarm = false;
        boolean rainAlarm = false;

        if (weather.getTemprature() > 35) {
            alarmCounter++;
            tempAlarm = true;
        } else if (weather.getRainfall() > 100) {
            alarmCounter++;
            rainAlarm = true;
        } else if (weather.getWindSpeed() > 100) {
            alarmCounter++;
            windAlarm = true;
        }

        if (alarmCounter > 1) {
            return WeatherAlarmLevel.FIRST_LEVEL;
        } else {
            return WeatherAlarmLevel.ALL_OK;
        }
    }
}
