package loyfael.blacksky;

public class NoBlackSkyConfig {
    public static final double BLACK_FOG_REMOVAL_THRESHOLD = 64; // Seuil fonctionnel confirmé
    public static final boolean DEBUG_MODE = true;
    
    public static boolean shouldRemoveBlackFog(double playerY) {
        return playerY < BLACK_FOG_REMOVAL_THRESHOLD;
    }
}
