package me.elephant1214.alphaserver.util

data class Position(
    var x: Double,
    var y: Double,
    var z: Double,
    var pitch: Float,
    var yaw: Float,
) {
    operator fun plus(value: Double): Position = this.copy(x + value, y + value, z + value)

    operator fun plus(value: Vec3D): Position = this.copy(x + value.x, y + value.y, z + value.z)

    operator fun plus(value: Vec3I): Position = this.copy(x + value.x, y + value.y, z + value.z)

    operator fun plusAssign(value: Double) {
        x += value
        y += value
        z += value
    }
    
    operator fun plusAssign(value: Int) {
        x += value
        y += value
        z += value
    }

    operator fun minus(value: Double): Position = this.copy(x - value, y - value, z - value)

    operator fun minusAssign(value: Double) {
        x -= value
        y -= value
        z -= value
    }

    operator fun times(value: Double): Position = this.copy(x * value, y * value, z * value)

    operator fun timesAssign(value: Double) {
        x *= value
        y *= value
        z *= value
    }

    operator fun div(value: Double): Position = this.copy(x / value, y / value, z / value)

    operator fun divAssign(value: Double) {
        x /= value
        y /= value
        z /= value
    }
}
