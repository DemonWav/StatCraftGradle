/*
 * StatCraft Plugin
 *
 * Copyright (c) 2016 Kyle Wood (DemonWav)
 * https://www.demonwav.com
 *
 * MIT License
 */

package com.demonwav.statcraft.listeners

import com.demonwav.statcraft.stats.Blocks
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent

class BlockListener : Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    fun onBlockBreak(event: BlockBreakEvent) {
        Blocks.getInstance().query().primaryType(Blocks.BlockStatType.BROKEN)
            .incrementValue(event.player.uniqueId, event.player.world.uid, event.block.type.name)
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    fun onBlockPlace(event: BlockPlaceEvent) {
        Blocks.getInstance().query().primaryType(Blocks.BlockStatType.PLACED)
            .incrementValue(event.player.uniqueId, event.player.world.uid, event.block.type.name)
    }
}
