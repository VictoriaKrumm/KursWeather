package com.bignerdranch.android.kursweather

import com.bignerdranch.android.kursweather.API.HoursList
import com.bignerdranch.android.kursweather.Database.*

internal fun WeatherResponseDto.toDomain(): WeatherResponse {
    return WeatherResponse(
        forecast = this.forecast?.toDomain()
    )
}
internal fun ForecastDto.toDomain(): Forecast {
    return Forecast(
        forecastday = this.forecastday?.map {it.toDomain() } as ArrayList<ForecastDay>?
    )}

internal fun ForecastDayDto.toDomain(): ForecastDay {
    return ForecastDay(
        hours = this.hours?.map { it.toDomain() } as ArrayList<HoursList>?
    )

}
internal fun HoursListDto.toDomain(): HoursList {
    return HoursList(
        time = this.time,
        temp_c = this.temp_c,
        wind_kph = this.wind_kph,
        humidity = this.humidity
    )

}
