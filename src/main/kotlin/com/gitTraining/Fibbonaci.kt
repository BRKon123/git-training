package com.gitTraining

fun computeFibbonaciNumber(position: Int?): Int {
    var notNullPosition = position
    if (notNullPosition == null) {
        notNullPosition = 1
    }
    if (notNullPosition == 0) return 0
    if (notNullPosition < 0) {
        return computeNegativeFibbonachi(notNullPosition)
    }
    var i = 1
    var j = 1

    if (notNullPosition <= 2) return 1

    var currentPosition = 2
    while (currentPosition < notNullPosition) {
        val temp = i
        i = j
        j += temp
        currentPosition ++
    }
    return j
}

fun computeNegativeFibbonachi(position:Int): Int {
    if (position >= 0) throw Exception("potition must be smaller than zero!")
    val resultIsNegative = position % 2 == 0
    val absoluteResult = computeFibbonaciNumber(-position)
    return if (resultIsNegative) (absoluteResult * -1) else absoluteResult
}
