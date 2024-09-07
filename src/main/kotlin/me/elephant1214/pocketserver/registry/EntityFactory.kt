package me.elephant1214.pocketserver.registry

import me.elephant1214.pocketserver.game.entity.Entity
import me.elephant1214.pocketserver.util.Position

@FunctionalInterface
interface EntityFactory {
    fun create(entityId: Int, position: Position): Entity
}