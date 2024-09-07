package me.elephant1214.alphaserver.util

data class Vec3I(
    var x: Int,
    var y: Int,
    var z: Int,
) {
    operator fun plus(value: Int): Vec3I = this.copy(x + value, y + value, z + value)

    operator fun plusAssign(value: Int) {
        x += value
        y += value
        z += value
    }

    operator fun minus(value: Int): Vec3I = this.copy(x - value, y - value, z - value)

    operator fun minusAssign(value: Int) {
        x -= value
        y -= value
        z -= value
    }

    operator fun times(value: Int): Vec3I = this.copy(x * value, y * value, z * value)

    operator fun timesAssign(value: Int) {
        x *= value
        y *= value
        z *= value
    }

    operator fun div(value: Int): Vec3I = this.copy(x / value, y / value, z / value)

    operator fun divAssign(value: Int) {
        x /= value
        y /= value
        z /= value
    }
}
