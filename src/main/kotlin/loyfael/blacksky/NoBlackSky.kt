package loyfael.blacksky

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object NoBlackSky : ModInitializer {
    private val logger = LoggerFactory.getLogger("noblacksky")

	override fun onInitialize() {
		// Le mod NoBlackSky est chargé - supprime le ciel noir sous la couche 63
		logger.info("NoBlackSky mod chargé! Le ciel noir sera supprimé sous la couche 63.")
	}
}