fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }.toMutableList()
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toMutableSet()
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 2]
}