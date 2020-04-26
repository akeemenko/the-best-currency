package com.top.thebestcurrency.di

import com.top.thebestcurrency.chart.LatestChart
import com.top.thebestcurrency.formatters.YearValueFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ChartModule {
    @Provides
    @Singleton
    fun provideLatestChart() = LatestChart()

    @Provides
    @Singleton
    fun provideYearFormatter() = YearValueFormatter()
}