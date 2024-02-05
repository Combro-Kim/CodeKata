import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val i1 = scanner.nextInt()
    val i2 = scanner.nextInt()
    print(
            if(i1 > i2) ">"
            else if (i1 < i2) "<"
            else "=="
    )
}