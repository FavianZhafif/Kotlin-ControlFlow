fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7 , null , null , null ,11)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
        }
    }
