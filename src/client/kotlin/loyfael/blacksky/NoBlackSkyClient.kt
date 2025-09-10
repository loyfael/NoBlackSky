package loyfael.blacksky

import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

object NoBlackSkyClient : ClientModInitializer {
    private val logger = LoggerFactory.getLogger("noblacksky-client")
    
	override fun onInitializeClient() {
		logger.info("NoBlackSky client initialisé - Le void fog sera supprimé sous la couche -64!")
	}
}