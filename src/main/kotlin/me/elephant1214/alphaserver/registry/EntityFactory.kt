package me.elephant1214.alphaserver.registry

import me.elephant1214.alphaserver.game.entity.Entity
import me.elephant1214.alphaserver.util.Position

@FunctionalInterface
interface EntityFactory {
    fun create(entityId: Int, position: Position): Entity
}