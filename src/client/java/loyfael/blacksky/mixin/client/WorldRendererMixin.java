package loyfael.blacksky.mixin.client;

import loyfael.blacksky.NoBlackSkyConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.FrameGraphBuilder;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {
    
    // Annuler uniquement le rendu du ciel quand dans le void
    @Inject(method = "renderSky", at = @At("HEAD"), cancellable = true)
    private void onRenderSky(FrameGraphBuilder frameGraphBuilder, Camera camera, float tickDelta, GpuBufferSlice gpuBufferSlice, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            double playerY = client.player.getY();
            
            // Si on est dans le void, annuler le rendu du ciel seulement si sous le seuil
            if (playerY < NoBlackSkyConfig.BLACK_FOG_REMOVAL_THRESHOLD) {
                ci.cancel(); // Annuler complètement le rendu du ciel quand dans le void
            } else if (NoBlackSkyConfig.DEBUG_MODE) {
                System.out.println("[NoBlackSky] Rendu normal du ciel à Y=" + playerY);
            }
        }
    }
}
