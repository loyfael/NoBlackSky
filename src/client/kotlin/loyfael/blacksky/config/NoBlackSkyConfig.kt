package loyfael.blacksky.config

object NoBlackSkyConfig {
    // Couche Y en dessous de laquelle le black fog est supprimé
    // Valeur par défaut : -64 (limite du monde)
    const val BLACK_FOG_REMOVAL_THRESHOLD = -64.0
    
    // Si true, affiche des messages de debug dans la console
    const val DEBUG_MODE = true
    
    fun shouldRemoveBlackFog(playerY: Double): Boolean {
        return playerY > BLACK_FOG_REMOVAL_THRESHOLD
    }
}
