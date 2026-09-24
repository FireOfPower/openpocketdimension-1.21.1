package net.fireofpower.openpocketdimension.mixins;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import io.redspace.ironsspellbooks.capabilities.magic.PocketDimensionManager;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PocketDimensionManager.class)
public class PocketDimensionSnapDisablerMixin {
    @WrapMethod(method = "tick*")
    public void tick(Level level, Operation<Void> original) {
        //this method is only used for snapping the player, so it's safe to just mixin it empty
        //not very future proof but Iron's probably not gonna modify it for a while anyways...
    }
}
