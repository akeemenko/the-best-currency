package com.top.thebestcurrency.di

import com.top.thebestcurrency.activities.ChartActivity
import com.top.thebestcurrency.activities.MainActivity
import com.top.thebestcurrency.chart.LatestChart
import com.top.thebestcurrency.fragments.CurrenciesListFragment
import com.top.thebestcurrency.mvp.presenter.CurrenciesPresenter
import com.top.thebestcurrency.mvp.presenter.LatestChartPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, RestModule::class, MvpModule::class, ChartModule::class])
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)
    fun inject(fragment: CurrenciesListFragment)
    fun inject(chart: LatestChart)
    fun inject(activity: ChartActivity)
}