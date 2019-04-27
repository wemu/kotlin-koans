package i_introduction._6_Data_Classes

import util.TODO
import util.doc6
import i_introduction._6_Data_Classes.KotlinCode6.Person

fun todoTask6(): Nothing = TODO(
    """
        Convert 'JavaCode6.Person' class to Kotlin.
        Then add a modifier `data` to the resulting class.
        This annotation means the compiler will generate a bunch of useful methods in this class:
        `equals`/`hashCode`, `toString` and some others.
        The `task6` function should return a list of persons.
    """,
    documentation = doc6(),
    references = { JavaCode6.Person("Alice", 29) }
)


fun task6(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

