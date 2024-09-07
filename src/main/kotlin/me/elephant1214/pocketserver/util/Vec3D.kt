package me.elephant1214.pocketserver.util

data class Vec3D(
    var x: Double,
    var y: Double,
    var z: Double,
) {
    operator fun plus(value: Double): Vec3D = this.copy(x + value, y + value, z + value)

    operator fun plusAssign(value: Double) {
        x += value
        y += value
        z += value
    }

    operator fun minus(value: Double): Vec3D = this.copy(x - value, y - value, z - value)

    operator fun minusAssign(value: Double) {
        x -= value
        y -= value
        z -= value
    }

    operator fun times(value: Double): Vec3D = this.copy(x * value, y * value, z * value)

    operator fun timesAssign(value: Double) {
        x *= value
        y *= value
        z *= value
    }

    operator fun div(value: Double): Vec3D = this.copy(x / value, y / value, z / value)

    operator fun divAssign(value: Double) {
        x /= value
        y /= value
        z /= value
    }
}
