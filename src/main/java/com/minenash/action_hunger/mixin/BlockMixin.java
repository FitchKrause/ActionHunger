package com.minenash.action_hunger.mixin;

import com.minenash.action_hunger.config.Config;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Block.class)
public class BlockMixin {

    @ModifyArg(method = "afterBreak", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;addExhaustion(F)V", ordinal = 0), index = 0)
    private float actionHunger$changeBreakingBlockExhaustionAmount(float _original) { return Config.breakingBlockExhaustionAmount; }
}
