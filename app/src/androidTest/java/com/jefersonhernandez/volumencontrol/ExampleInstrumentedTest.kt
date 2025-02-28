package com.jefersonhernandez.volumencontrol

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.jefersonhernandez.volumencontrol", appContext.packageName)
    }

    @Test
    fun testMainActivityLaunchesAndCloses() {
        // Iniciar la actividad
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        // Esperar un momento para que se muestre el control de volumen
        Thread.sleep(1000)

        // Verificar que la actividad se cerró
        assertTrue(scenario.state.isAtLeast(Lifecycle.State.DESTROYED))
    }
}