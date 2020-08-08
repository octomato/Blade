package com.octomato.injections

import com.octomato.injections.modules.ContextModule
import com.octomato.injections.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Core component is the foundation of all other module's components
 *
 */
@Singleton
@Component(modules = [
    ContextModule::class,
    NetworkModule::class
])
interface CoreComponent {

}
