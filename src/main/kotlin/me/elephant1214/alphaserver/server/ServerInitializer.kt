package me.elephant1214.alphaserver.server

import me.elephant1214.alphaserver.game.block.Block
import me.elephant1214.alphaserver.game.item.Item
import me.elephant1214.alphaserver.registry.BlockRegistry
import me.elephant1214.alphaserver.registry.EntityRegistry
import me.elephant1214.alphaserver.registry.ItemRegistry
import me.elephant1214.alphaserver.registry.PacketRegistry

object ServerInitializer {
    fun initializeBlocks() {
        BlockRegistry.apply { 
            registerBlock(0, Block("air"))
        }
    }
    
    fun initializeEntities() {
        EntityRegistry.apply { 
            
        }
    }
    
    fun initializeItems() {
        ItemRegistry.apply { 
            registerItem(0, Item("air"))
        }
    }
    
    fun initializePackets() {
        PacketRegistry.apply { 
            
        }
    }
    
    fun initializeAll() {
        initializeBlocks()
        initializeEntities()
        initializeItems()
        initializePackets()
    }
}