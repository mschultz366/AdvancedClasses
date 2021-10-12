class Employee constructor() {
    constructor(name: String,
                position: String,
                salary: Boolean,
                payRate: Double,
                shift: Int) : this()

    private val name: String = "Redrund Grumble"
    private val position: String = "Peon"
    private val salary: Boolean = false
    private var payRate: Double = 9.00
    private val shift: Int = 1

    private fun calculate(hoursIn: Double): Double {

        val pay = payRate

        if (salary) {

            return 90.00
        }

        val shiftPremium = when (shift) {
            1 -> pay
            2 -> pay * 1.05
            3 -> pay * 1.10
            !in 1..3 -> pay
            else -> pay
        }

        if (hoursIn > 40) {
            val leftOver = hoursIn - 40
            val overTimeHours = leftOver * 1.5
            val answer = shiftPremium * (overTimeHours + 40)
            return answer
        } else {
            return shiftPremium * hoursIn
        }
    }

    fun weeklyPay(eName: String,
                  ePosition: String,
                  ePayRate: Double,
                  weeklyHours: Int) {

        payRate = ePayRate

        println(" -- Weekly Invoice -- \n" +
                "Name: $eName\n" +
                "Position: $ePosition\n" +
                "Wage: $$ePayRate\n" +
                "Weekly Pay: $${calculate(weeklyHours.toDouble())}\n")
    }
}