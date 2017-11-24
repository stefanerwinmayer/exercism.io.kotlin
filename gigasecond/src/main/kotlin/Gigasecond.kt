import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(birthday: LocalDateTime) {
    constructor(birthday: LocalDate) : this(birthday.atStartOfDay())

    val date: LocalDateTime = birthday.plusSeconds(1000000000)
}