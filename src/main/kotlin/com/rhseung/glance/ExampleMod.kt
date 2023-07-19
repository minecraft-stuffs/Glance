package com.rhseung.glance

import com.rhseung.abstractlib.api.file.path.URI
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ExampleMod : ModInitializer {
	val modId = URI.getModId()
    private val logger = LoggerFactory.getLogger(modId)

	override fun onInitialize() {
		logger.info("modId = $modId")
	}
}